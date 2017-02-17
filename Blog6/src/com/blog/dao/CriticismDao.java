package com.blog.dao;

import java.util.List;

import com.blog.domain.Criticism;
import com.blog.domain.Page;

public interface CriticismDao {
	/**
	 * 添加评论
	 * @param criticism
	 */
	public Boolean addCriticism(Criticism criticism);
	/**
	 * 根据文章id查询该文章评论总数
	 * @param Aid
	 * @return
	 */
	public int queryAllCriticism(int Aid);
	/**
	 * 分页查询所有评论
	 * @param Aid
	 * @param page
	 * @return
	 */
	public List<Criticism> pageQueryAllCriticism(int Aid,Page page);
}
