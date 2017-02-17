package com.blog.service;

import com.blog.domain.User;

public interface UserService {
	/**
	 * 注册用户
	 * @param user
	 * @return
	 */
	public boolean registerUser(User user);
	/**
	 * 登录用户
	 * @param user
	 * @return
	 */
	public boolean loginUser(User user);
	
}
