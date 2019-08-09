package cn.itcast.tag;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *@Title MyTag3.java
 *@description TODO
 *@time Aug 7, 2019 1:34:10 PM
 *@author kol
 *@version 1.0
 */
public class MyTag3 extends SimpleTagSupport{
	@Override
	public void doTag() throws JspException, IOException {
		Writer out = this.getJspContext().getOut();
		out.write("**************<br/>");
		this.getJspBody().invoke(out);
		out.write("<br/>**************");
	}
}
