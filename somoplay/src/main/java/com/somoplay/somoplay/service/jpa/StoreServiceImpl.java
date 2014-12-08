package com.somoplay.somoplay.service.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.common.collect.Lists;
import com.somoplay.somoplay.domain.Store;
import com.somoplay.somoplay.repository.StoreRepository;
import com.somoplay.somoplay.service.StoreService;

@Service("storeService")
@Repository
@Transactional
public class StoreServiceImpl implements StoreService {
	
	@Autowired
	private StoreRepository entryRepository;
	@PersistenceContext
	private EntityManager em;

	@Override
	@Transactional(readOnly=true)
	public List<Store> findAll() {
		return Lists.newArrayList(entryRepository.findAll());
	}

	@Override
	@Transactional(readOnly=true)
	public Store findById(Long id) {
		return entryRepository.findOne(id);
	}

	@Transactional(readOnly=true)
	public List<Store> findByKeyword(String content){
		List<Store> queries = em.createNamedQuery("Store.findByKeyword", Store.class).setParameter("content", "%"+content+"%").setFirstResult(0).setMaxResults(10).getResultList();
		return queries;
	}
	
	@Transactional(readOnly=true)
	public List<Store> findByType(Integer content){
		List<Store> queries = em.createNamedQuery("Store.findByType", Store.class).setParameter("content", content).setFirstResult(0).setMaxResults(10).getResultList();
		return queries;
	}
	
	@Transactional(readOnly=true)
	public List<Store> findByAverage(Integer content){
		List<Store> queries = em.createNamedQuery("Store.findByAverage", Store.class).setParameter("content", content).getResultList();
		return queries;
	}
	
	@Transactional(readOnly=true)
	public List<Store> findByDistance(Integer content){
		List<Store> queries = em.createNamedQuery("Store.findByDistance", Store.class).setParameter("content", content).setFirstResult(0).setMaxResults(10).getResultList();
		return queries;
	}

	@Override
	public void delete(Store entry) {
		entryRepository.delete(entry);
	}

	@Override
	public Store save(Store entry) {
		// TODO Auto-generated method stub
		return null;
	}
}