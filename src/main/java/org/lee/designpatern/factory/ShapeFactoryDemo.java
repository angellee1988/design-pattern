package org.lee.designpatern.factory;

public class ShapeFactoryDemo {
	public static void main(String[] args) {
		Rectangle rect = (Rectangle) ShapeFactory.getClass(Rectangle.class);
		rect.draw();
		Square square = (Square) ShapeFactory.getClass(Square.class);
		square.draw();
	}
}
