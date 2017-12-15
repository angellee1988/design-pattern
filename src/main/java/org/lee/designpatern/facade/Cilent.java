package org.lee.designpatern.facade;


/**
 * ¿Í»§¶ËÀà
 * 
 * @author Administrator
 *
 */
public class Cilent {
	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.start();
		System.out.println("=================");
		computer.shutDown();
	}

}