package org.lee.designpatern.strategy;

public class MulStrategy implements Strategy {

	@Override
	public int operate(int a, int b) {
		return a*b;
	}

}
