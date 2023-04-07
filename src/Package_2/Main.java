package Package_2;

public class Main {
	void move(Animal animal) {
		animal.move();
	}
	public static void main(String[] args) {
		Main main = new Main();
		main.move(new Dog());		//Animal animal = new Dog();
		main.move(new Cat());		//Animal animal = new Cat();
		main.move(new Panda());		//Animal animal = new Panda();
	}

}
