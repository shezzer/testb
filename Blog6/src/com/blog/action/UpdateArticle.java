package com.blog.action;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.blog.domain.Article;
import com.blog.service.ArticleService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UpdateArticle extends ActionSupport implements ModelDriven<Article>{
	private Article article = new Article();
	private ArticleService articleService;
	public Article getModel() {
		// TODO Auto-generated method stub
		return article;
	}
	public void setArticleService(ArticleService articleService) {
		this.articleService = articleService;
	}
	public String updateArticle()
	{
		HttpServletRequest request = ServletActionContext.getRequest();
		Integer id = Integer.parseInt(request.getParameter("id"));
		article = articleService.queryArticleByid(id);
		String username = request.getParameter("username");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		article.setComment(articleService.getCriticismCount(article.getId()));
		article.setHasread(article.getHasread());
		article.setTitle(title);
		article.setContent(content);
		article.setUsername(username);
		article.setDate(new Date());
		articleService.addArticle(article);
		return SUCCESS;
	}
}
