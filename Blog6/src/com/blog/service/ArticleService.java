package com.blog.service;

import java.util.List;

import com.blog.domain.Article;
import com.blog.domain.Page;
import com.blog.domain.Result;

public interface ArticleService {
	public Article queryArticleByid(Integer id);
	/**
	 * 添加博客文章
	 * @param article
	 */
	public void addArticle(Article article);
	/**
	 * 显示用户所有文章
	 * @param username
	 * @return
	 */
	public List<Article> showUserArticles(String username);
	/**
	 * 分页查询用户文章
	 * @param username
	 * @param page
	 * @return
	 */
	public Result pageQueryUserArticles(String username,Page page);
	/**
	 * 分页查询所有文章
	 * @param page
	 * @return
	 */
	public Result pageQueryAllArticles(Page page);
	/**
	 * 查看文章内容
	 * @param id
	 * @return
	 */
	public Article showArticleCon(int id);
	/**
	 * 获得评论数
	 * @param Aid
	 * @return
	 */
	public int getCriticismCount(int Aid);
	/**
	 * 用户修改文章
	 * @param article
	 */
	public void updateArticle(Article article);
	/**
	 * 用户删除文章
	 * @param article
	 */
	public void deleteArticle(Article article);
}
