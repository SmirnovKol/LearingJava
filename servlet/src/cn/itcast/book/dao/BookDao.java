package cn.itcast.book.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import cn.itcast.book.domain.Book;
import cn.itcast.dbutils.JdbcUtils;

/**
 *@Title BookDao.java
 *@description TODO
 *@time Aug 3, 2019 8:31:38 PM
 *@author kol
 *@version 1.0
 */
public class BookDao {
	public List<Book> findAll() {
		String sql = "select * from bookstore";
		ResultSet rs = JdbcUtils.query(sql);
		return getResult(rs);
		
	}
	
	public List<Book> findByCategory(int category) {
		String sql = "select * from bookstore where category=?";
		ResultSet rs = JdbcUtils.query(sql, category);
		return getResult(rs);
	}
	
	private List<Book> getResult(ResultSet rs) {
		List<Book> result = new LinkedList<Book>();
		try {
			while (rs.next()) {
				String name = rs.getString("name");
				double price = rs.getDouble("price");
				int category = rs.getInt("category");
				result.add(new Book(name, price, category));
				
			}
			return result;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
