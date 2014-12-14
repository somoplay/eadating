package com.somoplay.somoplay.service;

import java.util.List;

import com.somoplay.somoplay.domain.Store;

public interface StoreService {
	
	public List<Store> findAll();
	
	public Store findById(Long id);
	
	public List<Store> findByType(Integer content);
	
	public List<Store> findByKeyword(String content);
	
	public List<Store> findByAverage(Integer content);
	
	public List<Store> findByDistance(Integer content);
		
	public Store save(Store store);
	
	public void delete(Store store);

}
