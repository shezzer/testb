package com.blog.service;

import java.util.List;

import com.blog.dao.ArticleDao;
import com.blog.dao.CriticismDao;
import com.blog.domain.Article;
import com.blog.domain.Page;
import com.blog.domain.Result;
import com.blog.util.PageUtil;

public class ArticleServiceImpl implements ArticleService {
	private ArticleDao articleDao;
	private CriticismDao criticismDao;
	public void setCriticismDao(CriticismDao criticismDao) {
		this.criticismDao = criticismDao;
	}
	public void setArticleDao(ArticleDao articleDao) {
		this.articleDao = articleDao;
	}
	public void addArticle(Article article) {
		articleDao.addArticle(article);
	}
	public List<Article> showUserArticles(String username) {
		return articleDao.queryArticles(username);
	}
	public Result pageQueryUserArticles(String username, Page page) {
		page = PageUtil.createPage(page,articleDao.queryUserAllArticles(username));
		List<Article> all = articleDao.pageQueryArticles(username, page);
		Result result = new Result();
		result.setPage(page);
		result.setList(all);
		return result;
	}
	public Result pageQueryAllArticles(Page page) {
		page = PageUtil.createPage(page,articleDao.queryAllArticles());
		List<Article> all = articleDao.pageQueryAllArticles(page);
		Result result = new Result();
		result.setPage(page);
		result.setList(all);
		return result;
	}
	public Article showArticleCon(int id) {
		return articleDao.queryArticleById(id);
	}
	public int getCriticismCount(int Aid) {
		return criticismDao.queryAllCriticism(Aid);
	}
	public void updateArticle(Article article) {
		articleDao.updateArticle(article);
	}
	public Article queryArticleByid(Integer id) {
		return articleDao.queryArticleById(id);
	}
	public void deleteArticle(Article article) {
		articleDao.deleteArticle(article);
	}

}
