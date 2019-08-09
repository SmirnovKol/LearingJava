package cn.itcast.web.servlet;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AServlet
 */
@WebServlet("/AServlet")
public class AServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie[] cookies = request.getCookies();
		for (Cookie cookie : cookies) {
			response.getWriter().append(cookie.getName() + "=" + cookie.getValue() + "<br>");
		}
		response.getWriter().append("<br>Served at: ").append(request.getContextPath());
	}


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=utf-8");
		Map<String, String[]> map = req.getParameterMap();
		StringBuilder sb = new StringBuilder();
		map.forEach((k, v)->{
			sb.append(k + "=" + String.join(",", v) + "<br>");
		});
		resp.getWriter().append(sb.toString());
	}
}
