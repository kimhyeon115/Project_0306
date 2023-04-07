package Package_3;

public abstract class Player {
	abstract void play(int pos);
	abstract void stop();
}
class AudioPlayer extends Player {
	void play(int pos) {}
	void stop() {}
}
class Unit {}
interface Fightable1 {							//인터페이스 추상메소드와 상수만 사용가능
	void move(int x, int y);
	void attack(Unit u);
}
interface Fightable2 {
	void move(int x, int y);
	void attack(Unit u);
}

class Fighter implements Fightable1, Fightable2 {		//인터페이서는 상속을 여러개 받을수 있다
	public void move(int x,int y) { }
	public void attack(Unit u) { }
}