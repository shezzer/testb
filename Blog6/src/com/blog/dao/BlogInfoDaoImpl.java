package com.blog.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.blog.domain.BlogInfo;

public class BlogInfoDaoImpl extends HibernateDaoSupport implements BlogInfoDao {

	public BlogInfo getBlogInfo(String username) {
		List<BlogInfo> list = this.getHibernateTemplate().find("select bloginfo from BlogInfo bloginfo where bloginfo.username=?", username);
		if(list.size()==0)
			{
				return null;
			}
		else {
			return (BlogInfo) list.get(0);
		}
	}

	public void saveBlogInfo(BlogInfo blogInfo) {
		this.getHibernateTemplate().saveOrUpdate(blogInfo);
	}

}
