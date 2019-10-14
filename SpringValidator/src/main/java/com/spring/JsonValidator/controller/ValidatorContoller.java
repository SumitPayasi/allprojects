package com.spring.JsonValidator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.JsonValidator.model.Rule;
import com.spring.JsonValidator.service.ValidatorService;

@RestController
@CrossOrigin
@RequestMapping("/validate")
public class ValidatorContoller {
	
	@Autowired
	ValidatorService validatorService;
	
	@GetMapping(path = "/retrive"/* ,consumes="application/json", produces="application/json" */)
	public List<Rule> fetchFromDb() {
		List<Rule> rules=validatorService.fetchFromDb();
		return rules;	
	}
	
	@PostMapping(path="/save",consumes="application/json", produces="application/json")
	public ResponseEntity<String> saveOnDb(@RequestBody Rule rule){
		validatorService.saveOnDb(rule);
		return new ResponseEntity<String>(HttpStatus.OK);
		
	}
	/*
	 * @PostMapping(path="/saves",consumes="application/json",
	 * produces="application/json") public ResponseEntity<String>
	 * saveOnDb(@RequestBody Rules rule){ validatorService.saveOnDb(rule); return
	 * new ResponseEntity<String>(HttpStatus.OK);
	 * 
	 * }
	 */

}
