package cn.itcast.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;


@WebServlet("/ProvinceServlet")
public class ProvinceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		SAXReader reader = new SAXReader();
		InputStream input = this.getClass().getResourceAsStream("/china.xml");
		try {
			Document doc = reader.read(input);
			List<Node> attributes = doc.selectNodes("//province/@name");
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < attributes.size(); i++) {
				sb.append(attributes.get(i).getStringValue());
				if (i < attributes.size() - 1) {
					sb.append(",");
				}
			}
			response.getWriter().print(sb.toString());
		} catch (DocumentException e) {
			throw new RuntimeException(e);
		}

	}


}
