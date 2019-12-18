package com.woniu.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.woniu.dao.IUserDao;
import com.woniu.pojo.User;

@Repository//声明该类被SringIOC管理
public class UserDaoImpl implements IUserDao {
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public void save(User user) {
		sessionFactory.getCurrentSession().save(user);
	}

}
