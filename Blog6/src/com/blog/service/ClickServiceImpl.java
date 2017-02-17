package com.blog.service;

import java.util.Date;

import com.blog.dao.ClickDao;
import com.blog.domain.Click;

public class ClickServiceImpl implements ClickService {
	private ClickDao clickDao;

	public void setClickDao(ClickDao clickDao) {
		this.clickDao = clickDao;
	}

	public boolean queryClick(int Aid, String ip, Date clickDate) {
		if(clickDao.queryClick(Aid, ip, clickDate).size()!=0)
		{
			return true;//µã»÷¹ýÁË
		}
		else {
			Click click = new Click();
			click.setAid(Aid);
			click.setIp(ip);
			click.setClickDate(clickDate);
			clickDao.addClick(click);
			return false;
		}
	}

}
