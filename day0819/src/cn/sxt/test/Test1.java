package cn.sxt.test;

import cn.sxt.dao.impl.UserDaoMySQLImpl;
import cn.sxt.dao.impl.UserDaoOracleImpl;
import cn.sxt.service.impl.UserServiceImpl;

public class Test1 {

	public static void main(String[] args) {
		UserServiceImpl userServiceImpl = new UserServiceImpl();
		userServiceImpl.setUserDao(new UserDaoMySQLImpl());
		userServiceImpl.getUser();
		System.out.println("===========");
		userServiceImpl.setUserDao(new UserDaoOracleImpl());
		userServiceImpl.getUser();
	}
}
