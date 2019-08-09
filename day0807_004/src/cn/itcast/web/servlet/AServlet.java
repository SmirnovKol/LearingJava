package cn.itcast.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
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
		response.setContentType("text/xml;charset=utf-8");
		String xml = "<students>"
				+ "<student id='1110329'>"
				+ "<name>ÕÅÈý</name>"
				+ "<age>26</age>"
				+ "<sex>ÄÐÐÔ</sex>"
				+ "</student>"
				+ "</students>";
		response.getWriter().print(xml);
	}

}
