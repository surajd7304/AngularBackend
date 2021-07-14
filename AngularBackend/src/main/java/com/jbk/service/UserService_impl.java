package com.jbk.service;

import javax.transaction.Transactional;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.jbk.dao.UserDao_i;
import com.jbk.entity.Register;

@Service
@Transactional
public class UserService_impl implements UserService_i {

	@Autowired
	UserDao_i dao;
	
	@Override
	public JSONObject loginCheck(Register register) {
		
		Register reg=dao.loginCheck(register);
		JSONObject jobj=new JSONObject();
	 if(reg.equals(null)) {
		System.out.println(reg.getFname()); 
	 }else {
		 System.out.println(reg.getLname());  
	 }
	 
		return jobj;
	}

}
