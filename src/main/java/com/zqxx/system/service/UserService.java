package com.zqxx.system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zqxx.system.dao.UserDao;
import com.zqxx.system.entity.SysUser;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	public SysUser findByName(String loginName){
		return userDao.findByName(loginName);
	}
}
