package com.yiibai.mybatis.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.yiibai.mybatis.dao.UserDao;
import com.yiibai.mybatis.models.User;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

	@Override
	public User selectUserById(int id) {
		return getSqlSession().selectOne("com.yiibai.mybatis.models.UserMapper.GetUserByID", id);
	}

	@Override
	public List<User> selectAll() {
		// TODO Auto-generated method stub
		return getSqlSession().selectList("com.yiibai.mybatis.models.UserMapper.selectAll");
	}

	@Override
	public int insertUser(User user) {
		// TODO Auto-generated method stub
		return getSqlSession().insert("com.yiibai.mybatis.models.UserMapper.insertUser", user);
	}

	@Override
	public int deleteUserById(int id) {
		// TODO Auto-generated method stub
		return getSqlSession().delete("com.yiibai.mybatis.models.UserMapper.deleteUserById", id);
	}
	
}
