package com.blog.dao;

import com.blog.domain.User;

public interface UserDao {
	/**
	 * 添加用户
	 * @param user
	 */
	public void addUser(User user);
	/**
	 * 删除用户
	 * @param user
	 */
	public void deleteUser(User user);
	/**
	 * 更新用户
	 * @param user
	 */
	public void updateUser(User user);
	/**
	 * 根据用户名查找用户
	 * @param username
	 */
	public User findUser(String username);
	/**
	 * 查询所有用户
	 */
	public void findAll();
}
