package com.jbk.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.configuration.HibernateConfiguration;
import com.jbk.entity.Register;


@Repository
public class UserDao_impl implements UserDao_i {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Register loginCheck(Register register) {
		
		Session session=sessionFactory.openSession();
		Criteria criteria=session.createCriteria(register.getClass());
		criteria.add(Restrictions.eq("email", register.getEmail()));
		Register reg= (Register) criteria.uniqueResult();
	
		
		return reg;
	}

}
