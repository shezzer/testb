package com.blog.dao;

import java.util.List;

import com.blog.domain.Criticism;
import com.blog.domain.Page;

public interface CriticismDao {
	/**
	 * �������
	 * @param criticism
	 */
	public Boolean addCriticism(Criticism criticism);
	/**
	 * ��������id��ѯ��������������
	 * @param Aid
	 * @return
	 */
	public int queryAllCriticism(int Aid);
	/**
	 * ��ҳ��ѯ��������
	 * @param Aid
	 * @param page
	 * @return
	 */
	public List<Criticism> pageQueryAllCriticism(int Aid,Page page);
}
