/**
 * This is a class that tests the Deck class.
 */
package ElevensLab;

public class DeckTesterAct4 {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks = {"jack", "queen", "king"};
		String[] suits = {"blue", "red"};
		int[] pointValues = {11, 12, 13};
		Deck d = new Deck(ranks, suits, pointValues);

		System.out.println("**** Original Deck Methods ****");
		System.out.println("  toString:\n" + d.toString());
		System.out.println("  isEmpty: " + d.isEmpty());
		System.out.println("  size: " + d.size());
		System.out.println();
		System.out.println();

		System.out.println("**** Deal a Card ****");
		System.out.println("  deal: " + d.dealCard());
		System.out.println();
		System.out.println();

		System.out.println("**** Deck Methods After 1 Card Dealt ****");
		System.out.println("  toString:\n" + d.toString());
		System.out.println("  isEmpty: " + d.isEmpty());
		System.out.println("  size: " + d.size());
		System.out.println();
		System.out.println();

		System.out.println("**** Deal Remaining 5 Cards ****");
		for (int i = 0; i < 5; i++) {
			System.out.println("  deal: " + d.dealCard());
		}
		System.out.println();
		System.out.println();

		System.out.println("**** Deck Methods After All Cards Dealt ****");
		System.out.println("  toString:\n" + d.toString());
		System.out.println("  isEmpty: " + d.isEmpty());
		System.out.println("  size: " + d.size());
		System.out.println();
		System.out.println();

		System.out.println("**** Deal a Card From Empty Deck ****");
		System.out.println("  deal: " + d.dealCard());
		System.out.println();
		System.out.println();

		/* *** TO BE COMPLETED IN ACTIVITY 4 *** */
		
		System.out.println("Activity 4 code: ");
		
		String[] rank1 = {"ACE","TWO","THREE","FOUR",
				"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};
		String[] suit1 = {"CLUB", "DIAMOND", "SPADES", "HEARTS"};
		int[] pointValue1 = {1,2,3,4,5,6,7,8,9,10, 11, 12, 13};
		Deck deck = new Deck(rank1,suit1, pointValue1);
		
		System.out.println("The deck before shuffling: ");
		System.out.println(deck.toString());
		
		deck.shuffle();
		
		System.out.println("\nThe deck after shuffling: ");
		System.out.println(deck.toString());
		
		
		

		
		
	}
}
