import java.util.ArrayList;

public class Changer {
	private ArrayList<Change> changes;

	public Changer() {
		this.changes = new ArrayList<Change>();
	}

	public void addChange(Change change) {
		changes.add(change);
	}

	public String change(String charStr) {
		for (Change change : changes) {
			charStr = change.change(charStr);
		}
		return charStr;
	}

	public static void main(String[] args) {
		Changer scandiesAway = new Changer();
		scandiesAway.addChange(new Change('ä', 'a'));
		scandiesAway.addChange(new Change('ö', 'o'));
		System.out.println(scandiesAway.change("ääliö älä lyö, ööliä läikkyy"));
	}
}

