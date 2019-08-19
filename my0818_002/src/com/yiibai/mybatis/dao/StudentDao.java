package com.yiibai.mybatis.dao;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.yiibai.mybatis.models.Student;
import com.yiibai.mybatis.util.MyBatisUtil;

public class StudentDao {

	public List<Student> selectByTeacherId(int id) throws IOException {
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		List<Student> list = sqlSession.selectList("com.yiibai.mybatis.models.StudentMapper.selectByTid", id);
		return list;
	}
}
