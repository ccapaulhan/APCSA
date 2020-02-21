//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Paul Han
//Date - 2/21/2020
package Unit8;

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		
		boolean condition = true;
		int count = 0;
		
		while (condition) {
			if (ray[count] % 2 == 1) {
				int initialPoint = count;
				for (int x = count+1; x < ray.length; x++) {
					if (ray[x]%2 == 0) {
						return x - initialPoint;
					}
					if (x == ray.length-1) {
						return -1;
					}
				}
			}
			count++;
			
			if (count == ray.length-1) {
				return -1;
			}
		}
		return -1;
	}
}