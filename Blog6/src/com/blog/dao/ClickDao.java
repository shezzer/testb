package com.blog.dao;

import java.util.Date;
import java.util.List;

import com.blog.domain.Click;

public interface ClickDao {
	/**
	 * ��������¼
	 * @param click
	 */
	public void addClick(Click click);
	/**
	 * ��ѯ�����¼�Ƿ����
	 * @param Aid
	 * @param ip
	 * @param clickDate
	 * @return
	 */
	public List<Click> queryClick(int Aid,String ip,Date clickDate);
}
