package com.blog.service;

import com.blog.domain.BlogInfo;

public interface BlogInfoService {
	/**
	 * 设置博客个性化内容
	 * @param blogInfo
	 */
	public void setBlogInfo(BlogInfo blogInfo);
	/**
	 * 根据用户名获得用户博客个性化内容
	 * @param username
	 * @return
	 */
	public BlogInfo getBlogInfo(String username);
}
