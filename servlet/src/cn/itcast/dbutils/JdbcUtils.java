package cn.itcast.dbutils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import cn.itcast.book.domain.Book;

/**
 *@Title JdbcUtils.java
 *@description TODO
 *@time Aug 3, 2019 8:34:48 PM
 *@author kol
 *@version 1.0
 */
public class JdbcUtils {
	// MySQL 8.0 以上版本 - JDBC 驱动名及数据库 URL
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
    private static final String DB_URL = "jdbc:mysql://localhost:3306/my0803?useSSL=false&serverTimezone=UTC";
 
    // 数据库的用户名与密码，需要根据自己的设置
    private static final String USER = "root";
    private static final String PASSWORD = "123456";
    
    private JdbcUtils() {}
    
    public static Connection getConnection() {
		try {
			Class.forName(JDBC_DRIVER);
			Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
			return conn;
		} catch (ClassNotFoundException | SQLException e) {
			throw new RuntimeException(e);
		}
	}
    
    public static ResultSet query(String sql, Object...params) {
		try {
			PreparedStatement pstmt = getConnection().prepareStatement(sql);
			int parameterIndex = 1;
			for (Object param : params) {
				pstmt.setObject(parameterIndex++, param);
			}
			return pstmt.executeQuery();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
//    
//	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		String sql = "select * from bookstore where category=?";
//		Object[] params = {3};
//		ResultSet rs = query(sql, params);
//		
//		List<Book> result = new LinkedList<Book>();
//		while (rs.next()) {
//			String name = rs.getString("name");
//			double price = rs.getDouble("price");
//			int category = rs.getInt("category");
//			result.add(new Book(name, price, category));
//		}
//		System.out.println(result);
//	}
}
