//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Paul Han
//Date -  2/10/20
//Class - 2
//Lab  - NumberVerify
package Unit4;

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter the original bill amount :: ");
		double amt = keyboard.nextDouble();
		Discount discount1 = new Discount();
		out.print("Bill after discount: " + String.format("%.2f",discount1.getDiscountedBill(amt)));
		System.out.println("");
		out.print("Enter the original bill amount :: ");
		double amt2 = keyboard.nextDouble();
		Discount discount2 = new Discount();
		out.print("Bill after discount: " + String.format("%.2f",discount2.getDiscountedBill(amt2)));
		System.out.println("");

		out.print("Enter the original bill amount :: ");
		double amt3 = keyboard.nextDouble();
		Discount discount3 = new Discount();
		out.print("Bill after discount: " + String.format("%.2f",discount3.getDiscountedBill(amt3)));
		System.out.println("");

		out.print("Enter the original bill amount :: ");
		double amt4 = keyboard.nextDouble();
		Discount discount4 = new Discount();
		out.print("Bill after discount: " + String.format("%.2f",discount4.getDiscountedBill(amt4)));



	}
}