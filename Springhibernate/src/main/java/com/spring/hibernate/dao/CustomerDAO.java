package com.spring.hibernate.dao;

import java.util.List;

import com.spring.hibernate.model.Customer;

public interface CustomerDAO {
	
	public void saveCustomer(Customer theCustomer);
	
	public List<Customer> retrivefromDb();
	

}
