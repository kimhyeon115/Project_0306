package Package_4;
abstract class Unit1 {
	int x,y;
	abstract void move(int x, int y);
	void stop() {System.out.println("멈춥니다");}
}
interface Fightable {
	void move(int x, int y);			//public abstract가 생략됨
	void attack(Fightable f);			//public abstract가 생략됨
}
public class Unit2 extends Unit1 implements Fightable {			//추상클래스(Unit1)와 인터페이스(Fightable)를 모두 상속받음
																//인터페이스 먼저 상속시 오류??
	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack(Fightable f) {
		// TODO Auto-generated method stub
		
	}

}
