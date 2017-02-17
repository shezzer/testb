package com.blog.dao;

import java.util.List;

import com.blog.domain.Article;
import com.blog.domain.Page;

public interface ArticleDao {
	/**
	 * 用户添加文章
	 * @param article
	 */
	public void addArticle(Article article);
	/**
	 * 根据用户名查询用户所有文章
	 * @param username
	 * @return
	 */
	public List<Article> queryArticles(String username);
	/**
	 * 用户文章总数
	 * @param username
	 * @return
	 */
	public int queryUserAllArticles(String username);
	/**
	 * 分页查询用户文章
	 * @param username
	 * @param page
	 * @return
	 */
	public List<Article> pageQueryArticles(String username,Page page);
	/**
	 * 所有文章总数
	 * @return
	 */
	public int queryAllArticles();
	/**
	 * 分页查询所有文章
	 * @param page
	 * @return
	 */
	public List<Article> pageQueryAllArticles(Page page);
	/**
	 * 查看文章
	 * @param id
	 * @return
	 */
	public Article queryArticleById(int id);
	/**
	 * 用户修改文章
	 * @param article
	 */
	public void updateArticle(Article article);
	/**
	 * 用户删除文章
	 * @param id
	 */
	public void deleteArticle(Article article);
}
