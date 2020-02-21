//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Paul Han
//Date - 2/21/2020
package Unit8;

public class RaySumLast
{
	public static int go(int[] ray)
	{
		int count = 0;
		if (ray.length == 0) {
			return -1;
		}
		for (int x = 0; x < ray.length; x++) {
			if (ray[x] > ray[ray.length-1]) {

				count += ray[x];
			}
		}
		if (count == 0) {
			return -1;
		}
		return count;
	}
}