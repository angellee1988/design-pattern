package org.lee.designpatern.delegate;

/**
 * 委派模式（Delegate）是面向对象设计模式中常用的一种模式。这种模式的原理为类B和类A是两个互相没有任何关系的类，
 * B具有和A一模一样的方法和属性；并且调用B中的方法，属性就是调用A中同名的方法和属性。B好像就是一个受A授权委托的中介。
 * 第三方的代码不需要知道A的存在，也不需要和A发生直接的联系，通过B就可以直接使用A的功能，
 * 这样既能够使用到A的各种公能，又能够很好的将A保护起来了。一举两得，岂不很好！
 * @author xingjiang.li
 *
 * @date   2017年12月18日
 */
class B {
	// delegation
	A a = new A();

	// method with the same name in A
	void method1() {
		a.method1();
	}

	void method2() {
		a.method2();
	}

	// other methods and attributes
}