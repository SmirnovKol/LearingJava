# based on program day0803_005, when you first search something, an html file will be generated to show the result; 
when you search the same thing again, this generated html file will be given to you (there is no need to visit the database again)
# the core methods  is as follows:

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
	
