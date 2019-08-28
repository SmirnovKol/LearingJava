package cn.sxt.dao.impl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import cn.sxt.dao.UserDao;
import cn.sxt.vo.User;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

	@Override
	public List<User> getAllUser() {
		return getSqlSession().selectList("cn.sxt.vo.User.getAllUser");
	}

}
