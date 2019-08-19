package my0814_001;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;

import cn.itcast.entity.User;
import cn.itcast.util.MyBatisUtil;

public class Test {

	
	public static void main(String[] args) {
		SqlSession sqlSession = null;
		try {
			sqlSession = MyBatisUtil.getSqlSession();
			User user = sqlSession.selectOne("UserMapper.selectById", 1);
			System.out.println(user);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (sqlSession != null) {
				sqlSession.close();
			}
		}
		
	}
}
