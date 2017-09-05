package com.qingshixun.register;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class RegisterAction extends ActionSupport implements ModelDriven<User> {

	private static final long serialVersionUID = 1L;

	private User user = new User();

	// 跳转到成功页面
	public String success() {
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
