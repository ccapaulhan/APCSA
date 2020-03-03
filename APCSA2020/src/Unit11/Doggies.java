//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Paul Han

package Unit11;

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		pups = new Dog[size];		
	}
	
	public void set(int spot, int age, String name)
	{
		if (spot < pups.length) {
			pups[spot] = new Dog(age, name);
		}
	}

	public String getNameOfOldest()
	{
		Dog placerDog = new Dog(0, "null");
		
		for (int x = 0; x < pups.length; x++) {
			if (pups[x].getAge() > placerDog.getAge()) {
				placerDog = pups[x];
			}
		}
		
		return placerDog.getName();
	}

	public String getNameOfYoungest()
	{
		Dog placerDog = new Dog(10000, "null");
		
		for (int x = 0; x < pups.length; x++) {
			if (pups[x].getAge() < placerDog.getAge()) {
				placerDog = pups[x];
			}
		}
		
		return placerDog.getName();
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}