package cn.itcast.user.web.servlet;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.itcast.user.utils.VerifyCode;

@WebServlet("/VerifyCodeServlet")
public class VerifyCodeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		VerifyCode vc = new VerifyCode();
		BufferedImage image = vc.createImage();
		request.getSession().setAttribute("session_vcode", vc.getText());
		//VerifyCode.output(image, response.getOutputStream());
		ImageIO.write(image, "jpg", response.getOutputStream());
	}

}
