package com.myLearning.springApp.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.myLearning.springApp.bo.CustomerDetails;
import com.myLearning.springApp.dao.ICustomerDao;

@Repository
public class CustomerServiceImplementation implements ICustomerService {

	@Autowired
	ICustomerDao repo;

	@Override
	public String registerCustomer(CustomerDetails customer) {		
        repo.save(customer);
        return "Successfully registered";
	}

	@Override
	public List<CustomerDetails> getAllCustomer() {		
		return (List<CustomerDetails>) repo.findAll();
	}
	
}
