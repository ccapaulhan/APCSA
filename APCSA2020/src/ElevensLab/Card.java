//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package ElevensLab;

public class Card
{
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};
	
	private String suit;
	private String rank;
	private int face;

	//instance variables
		//String suit
		//int face

  	//constructors
	public Card(String shape, String rank, int number) {
		suit = shape;
		this.rank = rank;
		face = number;
	}
	
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
	
	public void setRank(String rank) {
		this.rank = rank;
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
	
	public String getRank() {
		return rank;
	}
	
	// test equality
	
	public boolean testEquality(Card a, Card b) {
		
		if (a.face == b.face && a.getSuit().equals(b.getSuit())) {
			return true;
		}
		
		return false;
		
	}


  	//toString
	public String toString() {
		rank = FACES[face];
		return rank  +" of "+suit + " (Point Value = " + face + ")";
	}

 }