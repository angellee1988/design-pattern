package org.lee.designpatern.strategy;

public class Test {

	public static void main(String[] args) {
//		Strategy strategy = new AddStrategy() ;
		Strategy strategy = new SubStrategy() ;
//		Strategy strategy = new MulStrategy() ;
//		Strategy strategy = new DivStrategy() ;
		strategy.operate(100, 10);
	}
}
