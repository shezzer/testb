package com.blog.action;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.struts2.ServletActionContext;

import com.blog.domain.BlogInfo;
import com.blog.service.BlogInfoService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class EditBlogInfo extends ActionSupport implements ModelDriven<BlogInfo>{
	private BlogInfo blogInfo = new BlogInfo();
	private String blogtitle;
	private String idiograph;
	private BlogInfoService blogInfoService;
	
	public void setBlogInfoService(BlogInfoService blogInfoService) {
		this.blogInfoService = blogInfoService;
	}
	public BlogInfo getModel() {
		// TODO Auto-generated method stub
		return blogInfo;
	}
	public String edit() throws Exception
	{
		HttpServletRequest request = ServletActionContext.getRequest();
		
		String username = request.getParameter("username");
		String blogtitle = request.getParameter("blogtitle");
		String idiograph = request.getParameter("idiograph");
		System.out.println(username);
		//�����û���
		blogInfo.setUsername(username);
		//���ò��ͱ���
		blogInfo.setBlogtitle(blogtitle);
		//���ø���ǩ��
		blogInfo.setIdiograph(idiograph);
		//����ҵ���߼�������������
		blogInfoService.setBlogInfo(blogInfo);
		
		return this.SUCCESS;
	}

}
