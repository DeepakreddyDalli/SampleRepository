package com.deepak.struts2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService{

	public List<User> getUsers() {
		List<User> list = new ArrayList<User>();
		list.add(new User(1, "deepak", "dalli", "37", "M"));
		list.add(new User(2, "susmita", "dalli", "31", "F"));
		list.add(new User(3, "bhavin", "dalli", "3", "M"));
		list.add(new User(4, "hanvith", "dalli", "1", "M"));
		return list;
	}

}
