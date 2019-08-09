package cn.itcast.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *@Title MyTag2.java
 *@description TODO
 *@time Aug 7, 2019 11:56:23 AM
 *@author kol
 *@version 1.0
 */
public class MyTag2 extends SimpleTagSupport{

	@Override
	public void doTag() throws JspException, IOException {
		this.getJspContext().getOut().print("MyTag2.doTag()");
	}
}
