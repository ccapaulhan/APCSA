//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Paul Han
//Date - 2/26
package Unit9;

import java.util.List;
import java.util.ArrayList;

public class ListSumFirst
{
	public static int go(List<Integer> ray)
	{
		
		int sum = 0;
		for (int x = 1; x < ray.size(); x++) {
			if (ray.get(x) > ray.get(0)) {
				sum += ray.get(x);
			}
			
		}
		if (sum == 0 || ray.size() == 0) {
			return -1;
		}
		return sum;
		
	}
}