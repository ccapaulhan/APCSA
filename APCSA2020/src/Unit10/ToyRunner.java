//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package Unit10;

import static java.lang.System.*;

public class ToyRunner
{
	public static void main(String[] args)
	{
		
		Toy sorry = new Toy("sorry");
		sorry.setCount(1);
		System.out.println(sorry);
		
		Toy gi = new Toy("gi joe");
		gi.setCount(5);
		System.out.println(gi);
		
		
	}
}