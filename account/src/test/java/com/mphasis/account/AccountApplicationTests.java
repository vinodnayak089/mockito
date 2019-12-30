package com.mphasis.account;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mphasis.account.model.AccountModel;
import com.mphasis.account.repository.AccountRepository;
import com.mphasis.account.service.AccountService;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
class AccountApplicationTests {
	
	@InjectMocks
	AccountService accountService;

//	@Mock
//	AccountRepository accountRepository;
//	
	@Autowired
	AccountRepository accountRepository;
	
	@BeforeEach
	
	void setUp() throws Exception{
		MockitoAnnotations.initMocks(this);
	}
	
//	private static final String acc="1";
	@Test
	public void findall()
	{
		AccountModel accountModel= new AccountModel();
		
		accountModel.setAcc("1");
		accountModel.setName("vinod");
		accountModel.setBranch("hyd");
		
		accountRepository.save(accountModel);
		
		List<AccountModel> account=(List<AccountModel>) accountRepository.findAll();
        assertEquals(accountModel.getName(), account.get(2).getName());
        assertEquals(accountModel.getAcc(), account.get(0).getAcc());
        assertEquals(accountModel.getBranch(), account.get(1).getBranch());



//	       
//		 List<DepartmentEntity> departments = departmentDAO.getAllDepartments();
//	        List<EmployeeEntity> employees = employeeDAO.getAllEmployees();
//	         
//	        Assert.assertEquals(1, departments.size());
//	        Assert.assertEquals(1, employees.size());
//	         
//	        Assert.assertEquals(department.getName(), departments.get(0).getName());
//	        Assert.assertEquals(employee.getEmail(), employees.get(0).getEmail());
//	    }
		
	}

	

}
