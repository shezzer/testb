package com.blog.service;

import java.util.Date;

import com.blog.domain.Click;

public interface ClickService {
	/**
	 * ��ѯ�Ƿ���ڵ����¼
	 * @param Aid
	 * @param ip
	 * @param clickDate
	 * @return ���ز���ֵ
	 */
	public boolean queryClick(int Aid,String ip,Date clickDate);
	
}
