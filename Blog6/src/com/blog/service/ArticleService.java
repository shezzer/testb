package com.blog.service;

import java.util.List;

import com.blog.domain.Article;
import com.blog.domain.Page;
import com.blog.domain.Result;

public interface ArticleService {
	public Article queryArticleByid(Integer id);
	/**
	 * ��Ӳ�������
	 * @param article
	 */
	public void addArticle(Article article);
	/**
	 * ��ʾ�û���������
	 * @param username
	 * @return
	 */
	public List<Article> showUserArticles(String username);
	/**
	 * ��ҳ��ѯ�û�����
	 * @param username
	 * @param page
	 * @return
	 */
	public Result pageQueryUserArticles(String username,Page page);
	/**
	 * ��ҳ��ѯ��������
	 * @param page
	 * @return
	 */
	public Result pageQueryAllArticles(Page page);
	/**
	 * �鿴��������
	 * @param id
	 * @return
	 */
	public Article showArticleCon(int id);
	/**
	 * ���������
	 * @param Aid
	 * @return
	 */
	public int getCriticismCount(int Aid);
	/**
	 * �û��޸�����
	 * @param article
	 */
	public void updateArticle(Article article);
	/**
	 * �û�ɾ������
	 * @param article
	 */
	public void deleteArticle(Article article);
}
