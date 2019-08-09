package cn.itcast.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.SkipPageException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *@Title MyTag4.java
 *@description TODO
 *@time Aug 7, 2019 1:52:14 PM
 *@author kol
 *@version 1.0
 */
public class MyTag4 extends SimpleTagSupport {
	@Override
	public void doTag() throws JspException, IOException {
		this.getJspContext().getOut().print("下面的代码不执行了");
		throw new SkipPageException("跳过页面");
	}
}
