package com.blog.dao;

import com.blog.domain.BlogInfo;

public interface BlogInfoDao {
	/**
	 * 根据用户名获得用户个性化设置
	 * @param username
	 * @return
	 */
	public BlogInfo getBlogInfo(String username);
	/**
	 * 保存用户个性化设置
	 * @param blogInfo
	 */
	public void saveBlogInfo(BlogInfo blogInfo);
}
