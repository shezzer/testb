package com.blog.service;

import com.blog.dao.UserDao;
import com.blog.domain.User;

public class UserServiceImpl implements UserService{
	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public boolean registerUser(User user) {
		// TODO Auto-generated method stub
		if(userDao.findUser(user.getUsername())!= null) {
			return false;
		}else {
			userDao.addUser(user);
			return true;
		}
	}

	public boolean loginUser(User user) {
		if(userDao.findUser(user.getUsername())==null)
		{	
			return false;
		}else {
			User queryuser = userDao.findUser(user.getUsername());
			if(queryuser.getPassword().equals(user.getPassword())) {
				return true;
			} else {
				return false;
			}
		}
	}

	

}
