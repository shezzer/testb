package com.blog.service;

import com.blog.domain.User;

public interface UserService {
	/**
	 * ע���û�
	 * @param user
	 * @return
	 */
	public boolean registerUser(User user);
	/**
	 * ��¼�û�
	 * @param user
	 * @return
	 */
	public boolean loginUser(User user);
	
}
