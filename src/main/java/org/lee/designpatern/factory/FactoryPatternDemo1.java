package org.lee.designpatern.factory;

public class FactoryPatternDemo1 {

	public static void main(String[] args) {
		ShapeFactory2 shapeFactory = new ShapeFactory2();

		// ��ȡ Circle �Ķ��󣬲��������� draw ����
		Shape shape1 = shapeFactory.getShape("CIRCLE");

		// ���� Circle �� draw ����
		shape1.draw();

		// ��ȡ Rectangle �Ķ��󣬲��������� draw ����
		Shape shape2 = shapeFactory.getShape("RECTANGLE");

		// ���� Rectangle �� draw ����
		shape2.draw();

		// ��ȡ Square �Ķ��󣬲��������� draw ����
		Shape shape3 = shapeFactory.getShape("SQUARE");

		// ���� Square �� draw ����
		shape3.draw();
	}
}