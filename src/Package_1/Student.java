package Package_1;

public class Student extends Person {
	private String studentId;
	private int grade;
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void show() {
		System.out.println("이름 : " + super.getName());
		System.out.println("나이 : " + super.getAge());
		System.out.println("키 : " + super.getHeight());
		System.out.println("몸무게 : " + super.getWeight());
		System.out.println("학번 : " + studentId);
		System.out.println("학년 : " + grade);
	}
}
