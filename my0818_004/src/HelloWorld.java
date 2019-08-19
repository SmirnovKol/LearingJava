import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.yiibai.mybatis.dao.StudentDao;
import com.yiibai.mybatis.dao.TeacherDao;
import com.yiibai.mybatis.models.*;

/**
 * 
 * @author yiibai
 * @copyright http://www.yiibai.com
 * @date 2015/09/22
 */
public class HelloWorld {

	public static void main(String[] args) throws IOException {
//		UserDao userDao = new UserDao();
//		User user = userDao.getUserById(2);
//		System.out.println(user);
//		
//		User user2 = new User();
//		user2.setName("张三丰");
//		user2.setAge(108);
//		user2.setSex("男性");
//		user2.setTel("21345");
//		int count = userDao.insertUser(user2);
//		System.out.println(count);
//		
//		System.out.println(userDao.getUserById(9));
		
//		UserDao userDao = new UserDao();
//		User user = userDao.getUserById(2);
//		user.setName("第2号");
//		int count = userDao.updateUser(user);
//		System.out.println(count);
//		System.out.println(userDao.getUserById(2));
		
//		UserDao userDao = new UserDao();
//		System.out.println(userDao.getUserById(2));
//		int count = userDao.deleteById(2);
//		System.out.println(count);
//		System.out.println(userDao.getUserById(2));
		
//		UserDao userDao = new UserDao();
//		List<User> list = userDao.selectAll(2, 3);
//		for (Iterator<User> iterator = list.iterator(); iterator.hasNext();) {
//			User user = (User) iterator.next();
//			System.out.println(user);
//		}
		
//		StudentDao studentDao = new StudentDao();
//		List<Student> list = studentDao.selectByTeacherId(2);
//		for (Iterator<Student> iterator = list.iterator(); iterator.hasNext();) {
//			Student student = (Student) iterator.next();
//			System.out.println(student);
//		}
		
//		TeacherDao teacherDao = new TeacherDao();
//		Teacher teacher = teacherDao.selectById(1);
//		System.out.println(teacher);
//		List<Student> students = teacher.getStudents();
//		for (Iterator<Student> iterator = students.iterator(); iterator.hasNext();) {
//			Student student = (Student) iterator.next();
//			System.out.println(student);
//		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		//map.put("id", 3);
		//map.put("sex", "男");
		//map.put("name", "张");
		map.put("tid", 2);
		StudentDao studentDao = new StudentDao();
		List<Student> list = studentDao.selectDynamic(map);
		if (list != null) {
			for (Iterator<Student> iterator = list.iterator(); iterator.hasNext();) {
				Student student2 = (Student) iterator.next();
				System.out.println(student2);
			}
		}
	}

}