public class Change {
	private char fromChar;
	private char toChar;

	public Change(char fromChar, char toChar) {
		this.fromChar = fromChar;
		this.toChar = toChar;
	}

	public String change(String charStr) {
		String replacedStr = "";
		for (int i = 0; i < charStr.length(); i++) {
			char curChar = charStr.charAt(i);
			if (curChar == this.fromChar) {
				replacedStr += this.toChar;
			} else {
				replacedStr += curChar;
			}
		}
		return replacedStr;
	}

	public static void main(String[] args) {
		String word = "carrot";
		Change change1 = new Change('a', 'b');
		word = change1.change(word);

		System.out.println(word);

		Change Change2 = new Change('r', 'x');
		word = Change2.change(word);

		System.out.println(word);
	}
}
