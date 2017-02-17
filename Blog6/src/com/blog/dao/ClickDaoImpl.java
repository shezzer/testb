package com.blog.dao;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.blog.domain.Click;

public class ClickDaoImpl extends HibernateDaoSupport implements ClickDao {

	public void addClick(Click click) {
		this.getHibernateTemplate().save(click);
	}

	public List<Click> queryClick(final int Aid, final String ip, final Date clickDate) {
		return this.getHibernateTemplate().executeFind(new HibernateCallback() {

			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query = session.createQuery("select click from Click click where click.Aid=? and click.ip=? and click.clickDate=?");
				query.setParameter(0, Aid);
				query.setParameter(1, ip);
				query.setParameter(2, clickDate);
				return query.list();
			}
		});
	}

}
