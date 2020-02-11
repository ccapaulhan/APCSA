//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Paul Han
//Date - 2/11/20
package Unit5;


public class FirstLastVowel
{
   public static String go( String a )
	{
	    if ( a.toLowerCase().startsWith("a") ||  a.toLowerCase().startsWith("e")||  a.toLowerCase().startsWith("i")||  a.toLowerCase().startsWith("o")||  a.toLowerCase().startsWith("u")) {
	    	return "yes";
	    } 
	    else if  ( a.toLowerCase().endsWith("a") ||  a.toLowerCase().endsWith("e")||  a.toLowerCase().endsWith("i")||  a.toLowerCase().endsWith("o")||  a.toLowerCase().endsWith("u")){
	    	return "yes";
	    }
	    else {
	    	return "no";
	    }
	}
}


