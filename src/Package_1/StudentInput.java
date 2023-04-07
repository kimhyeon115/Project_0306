package Package_1;

import java.util.Scanner;

public class StudentInput {
	Student student = new Student();
	public void stin() {
	Scanner scn = new Scanner(System.in);
	System.out.println("이름 입력");
	student.setName(scn.nextLine());
	System.out.println("나이 입력");
	student.setAge(scn.nextInt());
	System.out.println("키 입력");
	student.setHeight(scn.nextInt());
	System.out.println("몸무게 입력");
	student.setWeight(scn.nextInt());
	System.out.println("학번 입력");
	student.setStudentId(scn.next());
	System.out.println("학년 입력");
	student.setGrade(scn.nextInt());
	}
	public void stshow() {
	student.show();
	}
}
