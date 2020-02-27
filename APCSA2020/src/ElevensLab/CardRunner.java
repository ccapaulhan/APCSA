//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package ElevensLab;

import static java.lang.System.*;
import java.awt.Color;

public class CardRunner
{
	public static void main( String args[] )
	{
		System.out.println("Lab Test cards: ");
		Card one = new Card("SPADES", 9);
		out.println(one.getSuit());
		out.println(one.getFace());

		Card two = new Card("DIAMONDS", 1);
		out.println(two);
		two.setFace(3);
		out.println(two);

		Card three = new Card("CLUBS",4);
		out.println(three);

		Card four = new Card("SPADES",12);
		out.println(four);

		Card five = new Card("HEARTS", 12);
		out.println(five);
		
		System.out.println("\nActivity 1 Test: ");
		
		Card card1 = new Card("CLUBS", "TWO",2);
		System.out.println("Card 1 = " +card1.toString());
		
		
		Card card2 = new Card("CLUBS", "TWO",2);
		System.out.println("Card 2 = " +card2.toString());
		
		Card card3 = new Card("DIAMONDS", "FIVE",5);
		System.out.println("Card 3 = " +card3.toString());
		
		System.out.println("Card 1 = Card 2 is " + card1.testEquality(card1, card2));
		
		System.out.println("Card 2 = Card 3 is " + card1.testEquality(card3, card2));

		
	}
}