//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Paul Han
package Unit11;

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWordRunner
{
	public static void main( String args[] )
	{		
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Do you want to enter more sample input? ");
		

		
		while (keyboard.nextLine().equals("y")) {
			System.out.print("Enter a word: ");
			TriangleWord.printTriangle(keyboard.nextLine());
			
			System.out.print("\nDo you want to enter sample input? ");
			

		}
	

	}
}