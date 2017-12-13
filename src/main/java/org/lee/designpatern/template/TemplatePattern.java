package org.lee.designpatern.template;

/**
 * �������������������ֱ���method1()��method2()��method3()�� 
	method1()��˽�з���������ֻ���ɸ���ʵ���߼������ڷ�����private�ģ�����ֻ�ܸ�����á� 
	method2()����ν�Ĺ��ӷ����������ṩĬ��ʵ�֣������������б�Ҫ���ƣ�����Ը��Ǹ����Ĭ��ʵ�֡� 
	method3()���������ʵ�ֵķ��������ƶ��Ĳ��衣 
	�ɴ˿ɿ������㷨������ִ��˳�����ɸ����ƿصģ�����ֻ����ϡ� 
 *
 */
public abstract class TemplatePattern {

	// ģ�巽��
	public final void templateMethod() {

		method1();
		method2();// ���ӷ���
		method3();// ���󷽷�
	}

	private void method1() {
		System.out.println("����ʵ��ҵ���߼�");
	}

	public void method2() {
		System.out.println("����Ĭ��ʵ�֣�����ɸ���");
	}

	protected abstract void method3();// ���ฺ��ʵ��ҵ���߼�
}