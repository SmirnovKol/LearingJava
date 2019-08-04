package cn.itcast.book.web.servletresponse;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

/**
 *@Title StaticHtmlResponse.java
 *@description TODO
 *@time Aug 4, 2019 1:16:05 PM
 *@author kol
 *@version 1.0
 */
public class StaticHtmlResponse extends HttpServletResponseWrapper {

	private PrintWriter pw;
	/**
	 * 
	 * @param response
	 * @param fileName : path of the html file that will be generated
	 * @throws FileNotFoundException 
	 * @throws UnsupportedEncodingException 
	 */
	public StaticHtmlResponse(HttpServletResponse response, String fileName) throws FileNotFoundException, UnsupportedEncodingException {
		super(response);
		pw = new PrintWriter(fileName, "UTF-8");
	}

	@Override
	public PrintWriter getWriter() throws IOException {
		return pw;
	}
}
