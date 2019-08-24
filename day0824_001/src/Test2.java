import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yiibai.mybatis.dao.UserDao;
import com.yiibai.mybatis.dao.impl.UserDaoImpl;
import com.yiibai.mybatis.models.User;

public class Test2 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		UserDao userDao = (UserDao) applicationContext.getBean("userDaoImpl");
//		User user = new User(111, "HarmonyOS", "IT", "11134", "http://lsdk");
//		for (int i = 0; i < 10; i++) {
//			userDao.insertUser(user);
//		}
		
//		int count = userDao.deleteUserById(10);
//		System.out.println(count);
		
		List<User> list = userDao.selectAll();
		for (Iterator<User> iterator = list.iterator(); iterator.hasNext();) {
			User user = (User) iterator.next();
			System.out.println(user);
		}
	 }
}
