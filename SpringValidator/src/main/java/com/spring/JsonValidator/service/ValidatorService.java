package com.spring.JsonValidator.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.JsonValidator.model.Rule;
import com.spring.JsonValidator.repository.ValidatorDao;
@Service
public class ValidatorService {
	
	@Autowired
	ValidatorDao validatorDao;

	public List<Rule> fetchFromDb() {
		List<Rule> rules=validatorDao.findAll();
			return rules;
	}

	public void saveOnDb(Rule rule) {
		validatorDao.save(rule);
		
	}


}
