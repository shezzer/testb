package com.blog.service;

import com.blog.domain.BlogInfo;

public interface BlogInfoService {
	/**
	 * ���ò��͸��Ի�����
	 * @param blogInfo
	 */
	public void setBlogInfo(BlogInfo blogInfo);
	/**
	 * �����û�������û����͸��Ի�����
	 * @param username
	 * @return
	 */
	public BlogInfo getBlogInfo(String username);
}
