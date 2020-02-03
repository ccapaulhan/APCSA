package Unit2;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Paul Han
//Date - 2/3/20
//Class - 2
//Lab  - Line

public class Line
{
	public static double getSlope( int x1, int y1, int x2, int y2 )
	{
		double yDiff = y2 - y1;
		double xDiff = x2-x1;
		double slope = yDiff/xDiff;
		return slope;
	}

}