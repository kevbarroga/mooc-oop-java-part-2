import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class Dictionary {
	private HashMap<String, String> map;

	public Dictionary() {
		this.map = new HashMap<String, String>();
	}

	public String translate(String word) {
		return this.map.get(word);
	}

	public void add(String word, String translation) {
		this.map.put(word, translation);
	}

	public int amountOfWords() {
		return this.map.size();
	}

	public ArrayList<String> translationList() {
		ArrayList<String> list = new ArrayList<String>();

		for (String key : this.map.keySet()) {
			String value = this.map.get(key);

			list.add(key+" = "+value);
		}
		return list;
	}

	public static void main(String[] args) {
		Dictionary dictionary = new Dictionary();
		dictionary.add("apina", "monkey");
		dictionary.add("banaani", "banana");
		dictionary.add("cembalo", "harpsichord");

		System.out.println(dictionary.translate("apina"));
		System.out.println(dictionary.translate("porkkana"));

		System.out.println(dictionary.amountOfWords());
		
		ArrayList<String> translations = dictionary.translationList();
	    for(String translation: translations) {
			System.out.println(translation);
		}
	}
}
