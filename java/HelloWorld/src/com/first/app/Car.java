package com.first.app;

public class Car {
	// ��� ����, member variable, �ν��Ͻ� ����(instance variable)
	int color;
	int speed;
	int mileage;
	
	// ������(constructor) �Լ�
	public Car(int s) {
		speed = s;
	}
	
	// ��� �Լ�, member method, �ν��Ͻ� �Լ�(instance method)
	void speedUp(int s) {
		this.speed = speed + s;
	}
	
	void speedDown(int s) {
		speed = speed - s;
	}
}
