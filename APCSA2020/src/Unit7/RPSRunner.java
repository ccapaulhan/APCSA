//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  Paul Han
package Unit7;

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		System.out.println("Do you want to play rock paper scissors?");

		Scanner keyboard = new Scanner(System.in);
		char response = keyboard.next().charAt(0);
		while (response == 'y') {
			Scanner input = new Scanner(System.in);

			String player = "";
			
			System.out.print("type in your prompt [R,P,S] :: ");
			
			player = input.nextLine();
		
			RockPaperScissors game = new RockPaperScissors(player);		
			System.out.println(game.toString());
			System.out.println("Do you want to play rock paper scissors?");
			response = keyboard.next().charAt(0);

		}
		
		
	}
}



