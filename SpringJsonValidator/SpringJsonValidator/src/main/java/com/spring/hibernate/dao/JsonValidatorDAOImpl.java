package com.spring.hibernate.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.hibernate.model.Rule;

@Repository
@Transactional
public class JsonValidatorDAOImpl implements JsonValidatorDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private final Logger Log=LoggerFactory.getLogger(JsonValidatorDAOImpl.class);
	

	@Override
	public void saveRule(Rule rule) {
		Log.debug("inside JsonValidatorDAOImpl saveRule(), creating session object");
		Session currentSession=sessionFactory.getCurrentSession();
		//currentSession.delete(rule);
		//currentSession.remove(rule);
		//currentSession.createQuery("delete from Rule").executeUpdate();
		//deleteAll();
		currentSession.saveOrUpdate(rule);
		Log.info("Rules have been saved");
	}

	/*
	 * public void deleteAll() { Log.debug("inside deleteAll() of DAOImpl");
	 * List<Rule> rulelist=retrivefromDb(); Session
	 * currentSession=sessionFactory.getCurrentSession(); for(Rule r:rulelist) {
	 * currentSession.createQuery("delete from Rule").executeUpdate();; }
	 * currentSession.clear();
	 * 
	 * }
	 */

	@SuppressWarnings("unchecked")
	public List<Rule> retrivefromDb() {
		Log.info("Inside JsonValidatorDAOImpl retrivefromDb(), creating sessin object ");
		Session currentSession=sessionFactory.getCurrentSession();
		List<Rule> rulelist=currentSession.createQuery("from Rule").list();
		Log.info("Returning List of rules from DB: {}",rulelist);
		return rulelist;
	}

}
