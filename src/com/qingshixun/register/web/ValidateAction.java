package com.qingshixun.register.web;

import com.qingshixun.register.service.UserService;
import com.qingshixun.register.service.impl.UserServiceImpl;

public class ValidateAction {

	private UserService userService = new UserServiceImpl();
	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String validateUsername() {
		username = userService.getUsername(username);
		if (username == null) {
			username = "1";
		}else{
			username = "0";
		}
		return "success";
	}

}
