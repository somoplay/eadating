package com.somoplay.somoplay.tools;

import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.stereotype.Component;
//
@Component
public class EmailUtil {
	
    public static final String HOST = "smtp.gmail.com";  
    public static final String PROTOCOL = "smtp";
    public static final String FROM = "ruixiangxiaochu@gmail.com";//需要更改 ????
    public static final String PWD = "dengjing2224713";//需要更改

    private static Session getSession() {  
        Properties props = new Properties();  
        props.put("mail.smtp.host", HOST);
        props.put("mail.store.protocol" , PROTOCOL);
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth" , "true");  
          
        Authenticator authenticator = new Authenticator() {  
  
            @Override  
            protected PasswordAuthentication getPasswordAuthentication() {  
                return new PasswordAuthentication(FROM, PWD);  
            }  
              
        };  
        Session session = Session.getDefaultInstance(props , authenticator);  
          
        return session;  
    }  
      
    public static void send(String toEmail , String content, String title) {  
        Session session = getSession();  
        try {  
            System.out.println("--send--"+content);  
            Message msg = new MimeMessage(session);  
            msg.setFrom(new InternetAddress(FROM));  
            msg.setRecipients(Message.RecipientType.TO,InternetAddress.parse(toEmail));
            msg.setSubject(title);  
            msg.setSentDate(new Date());  
            msg.setContent(content , "text/html;charset=utf-8");  
   
            Transport.send(msg);  
        }  
        catch (MessagingException mex) {  
            mex.printStackTrace();  
        }  
    }
    
    public static void sendRegister(String email , String emailVerifyCode ){
        StringBuffer content=new StringBuffer("here is the email content send by Xiaohui Lu</br>");  
        content.append("<a href=\"http://localhost:8080/somoplay/active?email=");  
        content.append(email);   
        content.append("&emailverifycode=");   
        content.append(emailVerifyCode);  
        content.append("\">http://localhost:8080/somoplay/active?email=");   
        content.append(email);  
        content.append("&emailverifycode=");  
        content.append(emailVerifyCode);  
        content.append("</a>");            
        
        String title = "Register Active Email";
        EmailUtil.send(email, content.toString(), title);
    }
    
    public static void sendReset(String email, String password_hash){
        StringBuffer content=new StringBuffer("Click the link to reset your password</br>");  
        content.append("<a href=\"http://localhost:8080/somoplay/reset?email=");  
        content.append(email);   
        content.append("&password_hash=");   
        content.append(password_hash);  
        content.append("\">http://localhost:8080/somoplay/reset?email=");   
        content.append(email);  
        content.append("&password_hash=");  
        content.append(password_hash);  
        content.append("</a>");            
        
        String title = "Password Reset Email";
        EmailUtil.send(email, content.toString(), title);    	
    }
}  

