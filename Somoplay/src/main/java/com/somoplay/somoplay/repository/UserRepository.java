package com.somoplay.somoplay.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.somoplay.somoplay.domain.User;

@Repository
public interface UserRepository  extends PagingAndSortingRepository<User, Integer>{
	
	public User findByUserName(String username);
	
	public User findByEmail(String email);
}
