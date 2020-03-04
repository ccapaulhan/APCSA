//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package Unit10;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStoreRunner
{
	public static void main( String args[] )
	{
		ToyStore newToyStore = new ToyStore();
		
		newToyStore.loadToys("sorry");
		newToyStore.loadToys("bat");
		newToyStore.loadToys("sorry");
		newToyStore.loadToys("sorry");
		newToyStore.loadToys("sorry");
		newToyStore.loadToys("train");
		newToyStore.loadToys("train");
		newToyStore.loadToys("teddy");
		newToyStore.loadToys("teddy");
		newToyStore.loadToys("ball");
		newToyStore.loadToys("ball");
		
		newToyStore.sortToysByCount();
		
		
		System.out.println("Sorted Toy List: ");

		System.out.println(newToyStore);
		System.out.println("\nMost Toy: ");

		System.out.println(newToyStore.getMostFrequentToy());





	}
}