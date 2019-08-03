package cn.itcast.book.web.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BaseServlet
 */
@WebServlet("/BaseServlet")
public class BaseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String methodName = req.getParameter("method");
		Method method = null;
		try {
			method = this.getClass().getMethod(methodName, HttpServletRequest.class, HttpServletResponse.class);
		} catch (NoSuchMethodException | SecurityException e) {
			throw new RuntimeException(e);
		}
		
		try {
			String result = (String) method.invoke(this, req, resp);
			req.getRequestDispatcher(result).forward(req, resp);
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			throw new RuntimeException(e);
		}
	}
}
