package com.blog.dao;

import java.util.Date;
import java.util.List;

import com.blog.domain.Click;

public interface ClickDao {
	/**
	 * 保存点击记录
	 * @param click
	 */
	public void addClick(Click click);
	/**
	 * 查询点击记录是否存在
	 * @param Aid
	 * @param ip
	 * @param clickDate
	 * @return
	 */
	public List<Click> queryClick(int Aid,String ip,Date clickDate);
}
