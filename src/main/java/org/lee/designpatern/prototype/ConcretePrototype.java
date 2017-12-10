package org.lee.designpatern.prototype;

class ConcretePrototype extends Prototype {
	private static final long serialVersionUID = -1128292181266332871L;

	public void show() {
		System.out.println("mInt:"+getmInt());
		System.out.print("list:");
		for (String str : getList()) {
			System.out.println(str);
		}
		System.out.println();
	}
}