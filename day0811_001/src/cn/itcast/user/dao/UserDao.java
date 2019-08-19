package cn.itcast.user.dao;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import cn.itcast.user.domain.User;

public class UserDao {
	private String path = "D:/users.xml";
	
	public User findByUsername(String username) {
		SAXReader reader = new SAXReader();
		try {
			Document doc = reader.read(path);
			Element element = (Element) doc.selectSingleNode("//user[@username='" + username + "']");
			if (element == null) {
				return null;
			}
			User user = new User();
			user.setUsername(element.attributeValue("username"));
			user.setPassword(element.attributeValue("password"));
			return user;
		} catch (DocumentException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void add(User user) {
		SAXReader reader = new SAXReader();
		try {
			Document doc = reader.read(path);
			Element root = doc.getRootElement();
			Element newElement = root.addElement("user");
			newElement.addAttribute("username", user.getUsername());
			newElement.addAttribute("password", user.getPassword());
			
			OutputFormat format = new OutputFormat("\t", true);
			format.setTrimText(true);
			
			XMLWriter writer = new XMLWriter(new OutputStreamWriter(new FileOutputStream(path) , "UTF-8"), format);
			writer.write(doc);
			writer.close();
		} catch (DocumentException | IOException e) {
			throw new RuntimeException(e);
		}
	}
}
