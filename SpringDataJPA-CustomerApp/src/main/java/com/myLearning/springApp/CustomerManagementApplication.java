package com.myLearning.springApp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.myLearning.springApp.bo.CustomerDetails;
import com.myLearning.springApp.service.CustomerServiceImplementation;

@SpringBootApplication
public class CustomerManagementApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(CustomerManagementApplication.class, args);

		CustomerServiceImplementation service = context.getBean(CustomerServiceImplementation.class);
		
		System.out.println(service.registerCustomer(new CustomerDetails("Pratap","Jabalpur",LocalDateTime.of(1997, 03,8,14,0),LocalTime.of(12,0),LocalDate.now())));	
		
		List<CustomerDetails> list = service.getAllCustomer();
		list.forEach(i->System.out.println(i));
		context.close();
	}

}
