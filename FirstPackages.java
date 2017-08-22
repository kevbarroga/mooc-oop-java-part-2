import mooc.ui.UserInterface;
import mooc.ui.TextUserInterface;
import mooc.logic.ApplicationLogic;

public class FirstPackages {

	public static void main(String[] args) {
		UserInterface ui = new TextUserInterface();
		new ApplicationLogic(ui).execute(5);
	}
}
