package cn.itcast.user.service;

import cn.itcast.user.dao.UserDao;
import cn.itcast.user.domain.User;

public class UserService {
	private UserDao userDao = new UserDao();
	
	public void register(User user) throws UserException {
		User _user = userDao.findByUsername(user.getUsername());
		if (_user != null) {
			throw new UserException("用户名" + user.getUsername() + "已被注册");
		}
		userDao.add(user);
	}
}
