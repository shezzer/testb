package com.blog.dao;

import com.blog.domain.User;

public interface UserDao {
	/**
	 * ����û�
	 * @param user
	 */
	public void addUser(User user);
	/**
	 * ɾ���û�
	 * @param user
	 */
	public void deleteUser(User user);
	/**
	 * �����û�
	 * @param user
	 */
	public void updateUser(User user);
	/**
	 * �����û��������û�
	 * @param username
	 */
	public User findUser(String username);
	/**
	 * ��ѯ�����û�
	 */
	public void findAll();
}
