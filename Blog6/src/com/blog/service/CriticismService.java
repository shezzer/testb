package com.blog.service;

import com.blog.domain.Criticism;
import com.blog.domain.Page;
import com.blog.domain.Result;


public interface CriticismService {
	/**
	 * �������
	 * @param criticism
	 */
	public Boolean addCriticism(Criticism criticism);
	/**
	 * ��ҳ��ʾ����
	 * @param Aid
	 * @param page
	 * @return
	 */
	public Result pageQueryCriticism(int Aid,Page page);
}
