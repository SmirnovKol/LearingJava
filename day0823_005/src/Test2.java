import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yiibai.mybatis.dao.UserDao;
import com.yiibai.mybatis.dao.impl.UserDaoImpl;
import com.yiibai.mybatis.models.User;

public class Test2 {

	public static void main(String[] args) {
//		@SuppressWarnings("resource")
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
//		UserDao userDao = (UserDao) applicationContext.getBean("userDaoImpl");
		
//		User user = new User(11, "√œÕÌ÷€", "≤∆ŒÒ≤ø", "13343", "http");
//		int count = userDao.insertUser(user);
//		System.out.println(count);
		
//		int count = userDao.deleteUserById(2);
//		System.out.println(count);
		
//		List<User> list = userDao.selectAll();
//		for (Iterator<User> iterator = list.iterator(); iterator.hasNext();) {
//			User user = (User) iterator.next();
//			System.out.println(user);
//		}
		
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		UserDao userDao = (UserDao) applicationContext.getBean("userDaoImpl");
		List<User> list = userDao.selectAll();
		for (Iterator<User> iterator = list.iterator(); iterator.hasNext();) {
			User user = (User) iterator.next();
			System.out.println(user);
		}
	}
}
