package com.blog.service;

import java.util.List;

import com.blog.dao.CriticismDao;
import com.blog.domain.Criticism;
import com.blog.domain.Page;
import com.blog.domain.Result;
import com.blog.util.PageUtil;

public class CriticismServiceImpl implements CriticismService {
	private CriticismDao criticismDao;
	public void setCriticismDao(CriticismDao criticismDao) {
		this.criticismDao = criticismDao;
	}
	public Boolean addCriticism(Criticism criticism) {
		return criticismDao.addCriticism(criticism);
	}
	public Result pageQueryCriticism(int Aid, Page page) {
		page = PageUtil.createPage(page,criticismDao.queryAllCriticism(Aid));
		List<Criticism> all = criticismDao.pageQueryAllCriticism(Aid, page);
		Result result = new Result();
		result.setPage(page);
		result.setList(all);
		return result;
	}

}
