package test.dao;

import org.junit.Test;

import cn.itcast.user.dao.UserDao;
import cn.itcast.user.domain.User;

public class UserDaoTest {

	@Test
	public void testFindByUsername() {
		UserDao userDao = new UserDao();
		User user = userDao.findByUsername("张三");
		System.out.println(user);
	}
	
	@Test
	public void testAdd() {
		UserDao userDao = new UserDao();
		User user = new User();
		user.setPassword("zhangSan");
		user.setUsername("张三");
		userDao.add(user);
		
		user.setUsername("李四");
		user.setPassword("liSi");
		userDao.add(user);
	}
	
}
