//(c) A+ Computer Science
//www.apluscompsci.com
//Name -  Paul Han
package Unit7;

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
	}

	public TriangleFive(char c, int amt)
	{
		letter = c;
		amount = amt;
	}

	public void setLetter(char c)
	{
		letter = c;

	}

	public void setAmount(int amt)
	{
		amount = amt;

	}

	public String toString()
	{
		String output="";
		int placer = amount;
		for (int i = 0; i<placer; i++ ) {
			amount = placer-i;
			char letterPlacer = letter;
			while (amount > 0 ) {
				for (int x = amount+i; x>0; x-- ) {
					output = output + letterPlacer;
				}
				output = output + " ";
				amount = amount - 1;
				if (letterPlacer != 'Z') {
					letterPlacer = (char) (letterPlacer + 1);
				} 
				else {
					letterPlacer = 'A';
				}
				
			}
			output = output + "\n";
			
		}
		
	
		return output;
	}
}