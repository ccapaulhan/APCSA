//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Paul Han
//Date - 2/6/2020
//Class - 2
//Lab  - Distance
package Unit3;

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(in);

		out.print("Enter the X1 :: ");
		int x1 = keyboard.nextInt();

		out.print("Enter the Y1 :: ");
		int y1 = keyboard.nextInt();

		out.print("Enter the X2 :: ");
		int x2 = keyboard.nextInt();
		
		out.print("Enter the Y1 :: ");
		int y2 = keyboard.nextInt();

		Distance test1 = new Distance(x1,y1,x2,y2);
		test1.calcDistance();
		System.out.println( test1.toString());
		
		System.out.println("Test Values: ");
		Distance test2 = new Distance(1,1,2,1);
		test2.calcDistance();
		System.out.println( test2.toString());
		
		
		Distance test3 = new Distance(1,1,0,0);
		test3.calcDistance();
		System.out.println( test3.toString());
	}
}