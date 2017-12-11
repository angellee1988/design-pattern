package org.lee.designpatern.prototype;

public class Student implements Cloneable {
	String name;// ��������
	int age;
	Professor p;// ѧ��1��ѧ��2������ֵ����һ���ġ�

	Student(String name, int age, Professor p) {
		this.name = name;
		this.age = age;
		this.p = p;
	}

	public Object clone() {
		Student o = null;
		try {
			o = (Student) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println(e.toString());
		}
//		 o.p=(Professor)p.clone();
		return o;
	}

	public static void main(String[] args) {
		Professor p = new Professor("wangwu", 50);
		Student s1 = new Student("zhangsan", 18, p);
		Student s2 = (Student) s1.clone();
		s2.p.name = "lisi";
		s2.p.age = 30;
		System.out.println("name=" + s1.p.name + "," + "age=" + s1.p.age);
		System.out.println("name=" + s2.p.name + "," + "age=" + s2.p.age);
		// ������ѧ��1��2�Ľ��ڳ�Ϊlisi,ageΪ30��
	}
}