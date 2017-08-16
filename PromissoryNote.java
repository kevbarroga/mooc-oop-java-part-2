import java.util.HashMap;
import java.util.Map;

public class PromissoryNote {
	private HashMap<String, Double> note;

	public PromissoryNote() {
		this.note = new HashMap<String, Double>();
	}

	public void setLoan(String toWhom, double value) {
		this.note.put(toWhom, value);
	}

	public double howMuchIsTheDebt(String whose) {
		if (this.note.containsKey(whose)) {
			return this.note.get(whose);
		}
		return 0;
	}

	public static void main(String[] args) {
		PromissoryNote myNote = new PromissoryNote();
		myNote.setLoan("Arto", 51.5);
		myNote.setLoan("Mikael", 30);

		System.out.println(myNote.howMuchIsTheDebt("Arto"));
		System.out.println(myNote.howMuchIsTheDebt("Joel"));

		myNote.setLoan("Arto", 10.5);
		System.out.println(myNote.howMuchIsTheDebt("Arto"));
	}

}
