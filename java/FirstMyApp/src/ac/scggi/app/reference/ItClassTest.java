package ac.scggi.app.reference;

public class ItClassTest {
	public static void main(String[] args) {
		ItClass javaCls = null;
		// 
		Student[] students = new Student[5];
		students[0] = new Student("�輺��", "��õ�� 1", 90, 80, 75);
		students[1] = new Student("��鼷", "��õ�� 2", 91, 85, 83);
		students[2] = new Student("�̿뼱", "��õ�� 3", 70, 80, 90);
		students[3] = new Student("Ȳ����", "��õ�� 4", 70, 65, 90);
		students[4] = new Student("�뼺��", "��õ�� 5", 80, 85, 73);
		
		javaCls = new ItClass("java class", students);
		
		javaCls.showInfo();
	}
}
