package org.lee.designpatern.prototype;

import java.util.ArrayList;

public class Client {
	public static void main(String[] args) {
		ConcretePrototype cp = new ConcretePrototype();
		ConcretePrototype deepClonecp = (ConcretePrototype) cp.deepClone(cp);
		ConcretePrototype clonecp = (ConcretePrototype) cp.clone();
		deepClonecp.show();
		
		cp.setmInt(10);
		ArrayList list = new ArrayList<>() ;
		list.add("原型模式") ;
		cp.setList(list);
		deepClonecp.show();
		
	}
}