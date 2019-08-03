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
 * Servlet implementation class BookServlet
 */
@WebServlet("/BookServlet")
public class BookServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;
	
	private BookDao bookDao = new BookDao();
 
	public String findAll(HttpServletRequest req, HttpServletResponse resp) {
		List<Book> result = bookDao.findAll();
		req.getSession().setAttribute("result", result);
		return "/show.jsp";
	}
	
	public String findByCategory(HttpServletRequest req, HttpServletResponse resp) {
		String value = req.getParameter("category");
		int category = Integer.parseInt(value);
		List<Book> result = bookDao.findByCategory(category);
		req.getSession().setAttribute("result", result);
		return "/show.jsp";
	}

}
