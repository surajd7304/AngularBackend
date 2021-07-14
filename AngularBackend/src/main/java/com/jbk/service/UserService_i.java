package com.jbk.service;

import org.json.simple.JSONObject;

import com.jbk.entity.Register;

public interface UserService_i {

	JSONObject loginCheck(Register register);

}
