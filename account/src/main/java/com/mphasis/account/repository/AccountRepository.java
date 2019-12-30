package com.mphasis.account.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mphasis.account.model.AccountModel;

@Repository
public interface AccountRepository extends CrudRepository<AccountModel, String>{


}
