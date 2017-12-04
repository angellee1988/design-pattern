package org.lee.designpatern.factory;

public class ShapeFactory {
	public static Object getClass(Class<? extends Shape> clazz) {
		Object obj = null;
		try {
			obj = Class.forName(clazz.getName()).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return obj;
	}
}