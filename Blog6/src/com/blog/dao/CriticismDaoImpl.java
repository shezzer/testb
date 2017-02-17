package com.blog.dao;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.blog.domain.Criticism;
import com.blog.domain.Page;

public class CriticismDaoImpl extends HibernateDaoSupport implements CriticismDao {

	public Boolean addCriticism(Criticism criticism) {
		Integer flag = (Integer) this.getHibernateTemplate().save(criticism);
		if(flag>0)
		{
			return true;
		}else {
			return false;
		}
	}

	public List<Criticism> pageQueryAllCriticism(final int Aid, final Page page) {
		return this.getHibernateTemplate().executeFind(new HibernateCallback() {

			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query = session.createQuery("select criticism from Criticism criticism where criticism.Aid=?");
				query.setParameter(0, Aid);
				query.setMaxResults(page.getEveryPage());
				query.setFirstResult(page.getBeginIndex());
				return query.list();
			}
		});
	}

	public int queryAllCriticism(int Aid) {
		List list = this.getHibernateTemplate().find("select count(*) from Criticism criticism where criticism.Aid=?", Aid);
		return ((Long)list.get(0)).intValue();
	}

}
