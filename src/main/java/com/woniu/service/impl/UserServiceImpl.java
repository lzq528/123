package com.woniu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.IUserDao;
import com.woniu.pojo.User;
import com.woniu.service.IUserService;

@Service
@Transactional
public class UserServiceImpl implements IUserService {
	@Autowired
	IUserDao userDao;
	@Override
	public void save(User user) {
		userDao.save(user);
	}

}
