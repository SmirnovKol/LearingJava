package cn.itcast.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String inputedCode = request.getParameter("verifyCode");
		String trueCode = (String) request.getSession().getAttribute("verifyCode");
		if(!trueCode.equalsIgnoreCase(inputedCode)) {
			request.setAttribute("codeError", "验证码错误！");
			request.getRequestDispatcher("/session/login.jsp").forward(request, response);
			return;
		}
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if (!"itcast".equalsIgnoreCase(username)) {
			//  log in successfully
			HttpSession session = request.getSession();
			session.setAttribute("username", username);
			session.setAttribute("password", password);
			
			Cookie cookie = new Cookie("username", username);
			cookie.setMaxAge(24*60*60);
			response.addCookie(cookie);
			Cookie cookie2 = new Cookie("password", password);
			cookie2.setMaxAge(24*60*60);
			response.addCookie(cookie2);
			
			response.sendRedirect("/day0805_001/session/success1.jsp");
		} else {
			// 登陆失败
			request.setAttribute("msg", "登录失败！");
			request.getRequestDispatcher("/session/login.jsp").forward(request, response);
		}
	}

}
