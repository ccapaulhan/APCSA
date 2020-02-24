//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package ElevensLab;

public class Card
{
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};
	
	private String suit;
	private int face;

	//instance variables
		//String suit
		//int face

  	//constructors
	public Card(String shape, int number) {
		suit = shape;
		face = number;
	}
	
	public void setSuit(String shape) {
		suit = shape;
	}

	public void setFace(int number) {
		face = number;
	}

	// modifiers
		//set methods


  	//accessors
		//get methods
	public String getSuit() {
		return suit;
	}
	
	public int getFace() {
		return face;
	}


  	//toString
	public String toString() {
		
		return FACES[face]+" of "+suit;
	}

 }