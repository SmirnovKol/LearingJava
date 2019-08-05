package cn.itcast.commons;

import java.util.UUID;

import org.junit.Test;

/**
 *@Title CommonUtils.java
 *@description TODO
 *@time Aug 5, 2019 10:34:15 PM
 *@author kol
 *@version 1.0
 */
public class CommonUtils {

	private CommonUtils() {}

	public static String getUUID() {
		return UUID.randomUUID().toString().replace("-", "").toUpperCase();
	}
}
