//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package Unit13;

import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	private static int startingNum;
	
	

	private static int getNumDigits(int number)
	{
		startingNum = number;
		
		int count = 0;
		
		while (number/10 !=0) {
			number = number/10;
			count++;
		}
		return count+1;
	}

	public static int[] getSortedDigitArray(int number)
	{
		int placer = number;
		int[] sorted = new int[getNumDigits(number)];
		
		for (int x = 0; x< sorted.length; x++) {
			sorted[x] = placer %10;
			placer = placer /10; 
		}
		
		for (int x = 0; x < sorted.length - 1; x++)
	      {
	         int min = x;
	         for (int y = x + 1; y < sorted.length; y++)
	         {
	            if (sorted[y] < sorted[min])
	            {
	               min = y;
	            }
	         }
	         int temp = sorted[x];
	         sorted[x] = sorted[min];
	         sorted[min] = temp;
	       }

		return sorted;
	}
}