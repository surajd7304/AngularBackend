package com.jbk.controller;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.entity.Register;
import com.jbk.service.UserService_i;

@RestController
public class HomeController {
	
	@Autowired
	UserService_i service;

	@GetMapping(value = "/logincheck")
	public JSONObject loginCheck(@RequestBody Register register) {
		
		System.out.println(register.getUsername());
	
		JSONObject object= service.loginCheck(register);
		return object;
		
		
	}
}
