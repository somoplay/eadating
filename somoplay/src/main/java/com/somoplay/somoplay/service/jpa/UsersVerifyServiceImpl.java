package com.somoplay.somoplay.service.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.somoplay.somoplay.domain.UserVerify;
import com.somoplay.somoplay.repository.UserVerifyRepository;
import com.somoplay.somoplay.service.UsersVerifyService;


@Service
public class UsersVerifyServiceImpl implements UsersVerifyService {

	@Autowired
	private UserVerifyRepository usersVerifyRepository;
	
	@Override
	@Transactional(readOnly=true)
	public UserVerify findByUserName(String userName){
		return usersVerifyRepository.findByUserName(userName);
	};
	
	@Override
	@Transactional(readOnly=true)
	public UserVerify findByEmail(String email){
		return usersVerifyRepository.findByEmail(email);
	};

	//
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void save(UserVerify usersverify){
		usersVerifyRepository.save(usersverify);
	}
	
	@Override
	@Transactional
	public void delete(UserVerify usersverify){
		usersVerifyRepository.delete(usersverify);
	};
	
}
