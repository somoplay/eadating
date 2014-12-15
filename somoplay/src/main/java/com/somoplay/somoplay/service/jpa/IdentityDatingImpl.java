package com.somoplay.somoplay.service.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.common.collect.Lists;
import com.somoplay.somoplay.domain.IdentityDating;
import com.somoplay.somoplay.repository.IdentityDatingRepository;
import com.somoplay.somoplay.service.IdentityDatingService;

@Service("identityDatingService")
@Repository
@Transactional
public class IdentityDatingImpl implements IdentityDatingService {

	@Autowired
	private IdentityDatingRepository identityDatingRepository;
	@PersistenceContext
	private EntityManager em;

	@Override
	@Transactional(readOnly = true)
	public List<IdentityDating> findAll() {
		return Lists.newArrayList(identityDatingRepository.findAll());
	}

	@Override
	@Transactional(readOnly = true)
	public IdentityDating findById(Long id) {
		return identityDatingRepository.findOne(id);
	}

	@Transactional(readOnly = true)
	public List<IdentityDating> findByKeyword(String content) {
		List<IdentityDating> queries = em
				.createNamedQuery("IdentityDating.findByKeyword",
						IdentityDating.class)
				.setParameter("content", "%" + content + "%").setFirstResult(0)
				.setMaxResults(10).getResultList();
		return queries;
	}

	@Transactional(readOnly = true)
	public List<IdentityDating> findByType(Integer content) {
		List<IdentityDating> queries = em
				.createNamedQuery("IdentityDating.findByType",
						IdentityDating.class).setParameter("content", content)
				.setFirstResult(0).setMaxResults(10).getResultList();
		return queries;
	}

	@Transactional(readOnly = true)
	public List<IdentityDating> findByDistance(Integer content) {
		List<IdentityDating> queries = em
				.createNamedQuery("IdentityDating.findByDistance",
						IdentityDating.class).setParameter("content", content)
				.setFirstResult(0).setMaxResults(10).getResultList();
		return queries;
	}

	@Override
	public void delete(IdentityDating entry) {
		identityDatingRepository.delete(entry);
	}

	@Override
	public IdentityDating save(IdentityDating entry) {
		// TODO Auto-generated method stub
		return null;
	}

}
