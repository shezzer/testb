package com.blog.dao;

import com.blog.domain.BlogInfo;

public interface BlogInfoDao {
	/**
	 * �����û�������û����Ի�����
	 * @param username
	 * @return
	 */
	public BlogInfo getBlogInfo(String username);
	/**
	 * �����û����Ի�����
	 * @param blogInfo
	 */
	public void saveBlogInfo(BlogInfo blogInfo);
}
