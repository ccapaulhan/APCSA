//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Paul Han
//Date - 2/6/2020
//Class - 2
//Lab  - MilesPerHour
package Unit3;

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MPHRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(in);

		out.print("Enter the distance :: ");
		int dist = keyboard.nextInt();

		out.print("Enter the hours :: ");
		int hrs = keyboard.nextInt();

		out.print("Enter the minutes :: ");
		int mins = keyboard.nextInt();

		MilesPerHour test = new MilesPerHour(dist, hrs, mins);
		test.calcMPH();
		System.out.println(test.toString());
		
		//add more test cases
		System.out.println("\nTest Values:\n ");

		MilesPerHour test2 = new MilesPerHour(32, 2, 34);
		test2.calcMPH();
		System.out.println(test2.toString());
		
		MilesPerHour test3 = new MilesPerHour(200, 6, 50);
		test3.calcMPH();
		System.out.println(test3.toString());
		
		
	}
}