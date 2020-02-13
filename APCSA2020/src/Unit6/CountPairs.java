//(c) A+ Computer Science
//www.apluscompsci.com
//Name Paul Han
package Unit6;

import static java.lang.System.*;

public class CountPairs
{
	public CountPairs() {
		
	}
	
	public static int pairCounter( String str )
	{ 
		int count = 0;
		
		for (int x = 0; x < str.length()-2; x++) {

			if (str.substring(x,x+1).equals(str.substring(x+1, x+2))) {
				count++;

			}
		}
		if (str.length() > 1) {
			if (str.substring(str.length()-1).equals(str.substring(str.length()-2, str.length()-1)) )  {
				count++;
			}
		}
		
		return count;
	}
}