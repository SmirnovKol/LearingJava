package cn.itcast.tag;

import java.io.IOException;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.JspTag;
import javax.servlet.jsp.tagext.SimpleTag;

/**
 *@Title MyTag.java
 *@description TODO
 *@time Aug 7, 2019 10:24:03 AM
 *@author kol
 *@version 1.0
 */
public class MyTag implements SimpleTag{
	private JspFragment body;
	private PageContext pageContext;

	@Override
	public void doTag() throws JspException, IOException {
		// TODO Auto-generated method stub
		pageContext.getOut().print("hello MyTag.doTag()");
	}

	@Override
	public JspTag getParent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setJspBody(JspFragment jspBody) {
		// TODO Auto-generated method stub
		this.body = jspBody;
	}

	@Override
	public void setJspContext(JspContext pc) {
		// TODO Auto-generated method stub
		this.pageContext = (PageContext) pc;
	}

	@Override
	public void setParent(JspTag parent) {
		// TODO Auto-generated method stub
		
	}

}
