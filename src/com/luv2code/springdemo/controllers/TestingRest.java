package com.luv2code.springdemo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.service.CustumerService;

@Controller
public class TestingRest {
	
	@Autowired
	private CustumerService customerService;
	
	@GetMapping("users")
	@ResponseBody
	public List<Customer> getUsers()
	{
		
		List<Customer> allcustomer = customerService.getCustomers();
		return allcustomer;
	}

}
