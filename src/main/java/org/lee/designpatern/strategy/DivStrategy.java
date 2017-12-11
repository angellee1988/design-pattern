package org.lee.designpatern.strategy;

public class DivStrategy implements Strategy {

	@Override
	public void operate(int a, int b) {
		System.out.println("a/b="+(a/b));
	}

}
