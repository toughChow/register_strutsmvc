package com.qingshixun.register;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class RegisterAction extends ActionSupport implements ModelDriven<User> {

	private static final long serialVersionUID = 1L;
	
	private User user = new User();

	public void setUser(User user) {
		this.user = user;
	}

	public String register() {
		return SUCCESS;
	}

	public String regist() {
		return SUCCESS;
	}

	public User getModel() {
		return user;
	}

}
