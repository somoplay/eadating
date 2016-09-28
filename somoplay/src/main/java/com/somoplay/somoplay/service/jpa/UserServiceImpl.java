package com.somoplay.somoplay.service.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.somoplay.somoplay.domain.User;
import com.somoplay.somoplay.repository.UserRepository;
import com.somoplay.somoplay.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	@Transactional(readOnly=true)
	public User findByUserName(String userName){
		return userRepository.findByUserName(userName);
	};
	//
	@Override
	@Transactional(readOnly=true)
	public User findByEmail(String email){
		return userRepository.findByEmail(email);
	};

	
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void save(User user){
		userRepository.save(user);
	}
	
	@Override
	@Transactional
	public void delete(User user){
		userRepository.delete(user);
	};	
	
}
