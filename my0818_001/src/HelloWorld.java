import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.yiibai.mybatis.dao.UserDao;
import com.yiibai.mybatis.models.*;
import com.yiibai.mybatis.util.MyBatisUtil;

/**
 * 
 * @author yiibai
 * @copyright http://www.yiibai.com
 * @date 2015/09/22
 */
public class HelloWorld {

	public static void main(String[] args) throws IOException {
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		UserDao userDao = sqlSession.getMapper(UserDao.class);
		List<User> list = userDao.selectAll();
		for (Iterator<User> iterator = list.iterator(); iterator.hasNext();) {
			User user = (User) iterator.next();
			System.out.println(user);
		}
		
		System.out.println("====================");
		User user = new User(818, "¼ÆËã»ú", "ÄÐÐÔ", 26, "3223");
		int count = userDao.insert(user);
		sqlSession.commit();
		System.out.println(count);
		
		System.out.println(userDao.selectById(1));
		System.out.println(userDao.selectById(818));
	}
}