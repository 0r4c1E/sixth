package ac.scggi.app.reference;

public class Test {
	// 인스턴스 함수
	public void pupAge() {
		int age = 0; // 초기화 하지 않고 연산 오류 발생
		age = age + 7;
		System.out.println("Puppy age is : " + age);
	}

	public static void main(String args[]) {
		Test test = new Test();
		test.pupAge();
	}
}
