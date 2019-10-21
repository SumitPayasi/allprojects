package com.spring.hibernate.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.hibernate.model.Rule;

@Repository
@Transactional
public class JsonValidatorDAOImpl implements JsonValidatorDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	

	@Override
	public void saveRule(Rule rule) {
		Session currentSession=sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(rule);
	}

	@SuppressWarnings("unchecked")
	public List<Rule> retrivefromDb() {
		Session currentSession=sessionFactory.getCurrentSession();
		List<Rule> rulelist=currentSession.createQuery("from Rule").list();
		return rulelist;
	}

}
