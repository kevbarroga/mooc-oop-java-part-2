import java.util.ArrayList;

public class Container {
	private int maxWeight;
	private ArrayList<Suitcase> suitcases;

	public Container(int weight) {
		this.maxWeight = weight;
		this.suitcases = new ArrayList<Suitcase>();
	}
	
	public void addSuitcase(Suitcase suitcase) {
		int weight = totalWeight();
		weight += suitcase.totalWeight();
		if (weight <= this.maxWeight) {
			this.suitcases.add(suitcase);
		}
	}

	public int totalWeight() {
		int totWeight = 0;
		for (int i = 0; i < this.suitcases.size(); i++) {
			totWeight += this.suitcases.get(i).totalWeight();
		}
		return totWeight;
	}

	public String toString() {
		return this.suitcases.size()+" suitcases ("+this.totalWeight()+" kg)";
	}

	public void printThings() {
		for (Suitcase suitcase : this.suitcases) {
			suitcase.printThings();
		}
	}

	public static void main(String[] args) {
		Thing book = new Thing("Happiness in Three Steps", 2);
		Thing mobile = new Thing("Nokia 3210", 1);
		Thing brick = new Thing("Brick", 4);

        Suitcase tomsCase = new Suitcase(10);
		tomsCase.addThing(book);
		tomsCase.addThing(mobile);

		Suitcase georgesCase = new Suitcase(10);
		georgesCase.addThing(brick);

		Container container = new Container(1000);
		container.addSuitcase(tomsCase);
		container.addSuitcase(georgesCase);
		
		System.out.println(container);

		System.out.println("Container contents:");
		container.printThings();
		
		container = new Container(1000);
		addSuitcasesFullOfBricks(container);
		System.out.println(container);
	}

	public static void addSuitcasesFullOfBricks(Container container) {
		for (int i = 0; i < 100; i++) {
			Thing brick = new Thing ("brick", i + 1);
			Suitcase sc = new Suitcase(101);
			sc.addThing(brick);
			container.addSuitcase(sc);
		}
	}
}
