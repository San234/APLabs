/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		
		String[] ranks = {"jack", "queen", "king"};
		String[] suits = {"blue", "red","yellow"};
		int[] value = {11,12,13};
		

		Deck trump = new Deck(ranks, suits, value);//In Korea we call playing card as trump
		Deck playingCard = new Deck(ranks, suits, value);
		Deck joker = new Deck(ranks, suits, value);
	}
}
