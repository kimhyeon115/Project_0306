package Package_4;

public class CalculatorTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
//		CompleteCalc cc = new CompleteCalc();
//		System.out.println(cc.add(num1,num2));
//		System.out.println(cc.substract(num1, num2));
//		cc.showInfo();
		Calc calc = new CompleteCalc();					//업캐스팅
		System.out.println(calc.add(num1, num2));
		CompleteCalc cc = (CompleteCalc)calc;			//다운캐스팅
		cc.showInfo();
	}

}
