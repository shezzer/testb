package com.blog.dao;

import java.util.List;

import com.blog.domain.Article;
import com.blog.domain.Page;

public interface ArticleDao {
	/**
	 * �û��������
	 * @param article
	 */
	public void addArticle(Article article);
	/**
	 * �����û�����ѯ�û���������
	 * @param username
	 * @return
	 */
	public List<Article> queryArticles(String username);
	/**
	 * �û���������
	 * @param username
	 * @return
	 */
	public int queryUserAllArticles(String username);
	/**
	 * ��ҳ��ѯ�û�����
	 * @param username
	 * @param page
	 * @return
	 */
	public List<Article> pageQueryArticles(String username,Page page);
	/**
	 * ������������
	 * @return
	 */
	public int queryAllArticles();
	/**
	 * ��ҳ��ѯ��������
	 * @param page
	 * @return
	 */
	public List<Article> pageQueryAllArticles(Page page);
	/**
	 * �鿴����
	 * @param id
	 * @return
	 */
	public Article queryArticleById(int id);
	/**
	 * �û��޸�����
	 * @param article
	 */
	public void updateArticle(Article article);
	/**
	 * �û�ɾ������
	 * @param id
	 */
	public void deleteArticle(Article article);
}
