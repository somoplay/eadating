package com.somoplay.somoplay.domain;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "user_verify")
public class UserVerify {

	private int id;
	private String emailVerifyCode;
	private Date emailVerifyExpire;
	private String phoneVerifyCode;
	private Date phoneVerifyExpire;
	private String passwordVerifyKey;
	private String passwordResetKey;
	private Date passwordResetExpire;
	private String userName;
	private String email;
	private String passwordHash;
	private String passwordSalt;	
	private byte active;
	
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name = "email_verify_code")
	public String getEmailVerifyCode() {
		return emailVerifyCode;
	}
	public void setEmailVerifyCode(String emailVerifyCode) {
		this.emailVerifyCode = emailVerifyCode;
	}
	
	@Temporal(TemporalType.DATE)
	@Column(name = "email_verify_expire")
	public Date getEmailVerifyExpire() {
		return emailVerifyExpire;
	}
	public void setEmailVerifyExpire(Date date) {
        Calendar cal = Calendar.getInstance();  
        cal.setTime(date);  
        cal.add(Calendar.DATE , 1);  
        this.emailVerifyExpire = cal.getTime();  
	}
	
	@Column(name = "phone_verify_code")
	public String getPhoneVerifyCode() {
		return phoneVerifyCode;
	}
	public void setPhoneVerifyCode(String phoneVerifyCode) {
		this.phoneVerifyCode = phoneVerifyCode;
	}
	
	@Temporal(TemporalType.DATE)
	@Column(name = "phone_verify_expire")
	public Date getPhoneVerifyExpire() {
		return phoneVerifyExpire;
	}
	public void setPhoneVerifyExpire(Date phoneVerifyExpire) {
		this.phoneVerifyExpire = phoneVerifyExpire;
	}
	
	@Column(name = "password_verify_key")
	public String getPasswordVerifyKey() {
		return passwordVerifyKey;
	}
	public void setPasswordVerifyKey(String passwordVerifyKey) {
		this.passwordVerifyKey = passwordVerifyKey;
	}
	
	@Column(name = "password_reset_key")
	public String getPasswordResetKey() {
		return passwordResetKey;
	}
	public void setPasswordResetKey(String passwordResetKey) {
		this.passwordResetKey = passwordResetKey;
	}
	
	@Temporal(TemporalType.DATE)
	@Column(name = "password_reset_expire")
	public Date getPasswordResetExpire() {
		return passwordResetExpire;
	}
	public void setPasswordResetExpire(Date passwordResetExpire) {
		this.passwordResetExpire = passwordResetExpire;
	}
	
	@Column(name = "user_name", unique = true)
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	@Column(unique = true)
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public byte getActive() {
		return active;
	}
	public void setActive(byte active) {
		this.active = active;
	}
	
	@Column(name = "password_hash")
	public String getPasswordHash() {
		return passwordHash;
	}
	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}
	
	@Column(name = "password_salt")
	public String getPasswordSalt() {
		return passwordSalt;
	}
	public void setPasswordSalt(String passwordSalt) {
		this.passwordSalt = passwordSalt;
	}
	
}
