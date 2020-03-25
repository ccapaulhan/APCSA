//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package Unit13;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo
{
	private String[] wordRay;

	public WordSortTwo(String sentence)
	{
		int counter = 1;
		
		for (int x = 0; x < sentence.length();x++) {
			if (sentence.charAt(x) == ' '){
				counter++;
			}
		}
		
		wordRay = sentence.split(" "); 
		
		
	}

	public void sort()
	{
		for (int x = 0; x < wordRay.length - 1; x++)
	      {
	         int min = x;
	         for (int y = x + 1; y < wordRay.length; y++)
	         {
	            if (wordRay[y].compareTo(wordRay[min]) < 0)
	            {
	               min = y;
	            }
	         }
	         String temp = wordRay[x];
	         wordRay[x] = wordRay[min];
	         wordRay[min] = temp;
	       }
	}

	public String toString()
	{
		String output="";
		for (int x = 0; x < wordRay.length;x++) {
			output = output + "\n" + wordRay[x];
		}
		return output+"\n\n";
	}
}