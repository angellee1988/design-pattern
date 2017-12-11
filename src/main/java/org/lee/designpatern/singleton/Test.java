package org.lee.designpatern.singleton;

public class Test {
	public static void main(String[] args) {
		EnumSingleton singleton = EnumSingleton.INSTANCE ;
		singleton.whateverMethod();
		
		switch(singleton) {
			case INSTANCE :
				break;
			default:
				break;
		}
	}
}
