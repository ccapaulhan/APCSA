//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  Paul Han
package Unit7;

import static java.lang.System.*;

public class DoubleRunner
{
	public static void main(String[] args)
	{
		BiggestDouble test1 = new BiggestDouble(4.5,6.7,7.8,9.0);
		System.out.println(test1.toString());

		BiggestDouble test2 = new BiggestDouble(14.51, 6.17,71.8, 1.0);
		System.out.println(test2.toString());
		
		BiggestDouble test3 = new BiggestDouble(41.15 ,816.7, 17.8 ,19.0);
		System.out.println(test3.toString());
		
		BiggestDouble test4 = new BiggestDouble(884.5, 16.7, 7.8, 9.0);
		System.out.println(test4.toString());
		
		BiggestDouble test5 = new BiggestDouble(4.5, -456.7 ,677.8, 9.0);
		System.out.println(test5.toString());
		
		BiggestDouble test6 = new BiggestDouble(4.5, 16.7, -7.8, -9.0);
		System.out.println(test6.toString());
		
		//add more test cases
				
	}
}