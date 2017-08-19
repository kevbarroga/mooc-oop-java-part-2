import java.util.ArrayList;

public class Box implements ToBeStored {
	private double maxWeight;
	private ArrayList<ToBeStored> boxes;

	public Box(double weight) {
		this.maxWeight = weight;
		this.boxes = new ArrayList<ToBeStored>();

	}

	public double weight() {
		double weight = 0.0;
		for (ToBeStored toStore : this.boxes) {
			weight += toStore.weight();
		}
		return weight;
	}

	public void add(ToBeStored toAdd) {
		double boxWeight = toAdd.weight();
		if (boxWeight + this.weight() <= this.maxWeight) {
			this.boxes.add(toAdd);
		}
	}

	public String toString() {
		int count = this.boxes.size();
		double weight = this.weight();

		return "Box: "+count+" things,"+" total weight "+weight+" kg";
	}

	public static void main(String[] args) {
		Box box = new Box(10);

		box.add( new Book("Fedor Dostojevski", "Crime and Punishment", 2) ) ;
		box.add( new Book("Robert Martin", "Clean Code", 1) );
		box.add( new Book("Kent Beck", "Test Driven Development", 0.7) );

		box.add( new CD("Pink Floyd", "Dark Side of the Moon", 1973) );
		box.add( new CD("Wigwam", "Nuclear Nightclub", 1975) );
		box.add( new CD("Rendezvous Park", "Closer to Being Here", 2012) );

		System.out.println( box );

		box = new Box(5);
		Box bb2 = new Box(1);

		box.add(new Book("Fedor Dostojevski", "Crime and Punishment", 2));

		bb2.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
		bb2.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
		bb2.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));

		box.add(bb2);

		System.out.println(box);
	}
}
