/**
 * 
 */
package com.spring.hibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.hibernate.dao.JsonValidatorDAO;
import com.spring.hibernate.model.Rule;

/**
 * @author admin
 *
 */
@Service
public class JsonValidatorServiceImpl implements JsonValidatorService {

	@Autowired
	private JsonValidatorDAO jsonValidatorDAO;

	@Transactional
	public void saveRule(Rule rule) {

		jsonValidatorDAO.saveRule(rule);
	}

	@Override
	public List<Rule> retrivefromDb() {
		List<Rule> list = jsonValidatorDAO.retrivefromDb();
		return list;
	}

}
