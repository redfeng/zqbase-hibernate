package com.zqxx.system.dao;

import org.springframework.stereotype.Repository;

import com.zqxx.dao.BaseDao;
import com.zqxx.system.po.SysUser;

@Repository
public class UserDao extends BaseDao<SysUser>{
	//根据登陆名查找用户
	public SysUser findByName(String loginName){
		String hql="from SysUser where username=?";
		return this.findOne(hql, loginName);
	}
}
