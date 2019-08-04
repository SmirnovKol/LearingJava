package cn.itcast.book.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.itcast.book.dao.BookDao;
import cn.itcast.book.domain.Book;

/**
 *@Title BookServlet.java
 *@description TODO
 *@time Aug 4, 2019 6:52:12 AM
 *@author kol
 *@version 1.0
 */

//@WebServlet(urlPatterns = {"/BookServlet"})
@WebServlet("/BookServlet")
public class BookServlet extends BaseServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = -9058944749035471935L;
	private BookDao bookDao = new BookDao();
	
	public String findAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Book> result = bookDao.findAll();
		req.setAttribute("result", result);
		return "/show.jsp";
	}
	

	public String findByCategory(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String value = req.getParameter("category");
		int category = Integer.parseInt(value);
		//System.out.println("category=" + category);
		List<Book> result = bookDao.findByCategory(category);
		//System.out.println(result);
		req.setAttribute("result", result);
		return "/show.jsp";
	}
}
