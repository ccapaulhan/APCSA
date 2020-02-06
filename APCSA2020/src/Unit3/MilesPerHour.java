//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Paul Han
//Date - 2/6/2020
//Class - 2
//Lab  - MilesPerHour
package Unit3;

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	private int distance, hours, minutes;
	private double mph;

	public MilesPerHour()
	{
		setNums(60,0,30);
		mph=120;
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
	}

	public void setNums(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
	}

	public void calcMPH()
	{
		double totalHours = hours + (double)minutes/60;
		mph = distance / totalHours;
	}

	public void print()
	{
	}
	
	//create a print or toString or both
	
	public String toString()
	{
		return "With miles of " + distance + " and hours of " + hours + " and minutes of " + minutes +", the mph is " + String.format("%.3f",mph);
	}
}