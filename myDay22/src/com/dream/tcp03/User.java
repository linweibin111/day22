package com.dream.tcp03;

import java.io.Serializable;

public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1244587020433059826L;
	private String id;
	private String pwd;
	private char sex;
	private int age;
	public User() {
		
	}
	public User(String id, String pwd, char sex, int age) {
		this.id = id;
		this.pwd = pwd;
		this.sex = sex;
		this.age = age;
	}
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", pwd=" + pwd + ", sex=" + sex + ", age=" + age + "]";
	}
	
	
	
	
	
}
