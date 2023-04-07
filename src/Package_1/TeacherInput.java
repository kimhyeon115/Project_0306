package Package_1;

import java.util.Scanner;

public class TeacherInput {
	Teacher teacher = new Teacher();
	public void tcin() {	
	Scanner scn = new Scanner(System.in);
	System.out.println("이름 입력");
	teacher.setName(scn.nextLine());
	System.out.println("나이 입력");
	teacher.setAge(scn.nextInt());
	System.out.println("키 입력");
	teacher.setHeight(scn.nextInt());
	System.out.println("몸무게 입력");
	teacher.setWeight(scn.nextInt());
	System.out.println("교번 입력");
	teacher.setTeacherId(scn.next());
	System.out.println("년차 입력");
	teacher.setMonthSalary(scn.nextInt());
	}
	public void tcshow() {
		teacher.show2();
	}
}
