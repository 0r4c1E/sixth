package com.first.app.data;

public class StudentTest {
	public static void main(String[] args) {
		Student stu1 = new Student("ȫ�浿", 100);
		Student stu2 = new Student("�⵿̱", 100);
		
		stu1.doAction(1);
		stu1.doAction(2);
		stu1.doAction(3);
		
		stu2.doAction(1);
		stu2.doAction(1);
		stu2.doAction(1);
		
		stu1.showInfo();
		stu2.showInfo();
	}
}
