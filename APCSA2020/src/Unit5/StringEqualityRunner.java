//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Paul Han
//Date - 2/11/20
//Class - 2 
//Lab  - StringEquality
package Unit5;

import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		StringEquality test1 = new StringEquality("hello", "goodbye");
		System.out.println(test1.toString());
		
		StringEquality test2 = new StringEquality("one", "two");
		System.out.println(test2.toString());

		StringEquality test3 = new StringEquality("three", "four");
		System.out.println(test3.toString());

		StringEquality test4 = new StringEquality("TCEA", "UIL");
		System.out.println(test4.toString());
		
		StringEquality test5 = new StringEquality("State", "Champions");
		System.out.println(test5.toString());	
		
		StringEquality test6 = new StringEquality("ABC", "ABC");
		System.out.println(test6.toString());	
		
		StringEquality test7 = new StringEquality("ABC", "CBA");
		System.out.println(test7.toString());
		
		StringEquality test8 = new StringEquality("Same", "Same");
		System.out.println(test8.toString());

	}
}