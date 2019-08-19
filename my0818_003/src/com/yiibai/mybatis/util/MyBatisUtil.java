package com.yiibai.mybatis.util;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {

	public static SqlSessionFactory getSqlSessionFactory() throws IOException {
		String resource = "config/Configure.xml";
		Reader reader = Resources.getResourceAsReader(resource);
		return new SqlSessionFactoryBuilder().build(reader);
	}
	
	public static SqlSession getSqlSession() throws IOException {
		SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
		return sqlSessionFactory.openSession();
	}
}
