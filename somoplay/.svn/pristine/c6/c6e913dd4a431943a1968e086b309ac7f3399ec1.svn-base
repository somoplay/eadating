package com.somoplay.somoplay.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.somoplay.somoplay.domain.UserVerify;

@Repository
public interface UserVerifyRepository  extends PagingAndSortingRepository<UserVerify, Integer>{
	
	public UserVerify findByUserName(String userName);
	
	public UserVerify findByEmail(String email);

	
}