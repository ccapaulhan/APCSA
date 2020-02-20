//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  Paul Han
package Unit7;

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		number = num;


	}

	public void setNum(int num)
	{
		number = num;


	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 0;
		
		for (int x = 1; x <= number; x++) {
			if ( a % x == 0 && b%x==0 && c%x==0 ) {
				max = x;
			}
		}



		return max;
	}

	public String toString()
	{
		String output="";
		
		for (int x = 1; x <= number; x++) {
			for (int y = 2; y <= number; y++) {
				for (int z = 3; z <= number; z++) {
					int greatestFactor = greatestCommonFactor(x,y,z);
					if (greatestFactor == 1 ) {
						if ( x*x + y*y == z*z) {
							if ((x%2 ==0 && y%2 == 1 && z%2==1) ||(x%2 ==1 && y%2 == 0 && z%2==1) ) {
								if ( x < y && y < z) {
									output = output + " "+ x+ " " + y+ " " + z;
									output = output + "\n";

								}
								

							}
						}
						
					}
				}
			}
		}
		






		return output+"\n";
	}
}