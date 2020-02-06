//(c) A+ Computer Science 
//www.apluscompsci.com

//Name - Paul Han
//Date - 2/6/2020
//Class - 2
//Lab  - Distance
package Unit3;

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;
	public Distance()
	{
	}

	public Distance(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
	}

	public void calcDistance()
	{
		distance = Math.sqrt(Math.pow((yTwo-yOne), 2) + Math.pow((xTwo-xOne), 2));
	}
	
	public double getDistance()
	{
		return distance;
	}
	
	public void print()
	{
	}
	
	//complete print or the toString

	public String toString()
	{
		return "Input: (" + xOne +", " + yOne +") "+ "," +" ("+xTwo +", " +yTwo +") gives distance " + String.format("%.3f", distance);
	}
}