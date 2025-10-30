package Activity3;
import java.util.Arrays;
/**
 * This class provides a convenient way to test shuffling methods.
 */
public class Shuffler3 {

	/**
	 * The number of consecutive shuffle steps to be performed in each call
	 * to each sorting procedure.
	 */
	private static final int SHUFFLE_COUNT = 1;


	/**
	 * Tests shuffling methods.
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive perfect shuffles:");
		int[] values1 = {0, 1, 2, 3};
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			perfectShuffle(values1);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values1.length; k++) {
				System.out.print(" " + values1[k]);
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive efficient selection shuffles:");
		int[] values2 = {0, 1, 2, 3};
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			selectionShuffle(values2);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values2.length; k++) {
				System.out.print(" " + values2[k]);
			}
			System.out.println();
		}
		System.out.println();
	}


	/**
	 * Apply a "perfect shuffle" to the argument.
	 * The perfect shuffle algorithm splits the deck in half, then interleaves
	 * the cards in one half with the cards in the other.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void perfectShuffle(int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
		int[] shuffled = new int[values.length];
		int mid = values.length / 2;
		for (int i = 0; i < mid; i++) {
			shuffled[2 * i] = values[i];
			shuffled[2 * i + 1] = values[mid + i];
		}

		// give it back to the values
		for (int i = 0; i < values.length; i++) {
			values[i] = shuffled[i];
		}
	}

	/**
	 * Apply an "efficient selection shuffle" to the argument.
	 * The selection shuffle algorithm conceptually maintains two sequences
	 * of cards: the selected cards (initially empty) and the not-yet-selected
	 * cards (initially the entire deck). It repeatedly does the following until
	 * all cards have been selected: randomly remove a card from those not yet
	 * selected and add it to the selected cards.
	 * An efficient version of this algorithm makes use of arrays to avoid
	 * searching for an as-yet-unselected card.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void selectionShuffle(int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
		int[] shuffled = new int[values.length];
		for (int i = 0; i < values.length; i++) {
			int randIndex = (int) (Math.random() * (i + 1));
			shuffled[i] = values[randIndex];
			values[randIndex] = values[i];
		}

		for (int i = 0; i < values.length; i++) {
			values[i] = shuffled[i];
		}
	}

	public static void flip() {
		int prob = (int) (Math.random() * 3);
		if (prob == 0) {
			System.out.println("Tails");
		} else {
			System.out.println("Heads");
		}
	}

	public static boolean arePermutations(int[] value1, int[] value2) {
		if (value1.length != value2.length) {
			return false;
		}

		if (value1.length == 0 && value2.length == 0) {
			return true;
		}

		int[] value1Sort = value1;
		Arrays.sort(value1Sort);
		int[] value2Sort = value2;
		Arrays.sort(value2Sort);

		for (int i = 0; i < value1Sort.length; i++) {
			if (value1Sort[i] != value2Sort[i]) {
				return false;
				// break;
			}
		}

		return true;
	}
}
