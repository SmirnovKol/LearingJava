package com.yiibai.mybatis.dao;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;

import com.yiibai.mybatis.models.Teacher;
import com.yiibai.mybatis.util.MyBatisUtil;

public class TeacherDao {

	public Teacher selectById(int id) throws IOException {
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		Teacher teacher = sqlSession.selectOne("com.yiibai.mybatis.models.TeacherMapper.selectById", id);
		return teacher;
	}
}
