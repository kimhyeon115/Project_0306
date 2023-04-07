package Package_2;
class count {
	int money = 50000;
	public void buying(Fuirt ft) {
		if(money < ft.price) {
			System.out.println("금액이 부족합니다");
		}
		else {
			money -= ft.price * ft.count;
			System.out.println(ft + " " + ft.count + "개를 구매 하였습니다");
		}
	}
}
public class FuirtMain {

	public static void main(String[] args) {
		count total = new count();
		total.buying(new Apple());
		total.buying(new Banana());
		System.out.println("잔액은 " + total.money + "원 입니다");
	}

}
