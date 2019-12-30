package com.mphasis.account.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphasis.account.model.AccountModel;
import com.mphasis.account.repository.AccountRepository;
@Service
public class AccountService {

	@Autowired
	private AccountRepository accountRepository;
	
	public AccountRepository getAccountRepository() {
		return accountRepository;
	}

	public void setAccountRepository(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}

	public List<AccountModel> findAll() {
		return (List<AccountModel>) accountRepository.findAll();
	}

	public void add(AccountModel accountModel) {
		// TODO Auto-generated method stub
		 accountRepository.save(accountModel);
	}

	

	public void update(AccountModel accountModel, String acc) {
		// TODO Auto-generated method stub
		accountRepository.save(accountModel);
	
	}

	public void delete(AccountModel acc) {

		accountRepository.delete(acc);
	}

	public Optional<AccountModel> findId(String acc) {
		// TODO Auto-generated method stub
		return accountRepository.findById(acc);
	}

	

	
	

}
