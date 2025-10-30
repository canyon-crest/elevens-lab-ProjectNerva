package Activity2;
/**
 * This is a class that tests the Deck class.
 */
public class DeckTester2 {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		Deck2 deck = new Deck2(new String[]{"Ace", "King", "Queen", "Jack"}, new String[]{"Spades", "Hearts", "Diamonds", "Clubs"}, new int[]{1,11,12, 13});

		String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
		int[] pointValue = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

		Deck2 d = new Deck2(ranks, suits, pointValue);
	}
}
