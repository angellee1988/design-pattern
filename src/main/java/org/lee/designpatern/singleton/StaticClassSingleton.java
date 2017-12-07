package org.lee.designpatern.singleton;

/**
 * �Ǽ�ʽ/��̬�ڲ���
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