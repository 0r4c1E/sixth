package com.first.inheritance1;

public class Plane implements Flyable {

	@Override
	public void startEngine() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("����� ������ ���� ���Դϴ�.");
	}

	@Override
	public void run(int speed) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(speed + " ��ŭ ������ �����մϴ�.");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("����Ⱑ ���� ���Դϴ�.");
	}

}
