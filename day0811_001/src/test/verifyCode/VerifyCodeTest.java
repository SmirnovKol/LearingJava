package test.verifyCode;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import cn.itcast.user.utils.VerifyCode;

public class VerifyCodeTest {
	
		public static void main(String[] args) throws IOException {
			VerifyCode code = new VerifyCode();
			BufferedImage image = code.createImage();
			String text = code.getText();
			System.out.println(text);
			ImageIO.write(image,"jpg",new File("D:/image.jpg"));
		}
	
}
