package com.dante.commerce.service.impl;

import javax.inject.Inject;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.transaction.annotation.Transactional;

import com.dante.commerce.model.Account;
import com.dante.commerce.repository.AccountRepository;
import com.dante.commerce.service.AccountService;

public class AccountServiceImpl implements AccountService {
	@Inject
	protected AccountRepository accountRepository;

	@Override
	@Transactional(readOnly = true)
	public Page<Account> findAll(int page, int size) {
//		Pageable pageable = new PageRequest(page, size, new Sort(Direction.DESC, "id"));
//		Page<Account> Accounts = accountRepository.findAll(pageable);
//		return Accounts;
		return null;
	}

	@Override
	@Transactional(readOnly = true)
	public Page<Account> findByTitleLike(String title, int page, int size) {
		Pageable pageable = new PageRequest(page, size, new Sort(Direction.DESC, "id"));
		String q = "%" + title + "%";
		Page<Account> Accounts = accountRepository.findByTitleLike(q, pageable);
		return Accounts;
	}

	@Override
	@Transactional(readOnly = true)
	public Account findById(Long id) {
		Account Account = accountRepository.findOne(id);
		return Account;
	}

	@Override
	@Transactional
	public Account insert(Account Account) {
		return accountRepository.save(Account);
	}

	@Override
	@Transactional
	public Account update(Account Account) {
		return accountRepository.save(Account);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		accountRepository.delete(id);
	}
}
