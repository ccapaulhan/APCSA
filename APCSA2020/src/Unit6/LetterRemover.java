//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Paul Han
package Unit6;

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
	}
	
	public LetterRemover(String sen, char look)
	{
		sentence = sen;
		lookFor = look;
	}

	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		int location = sentence.indexOf(lookFor);
		while (location != -1) {
			sentence = sentence.substring(0,location) + sentence.substring(location+1);

			location = sentence.indexOf(lookFor);
		}
		String cleaned=sentence;
		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor;
	}
}