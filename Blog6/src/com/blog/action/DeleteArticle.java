package com.blog.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.blog.domain.Article;
import com.blog.service.ArticleService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteArticle extends ActionSupport{
	private ArticleService articleService;
	private Article article;
	public void setArticleService(ArticleService articleService) {
		this.articleService = articleService;
	}
	public String deleteArticle()
	{
		HttpServletRequest request = ServletActionContext.getRequest();
		Integer id = Integer.parseInt(request.getParameter("id"));
		article = articleService.queryArticleByid(id);
		articleService.deleteArticle(article);
		return SUCCESS;
	}
}
