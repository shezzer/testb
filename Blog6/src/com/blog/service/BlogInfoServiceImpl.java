package com.blog.service;

import com.blog.dao.BlogInfoDao;
import com.blog.domain.BlogInfo;

public class BlogInfoServiceImpl implements BlogInfoService {
	private BlogInfoDao blogInfoDao;
	public void setBlogInfoDao(BlogInfoDao blogInfoDao) {
		this.blogInfoDao = blogInfoDao;
	}

	public BlogInfo getBlogInfo(String username) {
		return blogInfoDao.getBlogInfo(username);
	}

	public void setBlogInfo(BlogInfo blogInfo) {
		blogInfoDao.saveBlogInfo(blogInfo);
	}

}
