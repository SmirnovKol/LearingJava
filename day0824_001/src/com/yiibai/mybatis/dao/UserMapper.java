package com.yiibai.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.yiibai.mybatis.models.User;

public interface UserMapper {
	@Select("SELECT * FROM user WHERE id = #{userId}")
	User getUser(@Param("userId") Integer userId);

	@Select("select * from user")
	List<User> selectAll();

	@Insert({"insert into user(name, dept, website, phone) values(#{name}, #{dept}, #{website}, #{phone})" })
	@Options(useGeneratedKeys = true, keyProperty = "id")
	int insertUser(User user);
	
	@Delete("delete from user where id = #{userId}")
	int deleteUserById(@Param("userId") Integer userId);
}