package Package_3;

public class ComputerMain {

	public static void main(String[] args) {
		Computer c2 = new DeskTop();
		c2.display();
		NoteBook notebook = new NoteBook();
		notebook.typing();
		DeskTop dt = (DeskTop)c2;
		dt.typing();
	}

}
