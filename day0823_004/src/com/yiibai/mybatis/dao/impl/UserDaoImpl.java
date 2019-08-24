package com.yiibai.mybatis.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import com.yiibai.mybatis.dao.UserDao;
import com.yiibai.mybatis.models.User;

public class UserDaoImpl implements UserDao {

	private SqlSessionTemplate sqlSessionTemplate;
	
	public SqlSessionTemplate getSqlSessionTemplate() {
		return sqlSessionTemplate;
	}

	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

	@Override
	public User selectUserById(int id) {
		return sqlSessionTemplate.selectOne("com.yiibai.mybatis.models.UserMapper.GetUserByID", id);
	}

	@Override
	public List<User> selectAll() {
		// TODO Auto-generated method stub
//		return sqlSessionTemplate.selectList("com.yiibai.mybatis.models.UserMapper.selectAll");
		User user = new User(123, "任正非", "华为", "12423", "huawei");
		insertUser(user);
		deleteUserById(3);
		return new ArrayList<User>();
	}

	@Override
	public int insertUser(User user) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.insert("com.yiibai.mybatis.models.UserMapper.insertUser", user);
	}

	@Override
	public int deleteUserById(int id) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.delete("com.yiibai.mybatis.models.UserMapper.deleteUserById", id);
	}
	
}
