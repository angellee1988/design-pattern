package org.lee.designpatern.iterator;

public class Client {
	public static void main(String[] args) {
		Aggregate ag = new ConcreteAggregate();
		ag.add("С��");
		ag.add("С��");
		ag.add("С��");
		Iterator it = ag.iterator();
		while (it.hasNext()) {
			String str = (String) it.next();
			System.out.println(str);
		}
	}
}