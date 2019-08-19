package cn.itcast.user.web.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import cn.itcast.user.domain.User;
import cn.itcast.user.service.UserException;
import cn.itcast.user.service.UserService;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		UserService userService = new UserService();
		
		User bean = new User();
		try {
			BeanUtils.populate(bean, request.getParameterMap());
			
			// 验证码校验
			String session_vcode = (String) request.getSession().getAttribute("session_vcode");
			if (!session_vcode.equalsIgnoreCase(bean.getVerifyCode())) {
				request.setAttribute("msg", "验证码错误!");
				request.setAttribute("user", bean);
				request.getRequestDispatcher("/user/register.jsp").forward(request, response);
				return;
			}
			
			try {
				userService.register(bean);
				response.getWriter().print("<h1>注册成功!</h1><a href='" + request.getContextPath() + "/user/login.jsp'>点击这里去登录</a>");
			} catch (UserException e) {
				request.setAttribute("msg", e.getMessage());
				request.setAttribute("user", bean);
				request.getRequestDispatcher("/user/register.jsp").forward(request, response);
			}
		} catch (IllegalAccessException | InvocationTargetException e) {
			throw new RuntimeException(e);
		}
	}

}
