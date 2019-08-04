import java.io.File;

/**
 *@Title Test.java
 *@description TODO
 *@time Aug 4, 2019 10:45:48 AM
 *@author kol
 *@version 1.0
 */
public class Test {

	public static void main(String[] args) {
		String htmlPath = "D:\\Program Files\\apache-tomcat-9.0.22\\wtpwebapps\\day0803_005\\htmls";
		String htmlPage = "null.html";
		File file = new File(htmlPath, htmlPage);
		System.out.println(file.exists());
		System.out.println(htmlPath + "\\" + htmlPage);
	}
}
