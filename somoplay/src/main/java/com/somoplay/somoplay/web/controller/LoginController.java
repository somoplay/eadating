package com.somoplay.somoplay.web.controller;

import java.security.NoSuchAlgorithmException;

import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.somoplay.somoplay.domain.User;
import com.somoplay.somoplay.domain.UserVerify;
import com.somoplay.somoplay.service.UserService;
import com.somoplay.somoplay.service.UsersVerifyService;
import com.somoplay.somoplay.tools.MD5Encrypt;
import com.somoplay.somoplay.tools.EmailUtil;


@Controller
@SessionAttributes("username")
public class LoginController {

	@Autowired
	private UsersVerifyService userVerifyService;
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String getRegistrationform(Model model){
		model.addAttribute("UsersVerify", new UserVerify());
		return "login/registration-form";
	}

	
    //Before start up, need to change the email address and password as class properties in tools/sendEmail.class.	
	@RequestMapping(value = "/sendEmail", method = RequestMethod.POST)
	public ModelAndView sendVerifyEmail (UserVerify usersVerify) throws NoSuchAlgorithmException{
		ModelAndView mav = new ModelAndView();
		if(userVerifyService.findByEmail(usersVerify.getEmail()) == null){
			if(userVerifyService.findByUserName(usersVerify.getUserName()) == null){
				usersVerify.setEmailVerifyCode(MD5Encrypt.encode2hex(usersVerify.getEmail()));
				usersVerify.setEmailVerifyExpire(new Date());
				
				String passwordSalt = MD5Encrypt.getSalt();
				String passwordHash = MD5Encrypt.encode2hex(usersVerify.getPasswordSalt()+passwordSalt);						
				usersVerify.setPasswordSalt(passwordSalt); 
				usersVerify.setPasswordHash(passwordHash);				
				userVerifyService.save(usersVerify);
				
				EmailUtil.sendRegister(usersVerify.getEmail(), usersVerify.getEmailVerifyCode());
				mav.setViewName("login/result");
				mav.addObject("msg", "PLZ check your email to active your account");
				return mav;
			}else {
				mav.setViewName("login/result");
				mav.addObject("msg", "username already exist");
				return mav;
			}
		}else {
			mav.setViewName("login/result");
			mav.addObject("msg", "email already exist");
			return mav;
		}
	}

	
   //这里还有一步没做：需要定期检查，将注册了但没激活的用户信息删除/注册与否，userverify的信息都要删除。
   //还有，跳转页面内容也需要重新做。		
	@RequestMapping(value = "active", method = RequestMethod.GET)
	public ModelAndView active(String email, String emailverifycode, Model model) throws NoSuchAlgorithmException{
		ModelAndView mav = new ModelAndView("login/result");
		UserVerify usersVerify = userVerifyService.findByEmail(email);
		if(usersVerify != null){
			if(usersVerify.getActive() == 0){
				Date currentTime = new Date();
				if(currentTime.before(usersVerify.getEmailVerifyExpire())){
					if(emailverifycode.equals(usersVerify.getEmailVerifyCode())){
						usersVerify.setActive((byte) 1);
						userVerifyService.save(usersVerify);
						
						User user = new User();				
						user.setUserName(usersVerify.getUserName());
						user.setEmail(email);	
						user.setPasswordSalt(usersVerify.getPasswordSalt()); 
						user.setPasswordHash(usersVerify.getPasswordHash());
						user.setActive((byte) 1);
						userService.save(user);

						mav.setViewName("home");
						return mav;
					}else {
						mav.addObject("msg", "email verify code is wrong");
						return mav;
					}
				}else {
					mav.addObject("msg", "too late");
					return mav;
				}
			}else {
				mav.addObject("msg", "already active");
				return mav;
			}
		}else {
			mav.addObject("msg", "user not exist");
			return mav;
		}
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model){
		model.addAttribute("User", new User());
		return "login/login-form";
	}
	
	

// Error handling, if error, log in times still accumulate...
//login可以通过email或者username，而且属于同一个input没有区分，所以这里要先判断是通过email还是username	
	@RequestMapping(value = "verifyInfo", method = RequestMethod.POST)
	public String verifyInfo(User user, Model model){
		User u1 = userService.findByEmail(user.getEmail());
		User u2 = userService.findByUserName(user.getEmail());
		if(u1 != null){
			String passwordWithSalt = user.getPasswordSalt() + u1.getPasswordSalt();
			String password_hash = MD5Encrypt.encode2hex(passwordWithSalt);
			if(password_hash.equals(u1.getPasswordHash())){
				model.addAttribute("username", u1.getUserName());
				u1.setOnline((byte) 1);
				int login_times = u1.getLoginTimes();
				u1.setLoginTimes(++login_times);
				userService.save(u1);
				if(login_times == 1){
					model.addAttribute("User", u1);
					return "login/fulfill-profile";
				}
				return "home";
			}else {
				model.addAttribute("msg", "password_not_match");
				return "login/result";
			}
		}
		else if(u2 != null){
			String passwordWithSalt = user.getPasswordSalt() + u2.getPasswordSalt();
			String passwordHash = MD5Encrypt.encode2hex(passwordWithSalt);
			if(passwordHash.equals(u2.getPasswordHash())){
				model.addAttribute("username", u2.getUserName());		
				u2.setOnline((byte) 1);
				int login_times = u2.getLoginTimes();
				u2.setLoginTimes(++login_times);
				userService.save(u2);
				if(login_times == 1){
					model.addAttribute("User", u2);					
					return "login/fulfill-profile";
				}
				return "home";
			}else {
				model.addAttribute("msg", "password_not_match");
				return "login/result";
			}
		}else {
			model.addAttribute("msg", "account_not_exist");
			return "login/result";
		}
	}	

