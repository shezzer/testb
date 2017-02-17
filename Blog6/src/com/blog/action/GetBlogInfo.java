package com.blog.action;

import java.util.Map;

import com.blog.domain.BlogInfo;
import com.blog.service.BlogInfoService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class GetBlogInfo extends ActionSupport implements ModelDriven<BlogInfo>{
	private BlogInfo blogInfo = new BlogInfo();
	private BlogInfoService blogInfoService;
	
	public void setBlogInfoService(BlogInfoService blogInfoService) {
		this.blogInfoService = blogInfoService;
	}
	public BlogInfo getModel() {
		// TODO Auto-generated method stub
		return blogInfo;
	}
	public String get()
	{
		Map session = ActionContext.getContext().getSession();
		//通过业务逻辑组件来查询
		BlogInfo bloginfo  = blogInfoService.getBlogInfo(blogInfo.getUsername());
		if(bloginfo != null) {
			session.put("username", bloginfo.getUsername());
			session.put("blogtitle", bloginfo.getBlogtitle());
			session.put("idiograph", bloginfo.getIdiograph());
		}
		return SUCCESS;
	}
}
