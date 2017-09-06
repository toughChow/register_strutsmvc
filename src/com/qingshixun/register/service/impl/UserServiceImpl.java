package com.qingshixun.register.service.impl;

import com.qingshixun.register.dao.UserDao;
import com.qingshixun.register.domain.User;
import com.qingshixun.register.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDao userDao = new UserDao();

	@Override
	public void insertUser(User user) {
		String sql = "insert into qsx_register(username,password,email,gender,profession,hobby) "
				+ "values(?,?,?,?,?,?)";
		StringBuffer sb = new StringBuffer();
		String[] hobby = user.getHobby();

		// 若hobby选项不为空
		if (hobby != null) {
			for (String string : hobby) {
				sb.append(string + " ");
			}
		}else{
			sb.append("无");
		}
		userDao.insertUser(sql, user.getUsername(), user.getPassword(), user.getEmail(), user.getGender(),
				user.getProfession(), sb.toString());
	}

	@Override
	public String getUsername(String username) {
		String sql="select username from qsx_register where username = ?";
		return userDao.getUsername(sql, username);
	}
}
