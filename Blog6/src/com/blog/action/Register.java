package com.blog.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.blog.domain.User;
import com.blog.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class Register extends ActionSupport implements ModelDriven<User>{
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
		public String register() throws Exception {
			if(userService.registerUser(user))
			{
				return SUCCESS;
			}else {
				return ERROR;
			}
		}
}
