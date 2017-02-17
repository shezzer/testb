package com.blog.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.blog.domain.Article;
import com.blog.domain.Criticism;
import com.blog.domain.Page;
import com.blog.domain.Result;
import com.blog.service.ArticleService;
import com.blog.service.CriticismService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ShowAllArticle extends ActionSupport{
	private ArticleService articleService;
	private CriticismService criticismService;
	private Criticism criticism = new Criticism();
	private Article article = new Article();
	public void setCriticismService(CriticismService criticismService) {
		this.criticismService = criticismService;
	}
	private int currentPage;
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public void setArticleService(ArticleService articleService) {
		this.articleService = articleService;
	}
	public String showAllArticle()
	{
		Page page = new Page();
		page.setCurrentPage(this.getCurrentPage());
		page.setEveryPage(5);
		
		Result result = articleService.pageQueryAllArticles(page);
		page = result.getPage();
		List<Article> all = result.getList();
		HttpServletRequest request = ServletActionContext.getRequest();
		if(criticismService.addCriticism(criticism))
		{
			for(Article article : all)
			{
				article.setComment(articleService.getCriticismCount(article.getId()));
				articleService.addArticle(article);
			}
			
		}
		
		request.setAttribute("article", article);

		request.setAttribute("all", all);
		request.setAttribute("page", page);

		return SUCCESS;
	}
}
