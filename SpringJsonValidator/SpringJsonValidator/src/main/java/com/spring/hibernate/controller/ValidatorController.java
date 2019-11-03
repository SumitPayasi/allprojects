package com.spring.hibernate.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.hibernate.model.JsonDataUtility;
import com.spring.hibernate.model.Rule;



/**
 * This is the Controller for Rest API
 * 
 * @author Sumit Payasi
 * @version 1.0.0
 *
 */
@Controller
@CrossOrigin
@RequestMapping("/api")
public class ValidatorController {

	private static final Logger Log = LoggerFactory.getLogger(ValidatorController.class);


	@PostMapping(path = "/saves/{formName}", consumes = "application/json", produces = "appliation/json")
	public ResponseEntity<String> saveRule1(@RequestBody List<Rule> rules, @PathVariable String formName) {
		Log.info("Inside ValidatorController's saveRule method, passing json: {}", rules);
		JsonDataUtility.createJsonFile(rules,formName);

		Log.info("Saved whole json in File and exiting from saveRule method");

		return ResponseEntity.status(HttpStatus.OK).build();
	}
	@GetMapping(path = "/fetchfromDb/{formName}")
	@ResponseBody
	public List<Rule> retrivefromDb(@PathVariable String formName) {
		Log.info("Inside ValidatorController retrivefromDb medhod");
		List<Rule> rules = JsonDataUtility.jsontoObject(formName);
		Log.info("Exiting retrivefromDb method returning json response: {} ", rules);
		return rules;
		
	}
}
	
