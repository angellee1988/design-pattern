package org.lee.designpatern.prototype;

public class Client {
	public static void main(String[] args) {
		ConcretePrototype cp = new ConcretePrototype();
		ConcretePrototype clonecp = (ConcretePrototype) cp.deepClone(cp);
//		ConcretePrototype clonecp = (ConcretePrototype) cp.clone();
		clonecp.show();
	}
}