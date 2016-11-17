package com.dante.commerce.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import com.dante.commerce.model.Account;

public interface AccountRepository extends CrudRepository<Account, Long> {

	Page<Account> findByTitleLike(String title, Pageable pageable);
}
