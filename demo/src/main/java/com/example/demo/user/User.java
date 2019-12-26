package com.example.demo.user;

import java.util.Date;

public class User {
	
	private Integer userId;
	private String name;
	private Date date;
	
	
	
	
	public User(Integer userId, String name, Date date) {
		super();
		this.userId = userId;
		this.name = name;
		this.date = date;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", date=" + date + "]";
	}
	
	

}
