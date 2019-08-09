package cn.itcast.servlet;

import java.io.InputStream;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

public class Test {

	public static void main(String[] args) {
		SAXReader reader = new SAXReader();
		Test test = new Test();
		InputStream input = test.getClass().getResourceAsStream("/china.xml");
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
			System.out.println(sb.toString());
		} catch (DocumentException e) {
			throw new RuntimeException(e);
		}
	}
}
