import java.util.ArrayList;

/* TODO refactor start()
 */

public class Calculator {
	private Reader reader;
	private int count;

	public Calculator() {
		this.reader = new Reader();
		this.count = count;
	}

	public void start() {
		while (true) {
			System.out.print("command: ");
			String command = reader.readString();
			if (command.equals("exit") || command.equals("quit")) {
				break;
			}
			
			if (command.equals("sum")) {
				sum();
				count++;
			} else if (command.equals("diff")) {
				difference();
				count++;
			} else if (command.equals("product")) {
				product();
				count++;
			}
		}
		statistics();
	}

	public int multiplication(int fromInt) {
		if (fromInt < 0) {
			throw new IllegalArgumentException("Please enter non negative integer");
		}
		int multiplication = 1;
		for (int i = 0; i <= fromInt; i++) {
			multiplication *= i;
		}
		return multiplication;
	}

	public int binomialCoefficient(int setSize, int subsetSize) {
		if (setSize < 0 || subsetSize < 0 || setSize < subsetSize) {
			throw new IllegalArgumentException("Numbers must be positive and setSize must be grater then subsetSize");
		}
		int numerator = multiplication(setSize);
		int denominator = multiplication(subsetSize) * multiplication(setSize - subsetSize);
		return numerator / denominator;
	}

	private void sum() {
		int sum = inputNumbers().get(0) + inputNumbers().get(0);
		System.out.println("sum of values: " + sum);
	}

	private void difference() {
		int diff = inputNumbers().get(0) - inputNumbers().get(0);
		System.out.println("difference of values: " + diff);
	}

	private void product() {
		int product = inputNumbers().get(0) + inputNumbers().get(0);
		System.out.println("product of values: " + product);
	}

	private void statistics() {
		System.out.println("Calculations done: " + count);
	}

	private ArrayList<Integer> inputNumbers() {
		ArrayList<Integer> input = new ArrayList<Integer>();

		System.out.print("Value: ");
		int value1 = reader.readInteger();
		input.add(value1);

		return(input);
	}

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.start();
	}
}
