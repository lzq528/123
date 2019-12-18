package com.woniu.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.woniu.pojo.User;
import com.woniu.service.IUserService;
@Controller
public class UserAction {

	private User user;
	@Autowired
	private IUserService userService;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	@Override
	public String toString() {
		return "UserAction [user=" + user + "]";
	}
	
	public String save() {
			userService.save(user);	
		
		return "success";
	}

	
}
