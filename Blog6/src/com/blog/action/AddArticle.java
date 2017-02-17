package com.blog.action;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.blog.domain.Article;
import com.blog.service.ArticleService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class AddArticle extends ActionSupport implements ModelDriven<Article>{
	private Article article = new Article();
	private ArticleService articleService;
	public Article getModel() {
		// TODO Auto-generated method stub
		return article;
	}
	public void setArticleService(ArticleService articleService) {
		this.articleService = articleService;
	}
	public String addArticle()
	{
		HttpServletRequest request = ServletActionContext.getRequest();
		
		String username = request.getParameter("username");
		article.setComment(0);
		article.setHasread(0);
		article.setUsername(username);
		article.setDate(new Date());
		articleService.addArticle(article);
		request.setAttribute("article", article);
		return SUCCESS;
	}
}
