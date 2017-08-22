public class Card implements Comparable<Card> {
	/*
	 *  Static constant variables
	 *  They can be accesedd outside of Card class
	 *  ex. Card.DIAMONDs
	 */
	public static final int SPADES = 0;
	public static final int DIAMONDS = 1;
	public static final int HEARTS = 2;
	public static final int CLUBS = 3;

    public static final String[] SUITS = {"Spades", "Diamonds", "Hearts", "Clubs"};
	public static final String[] VALUES = {"-", "-", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
	private final int value;
	private final int suit;

	public Card(int value, int suit) {
		this.value = value;
		this.suit = suit;
	}

	public int getValue() {
		return this.value;
	}

	public int getSuit() {
		return this.suit;
	}

	@Override
	public String toString() {
		return VALUES[value]+" of "+SUITS[suit];
	}

	@Override
	public int compareTo(Card card) {
		if (this.value != card.getValue()) {
			return this.value - card.getValue();
		} else {
			return this.suit - card.getSuit();
		}
	}

	public static void main(String[] args) {
		Card first = new Card(2, Card.DIAMONDS);
		Card second = new Card(14, Card.CLUBS);
		Card third = new Card(12, Card.HEARTS);
		Card fourth = new Card(10, Card.SPADES);

		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		System.out.println(fourth);
	}
}
