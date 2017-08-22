package mooc.logic;

import mooc.ui.UserInterface;

public class ApplicationLogic {
	private final UserInterface interface1;

	public ApplicationLogic(UserInterface ui) {
		this.interface1 = ui;
	}

	public void execute(int howManyTimes) {
		for (int i = 0; i < howManyTimes; i++) {
			System.out.println("The app logic works!");
			interface1.update();
		}
	}
}
