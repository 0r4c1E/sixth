package ac.scggi.app;

public class CarTest {
	public static void main(String[] args) {
		Car smCar = new Car("����Ｚ", "white", 25000000, "gasolin", "auto", "�������̺�");
		Car kCar = new Car("���", "black", 30000000, "diesel", "manual", "�������̺�");
		
		smCar.showInfo();
		kCar.showInfo();
	}
}
