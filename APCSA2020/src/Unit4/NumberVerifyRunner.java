//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Paul Han
//Date -  2/10/20
//Class - 2
//Lab  - NumberVerify
package Unit4;

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(in);
		System.out.println("Enter number: ");
		int num1 = keyboard.nextInt();
		System.out.println(num1 + " is odd :: " + NumberVerify.isOdd(num1));
		System.out.println(num1+ " is even :: " + NumberVerify.isEven(num1));
		
		System.out.println("Enter number: ");
		int num2 = keyboard.nextInt();
		System.out.println(num2 + " is odd :: " + NumberVerify.isOdd(num2));
		System.out.println(num2+ " is even :: " + NumberVerify.isEven(num2));
		
		System.out.println("Enter number: ");
		int num3 = keyboard.nextInt();
		System.out.println(num3 + " is odd :: " + NumberVerify.isOdd(num3));
		System.out.println(num3+ " is even :: " + NumberVerify.isEven(num3));
		
		System.out.println("Enter number: ");
		int num4 = keyboard.nextInt();
		System.out.println(num4 + " is odd :: " + NumberVerify.isOdd(num4));
		System.out.println(num4+ " is even :: " + NumberVerify.isEven(num4));
		//add in more test cases
	}
}