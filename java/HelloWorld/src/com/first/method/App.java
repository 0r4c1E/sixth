package com.first.method;

public class App {
	// Ŭ���� �Լ�
	static void callByValue(int x, int y) {
		x++; // x = x + 1;
		y++; // y = y + 1;
	}
	// Ŭ���� �Լ�
	static void callByReference(Param p) {
		p.x = p.x + 1;
	}
}
