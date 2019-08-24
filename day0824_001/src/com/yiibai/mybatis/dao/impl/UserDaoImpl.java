package com.yiibai.mybatis.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.yiibai.mybatis.dao.UserDao;
import com.yiibai.mybatis.dao.UserMapper;
import com.yiibai.mybatis.models.User;

public class UserDaoImpl implements UserDao {

	private UserMapper userMapper;

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}
	@Override
	public User selectUserById(int id) {
		return userMapper.getUser(id);
	}

	@Override
	public List<User> selectAll() {
		return userMapper.selectAll();
	}

	@Override
	public int insertUser(User user) {
		return userMapper.insertUser(user);
	}

	@Override
	public int deleteUserById(int id) {
		return userMapper.deleteUserById(id);
	}
	
	
	
}
