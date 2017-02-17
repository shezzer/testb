package com.blog.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.blog.domain.User;
import com.blog.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class Login extends ActionSupport implements ModelDriven<User>{
	private User user = new User();
	private UserService userService;
	private HttpServletRequest request = ServletActionContext.getRequest();
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	public String login() throws Exception {
		if(userService.loginUser(user))
		{
			ActionContext.getContext().getSession().put("username", user.getUsername());
			request.setAttribute("url", "user/getBlogInfo.action");
			request.setAttribute("info", "登录成功");
			return SUCCESS;
		}else {
			request.setAttribute("url", "login.jsp");
			request.setAttribute("info", "登录失败");
			return ERROR;
		}
	}
}
