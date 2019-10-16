package com.spring.hibernate.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.hibernate.model.Customer;
@Repository
@Transactional
public class CustomerDAOImpl implements CustomerDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	

	public void saveCustomer(Customer theCustomer) {
		Session currentSession=sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(theCustomer);
	}

	@SuppressWarnings("unchecked")
	public List<Customer> retrivefromDb() {
		Session currentSession=sessionFactory.getCurrentSession();
		List<Customer> customerList=currentSession.createQuery("from Customer").list();
		return customerList;
	}

}
