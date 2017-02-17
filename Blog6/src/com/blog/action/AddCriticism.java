package com.blog.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.blog.domain.Article;
import com.blog.domain.Criticism;
import com.blog.service.ArticleService;
import com.blog.service.CriticismService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class AddCriticism extends ActionSupport{
	private Criticism criticism = new Criticism();
	private Article article = new Article();
	private CriticismService criticismService;
	private int id;
	private String content;
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setCriticismService(CriticismService criticismService) {
		this.criticismService = criticismService;
	}
	public String addCriticism()
	{
		Map session = ActionContext.getContext().getSession();
		String username = (String) session.get("username");
		criticism.setUsername(username);
		criticism.setAid(id);
		criticism.setContent(content);
		this.criticismService.addCriticism(criticism);

		return SUCCESS;
	}
	
}
