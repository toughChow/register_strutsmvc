package com.qingshixun.register.service;

import com.qingshixun.register.domain.User;

public interface UserService {
	/**
	 *  注册学生信息
	 * @param user
	 */
	public void insertUser(User user);
	
	public String getUsername(String username);
}
