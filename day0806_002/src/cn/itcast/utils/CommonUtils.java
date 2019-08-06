package cn.itcast.utils;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.UUID;

import org.apache.commons.beanutils.BeanUtils;

/**
 *@Title CommonUtils.java
 *@description TODO
 *@time Aug 6, 2019 10:38:07 PM
 *@author kol
 *@version 1.0
 */
public class CommonUtils {
	public static String getUUID() {
		return UUID.randomUUID().toString().replace("-", "").toUpperCase();
	}
	
	public static <T> T toBean(Map<String, ? extends Object> map, Class<T> clazz) {
		try {
			T bean = clazz.getDeclaredConstructor().newInstance();
			BeanUtils.populate(bean, map);
			return bean;
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException e) {
			throw new RuntimeException(e);
		}
	}
}

