package Package_3;
interface Cat {
	abstract void crying();
	public void show();
}
interface Dog {
	abstract void crying();
	public void two();						//abstract 생략됨 (기본으로 있다고 봄)
}
public class DMain implements Dog, Cat {	//인터페이스 상속 명령어 implements

	public static void main(String[] args) {
		DMain dm = new DMain();
		dm.crying();
		dm.show();
		dm.two();
	}
	@Override
	public void crying() {
		System.out.println("울다");
	}
	@Override
	public void show() {
		System.out.println("보인다");
	}
	@Override
	public void two() {
		System.out.println("잔다");		
	}

}
//추상 클래스										인터페이스
//추상메서드가 1개 이상								모든 메서드가 추상메서드
//상속 명령 extends								상속 명령 implements
//												모든 제어자가 public
