package com.first.inheritance1;

public class Client {
	public static void main(String[] args) {
		// Car Ŭ������ �ν��Ͻ� ����
		Car c = new Car();
		// Plane Ŭ������ �ν��Ͻ� ����
		Plane p = new Plane();
		try {
			Client.foo(c);
			Client.foo(p);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		Client.bar(c);
		Client.bar(p);
	}
	
	public static void foo(Vehicle v) throws Exception {
		v.startEngine();
		v.run(1);
	}
	public static void bar(Flyable f) {
		f.fly();
	}
}
