package org.lee.designpatern.singleton;

/**
 * ¶ñººÊ½
 * 
 * @author Administrator
 *
 */
public class Singleton {
	private static Singleton instance = new Singleton();

	private Singleton() {
	}

	public static Singleton getInstance() {
		return instance;
	}
}