//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Paul Han
//Date -  2/10/20
//Class - 2
//Lab  - NumberVerify
package Unit4;

import static java.lang.System.*;

public class NumberVerify
{
	public static boolean isOdd( int num )
	{
		if ( num %2 == 1 ){
			return true;
		} 
		else {
			return false;
		}
	}
	public static boolean isEven( int num )
	{
		if ( num %2 == 0){
			return true;
		} 
		else {
			return false;
		}
	}	
}