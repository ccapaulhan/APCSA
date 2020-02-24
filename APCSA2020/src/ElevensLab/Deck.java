//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package ElevensLab;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Deck {
	public static final int NUMCARDS = 52;
	public static String[] SUITS = "CLUBS HEARTS DIAMONDS SPADES".split(" ");
	
	private List<Card> cards;
	private Card top;
	
	public Deck() {
		cards = new ArrayList<Card>();
		
		for (int x = 0; x <4; x++) {
			for (int y = 1; y<14; y++) {
				cards.add(new BlackJackCard(SUITS[x], y));
			}
		}
		top = cards.get(51);
	}
	
	public Card dealCard() {
		top = cards.get(51);
		Card placer = cards.get(51);
		cards.remove(cards.get(51));
		cards.add(0,placer);
		return top;
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
		top = cards.get(51);
	}

   //make a Deck constructor
   	//refer cards to new ArrayList
   	//set top to the top of the deck 51
   	
   	//loop through all suits
   		//loop through all faces 1 to 13
   			//add a new TwentyOneCard to the deck

   
   //make a dealCard() method that returns the top card
   
   //write a shuffle() method
   	//use Colletions.shuffle
   	//reset the top card 
}