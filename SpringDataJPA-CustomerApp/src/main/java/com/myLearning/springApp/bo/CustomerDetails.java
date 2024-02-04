package com.myLearning.springApp.bo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Customer_Details")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="City")
	private String city;
	
	@Column(name="Date")
	private LocalDateTime dob;
	
	@Column(name = "billing_date")
	private LocalTime billingDate;
	
	@Column(name = "register_date")
	private LocalDate registerDate;

	public CustomerDetails(String name, String city, LocalDateTime dob, LocalTime billingDate, LocalDate registerDate) {
		super();
		this.name = name;
		this.city = city;
		this.dob = dob;
		this.billingDate = billingDate;
		this.registerDate = registerDate;
	}
	
}
