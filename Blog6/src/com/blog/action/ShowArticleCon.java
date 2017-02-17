package com.blog.action;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.blog.domain.Article;
import com.blog.domain.Page;
import com.blog.domain.Result;
import com.blog.service.ArticleService;
import com.blog.service.ClickService;
import com.blog.service.CriticismService;
import com.opensymphony.xwork2.ActionSupport;

public class ShowArticleCon extends ActionSupport{
	private ArticleService articleService;
	private ClickService clickService;
	private CriticismService criticismService;
	private int currentPage;

	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public void setCriticismService(CriticismService criticismService) {
		this.criticismService = criticismService;
	}
	public void setClickService(ClickService clickService) {
		this.clickService = clickService;
	}
	private Integer id;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setArticleService(ArticleService articleService) {
		this.articleService = articleService;
	}
	public String showArticleCon() throws Exception
	{
		HttpServletRequest request = ServletActionContext.getRequest();
		Article article = articleService.showArticleCon(id);
		String ip = request.getRemoteAddr();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String stime = sdf.format(new Date());
		Date clickDate = sdf.parse(stime);
		if(!clickService.queryClick(id, ip, clickDate))
		{
			//点击量增加
			article.setHasread(article.getHasread() + 1);
			
		}
		//将更新的Article保存到数据表中
		articleService.updateArticle(article);
		
		
		//显示评论
		Page page = new Page();
		page.setCurrentPage(this.getCurrentPage());
		page.setEveryPage(2);
		Result result = criticismService.pageQueryCriticism(id, page);
		request.setAttribute("allCriticism", result.getList());
		request.setAttribute("page", result.getPage());
		request.setAttribute("article", article);
		return SUCCESS;
	}
}
