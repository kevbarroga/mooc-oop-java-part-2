public class Student implements Comparable<Student> {
	private String name;

	public Student(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	@Override
	public int compareTo(Student student) {
		return this.name.compareToIgnoreCase(student.getName());
	}

	@Override
	public String toString() {
		return name;
	}

	public static void main(String[] args) {
		Student first = new Student("jamo");
		Student second = new Student("1jamo");
		Student third = new Student("jamo1");

		System.out.println(first.compareTo(second));
		System.out.println(first.compareTo(third));
	}
}
