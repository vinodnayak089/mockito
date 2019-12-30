package com.mphasis.account.service;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringRunner;
import com.mphasis.account.model.AccountModel;
import com.mphasis.account.repository.AccountRepository;

@RunWith(SpringRunner.class)
public class TestAccountService {

	@InjectMocks
	AccountService accountService;

    @Mock
    AccountRepository accountRepository;
    
	  	@Test
	    public void testfindall() {
	    AccountModel accountModel= new AccountModel();
		accountModel.setAcc("134");
		accountModel.setName("vinod");
		accountModel.setBranch("hyde");
		
		List<AccountModel> account= new ArrayList<>();
		account.add(accountModel);
		
		System.out.println(account);
		
	    Mockito.when(accountService.findAll()).thenReturn(account);
		
		assertEquals(account, accountService.findAll());
	}
}
