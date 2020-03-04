//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package Unit10;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList = new ArrayList<Toy>();
	private ArrayList<Toy> sortedList=new ArrayList<Toy>();
	private String toyName;


	public ToyStore()
	{
		toyName = "default";
		
	}

	public void loadToys( String toys )
	{
		toyName = toys;
		Toy toy = new Toy(toyName);
		toyList.add(toy);
	}
  
  	public Toy getThatToy( String nm )
  	{
  		for (int x = 0; x < toyList.size(); x++) {
  			if (toyList.get(x).getName().equals(nm)) {
  				return toyList.get(x);
  			}
  		}
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		Toy mostToy = sortedList.get(0);
  		for (int x = 1; x < sortedList.size();x++) {
  			if (sortedList.get(x).getCount() > mostToy.getCount()) {
  				mostToy = sortedList.get(x);
  			}
  		}
  		
  		
  		return "most toy == " + mostToy.getName();
  	}  
  
  	public void sortToysByCount()
  	{
  		
  		for (int x = 0; x < toyList.size(); x++) {
  	  		int count = 0;

  			for (int y = 0; y < toyList.size();y++) {
  				if (toyList.get(x).getName().equals(toyList.get(y).getName())) {
  					count++;
  				}
  			}
  			Toy newToy = new Toy(toyList.get(x).getName());
  			newToy.setCount(count);
  	  		sortedList.add(newToy);
  	  		for (int y = 1; y < toyList.size();y++) {
				if (toyList.get(y).getName().equals(newToy.getName())) {
					toyList.remove(toyList.get(y));
				}
			}
  	  		

  		}
  		
  		
  	}  
  	  
	public String toString()
	{
	   return sortedList.toString();
	}
}