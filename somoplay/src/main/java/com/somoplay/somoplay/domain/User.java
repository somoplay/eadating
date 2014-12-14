package com.somoplay.somoplay.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "user")
public class User {
//test
	private int id;
	private String userName;
	private byte gender;
	private Date birthday;
	private String firstName;
	private String lastName;
	private int referralNumber;
	private String passwordHash;
	private String passwordSalt;
	private String email;
	private byte emailVerified;
	private String phoneCountryCode;
	private String phoneNumber;
	private byte phoneVerified;
	private byte loginMethod;
	private byte online;
	private byte active;
	private byte admin;
	private byte banned;
	private int loginTimes;
	private int creditPoints;
	private int coins;
	private Date deletedTS;
	private Date updatedTS;
	private Date createdTS;
	
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name = "user_name")
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public byte getGender() {
		return gender;
	}
	public void setGender(byte gender) {
		this.gender = gender;
	}
	
	@Temporal(TemporalType.DATE)
	@Column(name = "birthday")
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	@Column(name = "first_name")
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	@Column(name = "last_name")
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Column(name = "referral_number")
	public int getReferralNumber() {
		return referralNumber;
	}
	public void setReferralNumber(int referralNumber) {
		this.referralNumber = referralNumber;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Column(name = "email_is_verified")
	public byte getEmailVerified() {
		return emailVerified;
	}
	public void setEmailVerified(byte emailVerified) {
		this.emailVerified = emailVerified;
	}
	
	@Column(name = "phone_country_code")
	public String getPhoneCountryCode() {
		return phoneCountryCode;
	}
	public void setPhoneCountryCode(String phoneCountryCode) {
		this.phoneCountryCode = phoneCountryCode;
	}
	
	@Column(name = "phone_number")
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	@Column(name = "phone_is_verified")
	public byte getPhoneVerified() {
		return phoneVerified;
	}
	public void setPhoneVerified(byte phoneVerified) {
		this.phoneVerified = phoneVerified;
	}
	
	@Column(name = "login_method")
	public byte getLoginMethod() {
		return loginMethod;
	}
	public void setLoginMethod(byte loginMethod) {
		this.loginMethod = loginMethod;
	}
	public byte getOnline() {
		return online;
	}
	public void setOnline(byte online) {
		this.online = online;
	}
	public byte getActive() {
		return active;
	}
	public void setActive(byte i) {
		this.active = i;
	}
	public byte getAdmin() {
		return admin;
	}
	public void setAdmin(byte admin) {
		this.admin = admin;
	}
	public byte getBanned() {
		return banned;
	}
	public void setBanned(byte banned) {
		this.banned = banned;
	}
	
	@Column(name = "login_times")
	public int getLoginTimes() {
		return loginTimes;
	}
	public void setLoginTimes(int loginTimes) {
		this.loginTimes = loginTimes;
	}
	
	@Column(name = "credit_points")
	public int getCreditPoints() {
		return creditPoints;
	}
	public void setCreditPoints(int creditPoints) {
		this.creditPoints = creditPoints;
	}
	public int getCoins() {
		return coins;
	}
	public void setCoins(int coins) {
		this.coins = coins;
	}
	
	@Temporal(TemporalType.DATE)
	@Column(name = "deleted_ts")
	public Date getDeletedTS() {
		return deletedTS;
	}
	public void setDeletedTS(Date deletedTS) {
		this.deletedTS = deletedTS;
	}
	
	@Temporal(TemporalType.DATE)
	@Column(name = "updated_ts")
	public Date getUpdatedTS() {
		return updatedTS;
	}
	public void setUpdatedTS(Date updatedTS) {
		this.updatedTS = updatedTS;
	}
	
	@Temporal(TemporalType.DATE)
	@Column(name = "created_ts")
	public Date getCreatedTS() {
		return createdTS;
	}
	public void setCreatedTS(Date createdTS) {
		this.createdTS = createdTS;
	}
	
	
}
