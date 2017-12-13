package org.lee.designpatern.template;

public class TemplatePatternImpl2 extends TemplatePattern {

	@Override
	protected void method3() {
		System.out.println("method3()在子类TemplatePatternImpl2中实现了！！");

	}

	@Override
	public void method2() {
		System.out.println("子类TemplatePatternImpl2覆盖了父类的method2()方法！！");
	}

}