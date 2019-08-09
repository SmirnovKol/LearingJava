package cn.itcast.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *@Title MyTag5.java
 *@description TODO
 *@time Aug 7, 2019 2:03:01 PM
 *@author kol
 *@version 1.0
 */
public class MyTag5 extends SimpleTagSupport {
	private boolean test;
	

	public void setTest(boolean test) {
		this.test = test;
	}

	@Override
	public void doTag() throws JspException, IOException {
		if (test) {
			this.getJspBody().invoke(this.getJspContext().getOut());
		}
	}
}
