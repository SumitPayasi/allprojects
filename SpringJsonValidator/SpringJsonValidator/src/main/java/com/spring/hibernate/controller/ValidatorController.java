package com.spring.hibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.hibernate.model.Rule;
import com.spring.hibernate.service.JsonValidatorService;

@Controller
@CrossOrigin
@RequestMapping("/api")
public class ValidatorController {

	@Autowired
	private JsonValidatorService jsonValidatorService;

	@PostMapping(path = "/save", consumes = "application/json", produces = "appliation/json")
	public ResponseEntity<String> saveRule(@RequestBody Rule rule) {
		jsonValidatorService.saveRule(rule);
		return ResponseEntity.status(HttpStatus.OK).build();
	}

	@PostMapping(path = "/saves", consumes = "application/json", produces = "appliation/json")
	public ResponseEntity<String> saveRule(@RequestBody List<Rule> rules) {
		rules.forEach(rule -> {
			jsonValidatorService.saveRule(rule);
		});

		return ResponseEntity.status(HttpStatus.OK).build();
	}

	@GetMapping(path = "/fetchfromDb")
	@ResponseBody
	public List<Rule> retrivefromDb() {
		List<Rule> rules = jsonValidatorService.retrivefromDb();
		return rules;
	}

	@GetMapping(path = "/test")
	@ResponseBody
	public String Display() {
		return "Hello World";
	}
}
