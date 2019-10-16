package com.spring.hibernate.service;

import java.util.List;

import com.spring.hibernate.model.Customer;

public interface CustomerService {
	public void saveCustomer(Customer theCUstomer);
	
	public List<Customer> retrivefromDb();

}
