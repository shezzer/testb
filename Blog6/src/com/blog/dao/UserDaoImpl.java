package com.blog.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.blog.domain.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao{
	
	public void addUser(User user) {
		// TODO Auto-generated method stub
		
		System.out.println("dao��");
		this.getHibernateTemplate().save(user);
	}

	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		
	}

	public void findAll() {
		// TODO Auto-generated method stub
		
	}

	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

	public User findUser(String username) {
		// TODO Auto-generated method stub
		List<User> list = this.getHibernateTemplate().find("from User where username = ?",username);
		if(list.size() == 0) {
			return null;
		} else {
			return (User)list.get(0);
		}
	}

}
