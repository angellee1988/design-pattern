package org.lee.designpatern.strategy;

public class Test {

	public static void main(String[] args) {
		// Strategy strategy = new AddStrategy() ;
		// Strategy strategy = new SubStrategy() ;
		// Strategy strategy = new MulStrategy() ;
		// Strategy strategy = new DivStrategy() ;
		// strategy.operate(100, 10);

		Context context = new Context(new AddStrategy());
		System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

		context = new Context(new SubStrategy());
		System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

		context = new Context(new MulStrategy());
		System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
		
		context = new Context(new DivStrategy());
		System.out.println("10 / 5 = " + context.executeStrategy(10, 5));
	}
}
