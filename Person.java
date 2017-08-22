import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person implements Comparable <Person> {
	private int salary;
	private String name;

	public Person(String name, int salary) {
		if (name == null || name.length() > 40 || name.equals("")) {
			throw new IllegalArgumentException("Please enter a valid name.");
		}
		if (age < 0 || age > 120) {
			throw new IllegalArgumentException("Please enter a valid age.");
		}
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return name + " " + salary;
	}
							    
	@Override
	public int compareTo(Person person){
		if (this.salary == person.getSalary()){
			return 0;
		} else if (this.salary > person.getSalary()){
			return -1;
		} else {
			return 1;
		}
	}

	public static void main(String[] args) {
		List<Person> people = new ArrayList<Person>();
		people.add(new Person("Matti", 150000));
		people.add(new Person("Pekka", 3000));
		people.add(new Person("Mikko", 300));
		people.add(new Person("Arto", 10));
		people.add(new Person("Merja", 500));
		people.add(new Person("Pertti", 80));

		System.out.println(people);

		Collections.sort(people);
		System.out.println(people);
	}

}

