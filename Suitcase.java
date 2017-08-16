import java.util.ArrayList;

public class Suitcase {
	private int maxWeight;
	private ArrayList<Thing> things;

	public Suitcase(int weight) {
		this.maxWeight = weight;
		this.things = new ArrayList<Thing>();
	}

	public void addThing(Thing thing) {
		int weight = this.totalWeight();
		weight += thing.getWeight();
		if (weight <= this.maxWeight) {
			this.things.add(thing);
		}
	}

	public String toString() {
		if (this.things.size() == 0) {
			return "empty "+this.totalWeight()+" kg)";
		} else if (this.things.size() == 1) {
			return this.things.size()+" thing ("+this.totalWeight()+" kg)";
		} else {
			return this.things.size()+" things ("+this.totalWeight()+" kg)";
		}
	}

	public void printThings() {
		for (Thing thing : this.things) {
			System.out.println(thing.getName()+" ("+thing.getWeight()+" kg)");
		}
	}

	public int totalWeight() {
		int totWeight = 0;
		for (int i = 0; i < this.things.size(); i++) {
			totWeight += this.things.get(i).getWeight();
		}
		return totWeight;
	}

	public Thing heaviestThing() {
		Thing heaviest = things.get(0);
		for (Thing thing : things) {
			if (heaviest.getWeight() < thing.getWeight()) {
				heaviest = thing;
			}
		}
		return heaviest;
	}

	public static void main(String[] args) {
		Thing book = new Thing("Happiness in three steps", 2);
		Thing mobile = new Thing("Nokia 3210", 1);
		Thing brick = new Thing("Brick", 4);
		
		Suitcase suitcase = new Suitcase(10);
		suitcase.addThing(book);
		suitcase.addThing(mobile);
		suitcase.addThing(brick);													

		System.out.println("Suitcase contains: ");
		suitcase.printThings();
		System.out.println("Total weight "+suitcase.totalWeight()+" kg");

		Thing heaviest = suitcase.heaviestThing();
		System.out.println("Heaviest thing: " + heaviest);

	}

}
