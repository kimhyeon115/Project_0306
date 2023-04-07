package Package_3;

class mini {
	String name;
	String studentId;
	int kor;
	int mat;
	String addres;
	
	void printStudent() {
		int total = kor + mat;
		int avg = total / 2;
		System.out.println("이름 : " + name);
		System.out.println("학번 : " + studentId);
		System.out.println("국어 : " + kor);
		System.out.println("수학 : " + mat);
		System.out.println("합계 : " + total);
		System.out.println("평균 : " + avg);
		System.out.println("주소 : " + addres);
	}
}
public class miniStudent {


}
