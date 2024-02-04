package com.myLearning.springApp.service;

import java.util.List;

import com.myLearning.springApp.bo.CustomerDetails;

public interface ICustomerService {
	
	public String registerCustomer(CustomerDetails customer);
	
	public List<CustomerDetails> getAllCustomer();

}
