//(c) A+ Computer Science
//www.apluscompsci.com
//Name Paul Han
package Unit6;

import static java.lang.System.*;

public class Perfect
{
   private int number;

	public Perfect() {
		
	}
	public Perfect(int num) {
		number = num;
	}
	
	public void setPerfect(int num) {
		number = num;
	}

	public boolean isPerfect()
	{
		int addition = 0;

		for (int x = 1; x < number; x++) {
			if (number % x == 0) {
				addition = addition + x;
			}
		}
		if (addition == number) {
			return true;
		}
		return false;
	}

	//add a toString	
	public String toString()
	{
		if (isPerfect()) {
			return number + " is a perfect number.";

		}
		return number + " is not a perfect number.";
	}
}