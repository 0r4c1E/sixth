package ac.scggi.app.reference;

public class ItClass {
	public String clsName;
	Student[] students; // �迭
	
	public ItClass(String clsName, Student[] students) {
		this.clsName = clsName;
		this.students = students;
	}
	
	public void showInfo() {
		for(Student stu : students) {
			stu.showInfo();
		}
	}
}
