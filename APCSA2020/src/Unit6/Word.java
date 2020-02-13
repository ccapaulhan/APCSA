//(c) A+ Computer Science
//www.apluscompsci.com
//Name Paul Han
package Unit6;

import static java.lang.System.*;

public class Word
{
	private String word;

	public Word()
	{
	}

	public Word(String s)
	{
		word = s;
	}

	public void setString(String s)
	{
		word = s;
	}

	public char getFirstChar()
	{
		char firstChar = word.charAt(0);
		return firstChar;
	}

	public char getLastChar()
	{
		char lastChar = word.charAt(word.length()-1);
		return lastChar;
	}

	public String getBackWards()
	{
		String back= "";

		for (int x = 0; x < word.length(); x ++) {
			String replaceString = word.substring(word.length()-x-1, word.length()-x);
			back = back + replaceString;
			

		}
		return back;
	}

 	public String toString()
 	{
 		return getFirstChar() + "\n" + getLastChar() + "\n" + getBackWards() + "\n" + word + "\n";
	}
}