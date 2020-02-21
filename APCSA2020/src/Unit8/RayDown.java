//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Paul Han
//Date - 2/21/2020
package Unit8;

public class RayDown
{
	//go() will return true if all numbers in numArray
	//are in decreasing order [31,12,6,2,1]
	public static boolean go(int[] numArray)
	{
		boolean condition = true;
		int count = 1;
		if (numArray.length == 1) {
			return true;
		}
		while (condition) {
			if (numArray[count-1] < numArray[count]) {
				condition = false;
			}
			if (count == numArray.length - 1) {
				return true;
			}
			count++;
		}
		return condition;
	}	
}