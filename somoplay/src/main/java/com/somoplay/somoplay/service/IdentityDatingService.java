package com.somoplay.somoplay.service;

import java.util.List;

import com.somoplay.somoplay.domain.IdentityDating;

public interface IdentityDatingService  {
	
	public List<IdentityDating> findAll();
	
	public IdentityDating findById(Long id);
	
	public List<IdentityDating> findByType(Integer content);
	
	public List<IdentityDating> findByKeyword(String content);
	
	public List<IdentityDating> findByDistance(Integer content);
		
	public IdentityDating save(IdentityDating entry);
	
	public void delete(IdentityDating entry);
	//

}
