//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Paul Han
//Date - 2/11/20

package Unit5;
public class AvgLen
{
   public static double go( String a, String b )
	{
	    int lengthA = a.length();
	    int lengthB = b.length();
	    
	    double average = (double) (lengthA + lengthB )/2;
		return average;
	}
}