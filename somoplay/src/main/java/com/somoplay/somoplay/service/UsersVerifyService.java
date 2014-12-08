package com.somoplay.somoplay.service;

import com.somoplay.somoplay.domain.UserVerify;

public interface UsersVerifyService {

	public UserVerify findByUserName(String userName);
	
	public UserVerify findByEmail(String email);
	
	public void save(UserVerify usersverify);
	
	public void delete(UserVerify usersverify);
}
