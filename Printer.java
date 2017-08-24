import java.io.File;
import java.util.Scanner;

public class Printer {
	private final File file;
	private Scanner reader;

	public Printer(String filename) throws Exception {
		this.file = new File(filename);
	}

	public void printLinesWhichContain(String word) throws Exception {
		reader = new Scanner(this.file);
		while (reader.hasNextLine()) {
			String s = reader.nextLine();
			if (s.contains(word)) {
				System.out.println(s);
			}
		}
		reader.close();
	}

	public static void main(String[] args) throws Exception {
		Printer printer = new Printer("txt/kalevala-samp.txt");

		printer.printLinesWhichContain("Väinämöinen");
		System.out.println("-----");
		printer.printLinesWhichContain("Frank Zappa");
		System.out.println("-----");
		printer.printLinesWhichContain("");
		System.out.println("-----");
	}

}
