package org.lee.designpatern.prototype;

public class Student implements Cloneable {
	String name;// 常量对象。
	int age;
	Professor p;// 学生1和学生2的引用值都是一样的。

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
		// 输出结果学生1和2的教授成为lisi,age为30。
	}
}