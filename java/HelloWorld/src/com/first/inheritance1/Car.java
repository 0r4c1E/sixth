package com.first.inheritance1;

public class Car implements Drivable {

	@Override
	public void startEngine() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("�ڵ��� ������ ���� ���Դϴ�.");
	}

	@Override
	public void run(int speed) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(speed + " ��ŭ ������ �����մϴ�.");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("�ڵ����� ���� ���Դϴ�.");
	}

}
