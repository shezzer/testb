package com.blog.service;

import java.util.Date;

import com.blog.domain.Click;

public interface ClickService {
	/**
	 * 查询是否存在点击记录
	 * @param Aid
	 * @param ip
	 * @param clickDate
	 * @return 返回布尔值
	 */
	public boolean queryClick(int Aid,String ip,Date clickDate);
	
}