	@RequestMapping(value = "prereset", method = RequestMethod.GET)
	public String reset(){
		return "login/reset";
	}
	
	@RequestMapping(value = "resetverify", method = RequestMethod.POST)
	public ModelAndView resetVerify(@RequestParam("email") String email, @RequestParam("codep") String codep, HttpSession session) {  
	    ModelAndView mav=new ModelAndView();  
	    User user = userService.findByEmail(email);
	    if (!(codep.equalsIgnoreCase(session.getAttribute("code").toString()))) {
	        mav.setViewName("login/result");  
	        mav.addObject("msg","Verification Code wrong");  
	        return mav;  
	    }else if(user == null ){
	    	mav.setViewName("login/result");
	        mav.addObject("msg","User not exist");  
	        return mav;
	    }else {
	    	EmailUtil.sendReset(email, user.getPasswordHash());
	    	mav.setViewName("login/result");
	        mav.addObject("msg","Please check your email to reset password");  
	        return mav;
	    }
	}  
	
	@RequestMapping(value = "reset", method = RequestMethod.GET)
	public ModelAndView reset(String email, String password_hash){
	    ModelAndView mav=new ModelAndView(); 
	    User user = userService.findByEmail(email);
		if(user != null){
			if(user.getPasswordHash().equals(password_hash)){
				mav.setViewName("login/reset-form");
				mav.addObject("email", email);
				return mav;
			}else{
				mav.setViewName("login/result");
				mav.addObject("msg", "You have no access to reset password");
				return mav;
			}
		}else{
			mav.setViewName("login/result");
			mav.addObject("msg", "Email not exist");
			return mav;
		}
	}

//reset 后users and userverify have different passwords，但userverify的pw只在激活的时候有用；而且userverify的信息应该要删除。
// need one more step: validation to make sure the confirm password is the same with password;
	
	@RequestMapping(value = "resetConfirm", method = RequestMethod.POST)
	public String resetConfirm(@RequestParam Map<String,String> requestParams, Model model) throws NoSuchAlgorithmException{
		String email = requestParams.get("email");
		String password = requestParams.get("password");
		String confirmPW = requestParams.get("confirmPW");
		if (password.equals(confirmPW)){
			User user = userService.findByEmail(email);
			String passwordSalt = user.getPasswordSalt();
			String passwordWithSalt = password + passwordSalt;
			String passwordHash = MD5Encrypt.encode2hex(passwordWithSalt);		
			user.setPasswordSalt(passwordSalt);
			user.setPasswordHash(passwordHash);
			userService.save(user);
	
			model.addAttribute("User", new User());
			return "login/login-form";			
		}else return "PLZ confirm your new password";
		// need one more step: validation to make sure the confirm password is the same with password;
	}
}

// ********* mapper for mybatis
// see Entity.java, not use understore in attribute name
// naming convention, no understore in function name

// register has image error, identify table
// put android project in 

/*
 * 
--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(100) NOT NULL,
  `gender` tinyint(1) NOT NULL DEFAULT '0',
  `birthday` date DEFAULT NULL,
  `first_name` varchar(60) DEFAULT NULL,
  `last_name` varchar(60) DEFAULT NULL,
  `referral_number` int(11) NOT NULL DEFAULT '0',
  `password_hash` varchar(40) NOT NULL,
  `password_salt` varchar(40) NOT NULL DEFAULT '',
  `email` varchar(100) NOT NULL DEFAULT '',
  `email_is_verified` tinyint(1) NOT NULL DEFAULT '0',
  `phone_country_code` varchar(10) DEFAULT '',
  `phone_number` varchar(15) DEFAULT '',
  `phone_is_verified` tinyint(1) NOT NULL DEFAULT '0',
  `login_method` tinyint(3) NOT NULL DEFAULT '0',
  `online` tinyint(1) NOT NULL DEFAULT '0',
  `active` tinyint(1) NOT NULL DEFAULT '0',
  `admin` tinyint(1) NOT NULL DEFAULT '0',
  `banned` tinyint(1) NOT NULL DEFAULT '0',
  `login_times` int(11) NOT NULL DEFAULT '0',
  `credit_points` int(11) NOT NULL DEFAULT '0',
  `deleted_ts` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `updated_ts` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `created_ts` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `coins` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=UTF8;



--
-- Table structure for table `users_verify`
--

DROP TABLE IF EXISTS `users_verify`;

CREATE TABLE `users_verify` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `emailverifycode` varchar(255) DEFAULT '',
  `emailverifyexpire` date DEFAULT NULL,
  `phone_verify_code` varchar(255) DEFAULT '',
  `password_verify_key` varchar(255) DEFAULT '',
  `password_reset_key` varchar(255) DEFAULT '',
  `password_reset_expires` date DEFAULT NULL,
  `username` varchar(255) NOT NULL DEFAULT '',
  `email` varchar(255) NOT NULL DEFAULT '',
  `phone_verify_expire` date DEFAULT NULL,
  `active` tinyint(11) NOT NULL DEFAULT '0',
  `password_hash` varchar(255) NOT NULL DEFAULT '',
  `password_salt` varchar(255) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=UTF8;

 */
