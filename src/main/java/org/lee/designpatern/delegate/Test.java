package org.lee.designpatern.delegate;

public class Test {
	public static void main(String args[]) {
		B b = new B();
		b.method1();// invoke method2 of class A in fact
		b.method2();// invoke method1 of class A in fact
	}

}