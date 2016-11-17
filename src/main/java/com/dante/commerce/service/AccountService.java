package com.dante.commerce.service;

import org.springframework.data.domain.Page;

import com.dante.commerce.model.Account;

public interface AccountService {

	Page<Account> findAll(int page, int size);

	Page<Account> findByTitleLike(String title, int page, int size);

	Account findById(Long id);

	Account insert(Account account);

	Account update(Account account);

	void deleteById(Long id);
}
