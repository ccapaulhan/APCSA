package Unit2;
//� A+ Computer Science  -  www.apluscompsci.com
//Name - Paul Han
//Date - 2/3/20
//Class - 2
//Lab  - Traprunner

public class TrapRunner
{
	public static void main( String[] args )
	{
		System.out.printf(  "Trap Area 1 is :: %.2f\n" ,Trap.area( 3, 3, 3) );
		System.out.printf(  "Trap Area 2 is :: %.2f\n" ,Trap.area( 5, 6, 7) );
		System.out.printf(  "Trap Area 3 is :: %.2f\n" ,Trap.area( 7, 10, 6) );
		System.out.printf(  "Trap Area 4 is :: %.2f\n" ,Trap.area( 13, 9, 3) );
		System.out.printf(  "Trap Area 5 is :: %.2f\n" ,Trap.area( 6, 11, 4) );
		System.out.printf(  "Trap Area 6 is :: %.2f\n" ,Trap.area( 11, 8, 5) );
	}
}


/*
EXPECTED OUTPUT

9.0
38.5
51.0
33.0
34.0
47.5

*/