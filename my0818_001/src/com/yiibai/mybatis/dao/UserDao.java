package com.yiibai.mybatis.dao;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.yiibai.mybatis.models.User;
import com.yiibai.mybatis.util.MyBatisUtil;

public interface UserDao {
	@Select("select * from students")
	public List<User> selectAll();
	
	@Insert("insert into students(id, name, age, sex, tel) values (#{id}, #{name}, #{age}, #{sex}, #{tel}) ")
	public int insert(User user);
	
	@Select("select * from students where id=#{id}")
	public User selectById(int id);
}
