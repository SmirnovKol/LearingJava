package cn.itcast.servlet;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

@WebServlet("/CityServlet")
public class CityServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/xml;charset=UTF-8");
		String provinceName = request.getParameter("province");
		SAXReader reader = new SAXReader();
		InputStream input = this.getClass().getResourceAsStream("/china.xml");
		try {
			Document doc = reader.read(input);
			Node proNode = doc.selectSingleNode("//province[@name='" + provinceName + "']");
			response.getWriter().print(proNode.asXML());
		} catch (DocumentException e) {
			throw new RuntimeException(e);
		}
		
	}

}
