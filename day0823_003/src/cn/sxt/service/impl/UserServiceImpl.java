package cn.sxt.service.impl;

import cn.sxt.service.UserService;

public class UserServiceImpl implements UserService {

	@Override
	public int addUser(int num) {
		// TODO Auto-generated method stub
		System.out.println("new UserServiceImpl().addUser()");
		return num;
	}

	@Override
	public void deleteUser() {
		// TODO Auto-generated method stub
		System.out.println("new UserServiceImpl().deleteUser()");
	}

	@Override
	public void searchUser() {
		// TODO Auto-generated method stub
		System.out.println("new UserServiceImpl().searchUser()");
	}

}
