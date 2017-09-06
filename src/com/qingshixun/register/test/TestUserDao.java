package com.qingshixun.register.test;

import org.junit.Test;

import com.qingshixun.register.dao.UserDao;

public class TestUserDao {

	UserDao userDao = new UserDao();
	
	@Test
	public void testInserUser(){
		String sql = "insert into qsx_register(username,password,email,gender,profession,hobby) "
				+ "values(?,?,?,?,?,?)";
		userDao.insertUser(sql, "tough","Betough3","toughChow@gmail.com","男","student","打篮球 游泳");
	}
}
