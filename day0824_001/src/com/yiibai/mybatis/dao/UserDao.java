package com.yiibai.mybatis.dao;

import com.yiibai.mybatis.models.User;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.List;

import org.mybatis.spring.SqlSessionFactoryBean;
public interface UserDao {

	public User selectUserById(int id);
	public List<User> selectAll();
	public int insertUser(User user);
	public int deleteUserById(int id);
}
