import java.util.HashMap;

public class Book implements ToBeStored {
	private String writer;
	private String name;
	private int publishingYear;
	private double weight;

	public Book(String writer, String name, double weight) {
		this.writer = writer;
		this.name = name;
		this.weight = weight;
	}

	public Book(String name, int publishingYear) {
		this.name = name;
		this.publishingYear = publishingYear;
									    }

	public String getName() {
		return this.name;
	}

	public double weight() {
		return this.weight;
	}

	public int getPublishingYear() {
		return this.publishingYear;
	}

	@Override
	public String toString() {
		return this.writer+": "+this.name;
	}

	@Override
	public boolean equals(Object object) {
		if (object == null) {
			return false;
		}
		if (this.getClass() != object.getClass()) {
			return false;
		}

		Book compared = (Book) object;

		if (this.publishingYear != compared.getPublishingYear()) {
			return false;
		}

		if (this.name == null || !this.name.equals(compared.getName())) {
			return false;
		}

		return true;
	}

	public int hashCode() {
		if (this.name == null) {
			return 3;
		}

		return this.publishingYear + this.name.hashCode();
	}

	public static void main(String[] args) {
		HashMap<Book, String> loaners = new HashMap<Book, String>();

		Book objectBook = new Book("Object book", 2000);
		loaners.put(objectBook, "Pekka");
		loaners.put( new Book("TDD", 1999), "Trto" );

		System.out.println(objectBook);

		Book anotherObjectBook = new Book("Object book", 2000);

		if (objectBook.equals(anotherObjectBook)) {
			System.out.println("The books are the same");
		} else {
			System.out.println("The books are not the same");
		}

		System.out.println( loaners.get( objectBook ) );
		System.out.println( loaners.get( new Book("Object book", 2000) ));
		System.out.println( loaners.get( new Book("TDD", 1999) ));
	}
}
