package com.example.demo.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

	private static List<User> users = new ArrayList<User>();
	
	private static int userscount = 3;
	
	static {
		users.add(new User(1,"Navin",new Date()));
		users.add(new User(2,"Naveen",new Date()));
		users.add(new User(3,"Navven",new Date()));
	}
	
	public List<User> findAll() {
		return users;
		
	}
	
	public User save(User user) {
		if(user.getUserId() == null) {
			user.setUserId(++userscount);
		}
		users.add(user);;
		return user;
	}
	
	public User findOne(int id) {
		for(User user:users) {
			if(user.getUserId() == id) {
				return user;
			}
		}
		
		return null;
		
	}
	
	
	
	
	
}
