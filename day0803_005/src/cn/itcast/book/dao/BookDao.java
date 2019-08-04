package cn.itcast.book.dao;
/**
 *@Title BookDao.java
 *@description TODO
 *@time Aug 4, 2019 7:10:42 AM
 *@author kol
 *@version 1.0
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import cn.itcast.book.domain.Book;

public class BookDao {

	public List<Book> findAll() {
		ComboPooledDataSource ds = new ComboPooledDataSource();
		QueryRunner queryRunner = new QueryRunner(ds);
		String sql = "select * from bookstore";
		List<Book> result = null;
		try {
			result = queryRunner.query(sql, new ResultSetHandler<List<Book>>() {

				@Override
				public List<Book> handle(ResultSet rs) throws SQLException {
					List<Book> list = new LinkedList<Book>();
					while (rs.next()) {
						String name = rs.getString("name");
						double price = rs.getDouble("price");
						int category = rs.getInt("category");
						list.add(new Book(name, price, category));
					}
					return list;
				}
				
			});
			return result;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
//		
//		// method 2
//		ComboPooledDataSource ds = new ComboPooledDataSource();
//		String sql = "select * from bookstore";
//		Connection conn = ds.getConnection();
//		PreparedStatement pstmt = conn.prepareStatement(sql);
//		ResultSet rs = pstmt.executeQuery();
//		List<Book> result = new LinkedList<Book>();
//		while (rs.next()) {
//			String name = rs.getString("name");
//			double price = rs.getDouble("price");
//			int category = rs.getInt("category");
//			result.add(new Book(name, price, category));
//		}
	
	}
	
	public List<Book> findByCategory(int category) {
		DataSource ds = new ComboPooledDataSource();
		QueryRunner queryRunner = new QueryRunner(ds);
		String sql = "select * from bookstore where category=?";
		try {
			List<Book> result = queryRunner.query(sql, new ResultSetHandler<List<Book>>() {

				@Override
				public List<Book> handle(ResultSet rs) throws SQLException {
					List<Book> list = new LinkedList<Book>();
					while (rs.next()) {
						String name = rs.getString("name");
						double price = rs.getDouble("price");
						int category = rs.getInt("category");
						list.add(new Book(name, price, category));
					}
					return list;
				}
				
			}, category);
			return result;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
