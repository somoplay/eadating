package com.somoplay.somoplay.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.somoplay.somoplay.domain.IdentityDating;

public interface IdentityDatingRepository extends
		PagingAndSortingRepository<IdentityDating, Long> {

}