package com.first.inheritance;

public class Child extends Parent{
	public Child(String name, String bornYear) {
		// name�� ���������ڴ� private�̹Ƿ�, name�� ����� Ŭ���� �������� ���� ����
//		this.name = name;
		setName(name);
		this.bornYear = bornYear;
	}
}