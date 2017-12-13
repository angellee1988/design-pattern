package org.lee.designpatern.template;

/**
 * 父类中有三个方法，分别是method1()，method2()和method3()。 
	method1()是私有方法，有且只能由父类实现逻辑，由于方法是private的，所以只能父类调用。 
	method2()是所谓的勾子方法。父类提供默认实现，如果子类觉得有必要定制，则可以覆盖父类的默认实现。 
	method3()是子类必须实现的方法，即制定的步骤。 
	由此可看出，算法的流程执行顺序是由父类掌控的，子类只能配合。 
 *
 */
public abstract class TemplatePattern {

	// 模板方法
	public final void templateMethod() {

		method1();
		method2();// 勾子方法
		method3();// 抽象方法
	}

	private void method1() {
		System.out.println("父类实现业务逻辑");
	}

	public void method2() {
		System.out.println("父类默认实现，子类可覆盖");
	}

	protected abstract void method3();// 子类负责实现业务逻辑
}