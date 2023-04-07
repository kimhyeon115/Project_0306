package Package_1;

public class Teacher extends Person {
	private String teacherId;
	private int monthSalary;
	public String getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}
	public int getMonthSalary() {
		return monthSalary;
	}
	public void setMonthSalary(int monthSalary) {
		this.monthSalary = monthSalary;
	}
//	public Teacher(String name, int age, int height, int weight, String teacherId, int monthSalary) {
//		super(name, age, height, weight);
//		this.teacherId = teacherId;
//		this.monthSalary = monthSalary;
//	}
	public void show2() {
		System.out.println("이름 : " + super.getName());
		System.out.println("나이 : " + super.getAge());
		System.out.println("키 : " + super.getHeight());
		System.out.println("몸무게 : " + super.getWeight());
		System.out.println("교번 : " + teacherId);
		System.out.println("년차 : " + monthSalary);
	}
	
}
