package com.blog.dao;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.blog.domain.Article;
import com.blog.domain.BlogInfo;
import com.blog.domain.Page;

public class ArticleDaoImpl extends HibernateDaoSupport implements ArticleDao {

	public void addArticle(Article article) {
		this.getHibernateTemplate().saveOrUpdate(article);
	}

	public List<Article> queryArticles(String username) {
		List<Article> list = this.getHibernateTemplate().find("select article from Article article where article.username=?", username);
		return list;
	}
	public int queryUserAllArticles(String username)
	{
		List list = this.getHibernateTemplate().find("select count(*) from Article article where article.username=?", username);
		return ((Long)list.get(0)).intValue();
	}
	public List<Article> pageQueryArticles(final String username,final Page page)
	{
		return this.getHibernateTemplate().executeFind(new HibernateCallback() {

			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query = session.createQuery("select article from Article article where article.username=?");
				query.setParameter(0, username);
				query.setMaxResults(page.getEveryPage());
				query.setFirstResult(page.getBeginIndex());
				return query.list();
			}
		});
	}

	public List<Article> pageQueryAllArticles(final Page page) {
		return this.getHibernateTemplate().executeFind(new HibernateCallback() {

			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query = session.createQuery("select article from Article article order by article.date desc");
				query.setMaxResults(page.getEveryPage());
				query.setFirstResult(page.getBeginIndex());
				return query.list();
			}
		});
	}

	public int queryAllArticles() {
		List list = this.getHibernateTemplate().find("select count(*) from Article article");
		return ((Long)list.get(0)).intValue();
	}

	public Article queryArticleById(int id) {
		List<Article> article = this.getHibernateTemplate().find("select article from Article article where article.id=?",id);
		return (Article)article.get(0);
	}

	public void updateArticle(Article article) {
		this.getHibernateTemplate().update(article);
	}

	public void deleteArticle(Article article) {
		this.getHibernateTemplate().delete(article);
	}


}
