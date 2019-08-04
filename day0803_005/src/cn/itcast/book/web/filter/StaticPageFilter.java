package cn.itcast.book.web.filter;

import java.io.File;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.itcast.book.web.servletresponse.StaticHtmlResponse;

/**
 * Servlet Filter implementation class StaticPageFilter
 */
@WebFilter(servletNames = { "a" })
//@WebFilter(urlPatterns = {"/BookServlet"})
public class StaticPageFilter implements Filter {
	
	private FilterConfig fConfig;

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		
		String category = req.getParameter("category");
		String htmlPage = category + ".html";
		String htmlPath = fConfig.getServletContext().getRealPath("/htmls");
		File file = new File(htmlPath, htmlPage);
		// req.getContextPath() == "/day0803_005";
		if (file.exists()) {
			resp.sendRedirect(req.getContextPath()+ "/htmls/" + htmlPage);
			return;
		}
		
		StaticHtmlResponse shResponse = new StaticHtmlResponse(resp, file.getAbsolutePath());
		chain.doFilter(req, shResponse);
		
		resp.sendRedirect(req.getContextPath() + "/htmls/" + htmlPage);
		
	}
	
	public void init(FilterConfig fConfig) throws ServletException {
		this.fConfig = fConfig;
	}

}
