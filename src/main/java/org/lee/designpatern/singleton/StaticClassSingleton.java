package org.lee.designpatern.singleton;

/**
 * 登记式/静态内部类
 * 
 * @author Administrator
 *
 */
public class StaticClassSingleton {
	
	private static class SingletonHolder {
		private static final StaticClassSingleton INSTANCE = new StaticClassSingleton();
	}

	private StaticClassSingleton() {
	}

	public static final StaticClassSingleton getInstance() {
		return SingletonHolder.INSTANCE;
	}
}
