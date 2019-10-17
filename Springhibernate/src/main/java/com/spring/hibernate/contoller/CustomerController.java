/**
 * 
 */
package com.spring.hibernate.contoller;

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

import com.spring.hibernate.model.Customer;
import com.spring.hibernate.service.CustomerService;

@Controller
@CrossOrigin
@RequestMapping("/customerdetails")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping(path="/save", consumes="application/json", produces="appliation/json")
	public ResponseEntity<String> saveCustomer(@RequestBody Customer theCustomer)
	{
		customerService.saveCustomer(theCustomer);
		return ResponseEntity.status(HttpStatus.OK).build();
	}

	@GetMapping(path="/fetchfromDb")
	@ResponseBody
	public List<Customer> retrivefromDb(){
		List<Customer> rules=customerService.retrivefromDb();
		return rules;
	}
	
	@GetMapping(path="/test")
	@ResponseBody
	public String Display() {
		return "Hello World";
	}
}
