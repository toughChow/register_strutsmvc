package com.qingshixun.register.web;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.qingshixun.register.domain.User;
import com.qingshixun.register.service.UserService;
import com.qingshixun.register.service.impl.UserServiceImpl;

public class RegisterAction extends ActionSupport implements ModelDriven<User> {

	private static final long serialVersionUID = 1L;

	private UserService userService = new UserServiceImpl();

	private User user = new User();

	// 跳转到成功页面
	public String success() {
		userService.insertUser(user);
		return SUCCESS;
	}

	// 跳转到注册页面
	public String regist() {
		return SUCCESS;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public User getModel() {
		return user;
	}

}
