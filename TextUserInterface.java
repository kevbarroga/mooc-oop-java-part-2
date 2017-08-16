import java.util.Scanner;

public class TextUserInterface {
	private final Scanner reader;
	private final Dictionary dict;

	public TextUserInterface(Scanner reader, Dictionary dictionary) {
		this.reader = reader;
		this.dict = dictionary;
	}

	public void start() {
		startStatements();

		while(true) {
			System.out.println("Statement");

			String input = this.reader.nextLine().trim();

			if (input.equalsIgnoreCase("add")) {
				add();
			} else if (input.equalsIgnoreCase("translate")) {
				translate();
			} else if (input.equalsIgnoreCase("quit")) {
				System.out.println("Mahalo!");
				break;
			} else {
				System.out.println("Unknown statement");
			}
		}
	}

    public void startStatements() {
		System.out.println("Statements:");
		System.out.println("add - adds a word pair to the dictionary");
		System.out.println("translate - asks a word and prints its translation");
		System.out.println("quit - quit the text user interface");
		System.out.println("");
	}

	public void add() {
		System.out.println("In Finnish: ");
		String finnishWord = reader.nextLine();
		System.out.println("Translation: ");
		String englishWord = reader.nextLine();
		this.dict.add(finnishWord, englishWord);
	}

	public void translate() {
		System.out.println("Give a word: ");
		String finnishWord = reader.nextLine();
		String key = dict.translate(finnishWord);
		System.out.println("Translation: " + key);
	}
}
