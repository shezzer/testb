package com.blog.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.blog.domain.Article;
import com.blog.domain.Page;
import com.blog.domain.Result;
import com.blog.service.ArticleService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ShowUserAllArticle extends ActionSupport{
	private ArticleService articleService;
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
	public String showUserAllArticle()
	{
		Map session = ActionContext.getContext().getSession();
		String username = (String) session.get("username");
		
		
		Page page = new Page();
		page.setCurrentPage(this.getCurrentPage());
		page.setEveryPage(5);
		
		Result result = articleService.pageQueryUserArticles(username, page);
		page = result.getPage();
		List<Article> all = result.getList();
		
//		//œ‘ æ∆¿¬€ ˝
//		List criticismCount = new ArrayList();
//		for(Article article : all)
//		{
//			criticismCount.add(articleService.getCriticismCount(article.getId()));
//		}
//		
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("all", all);
		request.setAttribute("page", page);
//		request.setAttribute("criticismCount",criticismCount);
		return SUCCESS;
	}
}
