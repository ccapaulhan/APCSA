//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Paul Han
package Unit11;

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
	private int denominator;
	private int numerator;

	//write two constructors
	
	public Rational() {
		this.denominator = 1;
		this.numerator = 1;
	}
	
	public Rational(int numerator, int denominator ) {
		this.denominator = denominator;
		this.numerator = numerator;
	}
	
	public void setRational(int numerator, int denominator ) {
		this.denominator = denominator;
		this.numerator = numerator;
	}
	//write a setRational method
	
	public void setNum(int numerator) {
		this.numerator = numerator;
	}
	
	public void setDem(int denominator) {
		this.denominator = denominator;
	}
	//write  a set method for numerator and denominator

	
	public void add(Object  other)
	{
		
		numerator = (numerator * ((Rational) other).getDem() + denominator * ((Rational)other).getNum());

		denominator = denominator * ((Rational) other).getDem();
		

		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		
		reduce();
		
		
		
	}

	private void reduce()
	{
		int placer = numerator;

		numerator = numerator / gcd(numerator, denominator);
		denominator = denominator / gcd(placer, denominator);
		



	}

	private int gcd(int numOne, int numTwo)
	{
		int min =  Math.min(numOne, numTwo);
		for (int x = min; x>1; x--) {
			if (numOne%x ==0 && numTwo %x ==0) {
				return x;
			}
		}

		return 1;
	}

	public Object clone ()
	{
		
		return new Rational(numerator, denominator);
	}
	
	
	public int getNum() {
		return this.numerator;
	}
	public int getDem() {
		return this.denominator;
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	
	
	public boolean equals( Rational obj)
	{
		if ((double)obj.getNum() / obj.getDem() == (double)numerator/denominator) {
			return true;
		}


		return false;
	}

	public int compareTo(Rational other)
	{
		if ((double) numerator/denominator >= (double) other.getNum()/other.getDem()) {
			return 1;
		}


		return -1;
	}
	
	public String toString() {
		return numerator + "/" + denominator;
	}



	
	//write  toString() method
	
	
}