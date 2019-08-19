package com.yiibai.mybatis.dao;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.yiibai.mybatis.models.User;
import com.yiibai.mybatis.util.MyBatisUtil;

public class UserDao {

	public User getUserById(int id) throws IOException {
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		User user = sqlSession.selectOne("com.yiibai.mybatis.models.UserMapper.GetUserByID", id);
		if (sqlSession != null) {
			sqlSession.close();
		}
		return user;
	}
	
	public int insertUser(User user) throws IOException {
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		int count = sqlSession.insert("com.yiibai.mybatis.models.UserMapper.addUser", user);
		sqlSession.commit();
		if (sqlSession != null) {
			sqlSession.close();
		}
		return count;
	}
	
	public int  updateUser(User user) throws IOException {
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		int count = sqlSession.update("com.yiibai.mybatis.models.UserMapper.updateUser", user);
		sqlSession.commit();
		if (sqlSession != null) {
			sqlSession.close();
		}
		return count;
	}
	
	public int deleteById(int id) throws IOException {
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		int count = sqlSession.delete("com.yiibai.mybatis.models.UserMapper.deleteUser", id);
		sqlSession.commit();
		sqlSession.close();
		return count;
	}
	
	public List<User> selectAll(int currentPage, int pageSize) throws IOException {
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("startIndex", (currentPage-1)*pageSize);
		map.put("pageSize", pageSize);
		List<User> list = sqlSession.selectList("com.yiibai.mybatis.models.UserMapper.selectAll", map);
		return list;
	}
	
	public List<User> selectAll2(int currentPage, int pageSize) throws IOException {
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		RowBounds rowBounds = new RowBounds((currentPage-1)*pageSize, pageSize);
		List<User> list = sqlSession.selectList("com.yiibai.mybatis.models.UserMapper.selectAll2", null, rowBounds);
		sqlSession.close();
		return list;
	}
}
