package com.qingshixun.register;

import java.util.Arrays;

public class User {
	private String username;
	private String password;
	private String passwordRepeat;
	private String email;
	private String gender;// 性别
	private String profession;// 职业
	private String[] hobby;
	
	// 默认构造函数
	public User() {
		super();
	}
	
	// 带参构造函数
	public User(String username, String password, String passwordRepeat, String email, String gender, String profession,
			String[] hobby) {
		super();
		this.username = username;
		this.password = password;
		this.passwordRepeat = passwordRepeat;
		this.email = email;
		this.gender = gender;
		this.profession = profession;
		this.hobby = hobby;
	}
	
	// getter & setter
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPasswordRepeat() {
		return passwordRepeat;
	}
	public void setPasswordRepeat(String passwordRepeat) {
		this.passwordRepeat = passwordRepeat;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String[] getHobby() {
		return hobby;
	}
	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}

	// hobby toString
	public String toString() {
		return "[hobby=" + Arrays.toString(hobby) + "]";
	}
	
	
	
}
