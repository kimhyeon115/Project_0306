package Package_4;

public interface Calc {
	double PI = 3.14;				//final double PI = 3.14 (기본값 final 생략됨)
	int error = 999999999;
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
}
