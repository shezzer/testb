package com.blog.service;

import com.blog.domain.Criticism;
import com.blog.domain.Page;
import com.blog.domain.Result;


public interface CriticismService {
	/**
	 * 添加评论
	 * @param criticism
	 */
	public Boolean addCriticism(Criticism criticism);
	/**
	 * 分页显示评论
	 * @param Aid
	 * @param page
	 * @return
	 */
	public Result pageQueryCriticism(int Aid,Page page);
}
