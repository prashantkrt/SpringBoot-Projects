package com.myLearning.springApp.dao;

import org.springframework.data.repository.CrudRepository;
import com.myLearning.springApp.bo.CustomerDetails;

public interface ICustomerDao extends CrudRepository<CustomerDetails, Integer>{
	

}
