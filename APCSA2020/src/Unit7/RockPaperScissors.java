//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  Paul Han
package Unit7;

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
	}

	public RockPaperScissors(String player)
	{
		playChoice = player;
	}

	public void setPlayers(String player)
	{
		playChoice = player;
	}

	public String determineWinner()
	{
		int x = (int)(Math.random()*(2));
		String winner="";

		if (x == 0) {
			compChoice = "R";
		}
		else if (x == 1) {
			compChoice = "P";
		}
		else {
			compChoice = "S";
		}

		System.out.println("The computer chose " + compChoice);
		System.out.println("The person chose " + playChoice);

		if ( (compChoice.equals("R") && playChoice.equals("S")) || (compChoice.equals("S") && playChoice.equals("P") )|| (compChoice.equals("P") && playChoice.equals("R"))) {
			winner = "computer";
		}
		else if (playChoice.equals(compChoice)) {
			winner = "no one";
		}
		else {
			winner = "the player";
		}
		
		return winner;
	}

	public String toString()
	{
		String output="";

	
		String theWinner = determineWinner();
			
		output = "Well, " + theWinner + " wins...";


		
		return output;
	}
}