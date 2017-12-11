package org.lee.designpatern.prototype;

import java.util.ArrayList;

public class Client {
	public static void main(String[] args) {
		Prototype cp = new Prototype();
		
		cp.setmInt(10);
		ArrayList list = new ArrayList<>() ;
		list.add("原型模式") ;
		cp.setList(list);
		
		Prototype clonecp = cp.deepClone();
//		Prototype clonecp = cp.clone();
		
		System.out.println("mInt:"+clonecp.getmInt());
		System.out.println("list:"+clonecp.getList());
		
		cp.setmInt(20);
		list.add("拷贝原型模式") ;
		cp.setList(list);
		
		System.out.println("mInt:"+clonecp.getmInt());
		System.out.println("list:"+clonecp.getList());
	}
}