package FinalLabAssessment;

import java.util.Scanner;
import java.util.ArrayList;

public class Points {
	private ArrayList<Integer> points;
	
	public Points(String pointsString) {
		
		setPoints(pointsString);
	}
	
	public void setPoints(String pointList) {
		
		Scanner scanner = new Scanner(pointList);
		
		points = new ArrayList<Integer>();
		
		int size = scanner.nextInt();
		
		scanner.next();
		for (int x = 0; x<size;x++) {
			points.add(scanner.nextInt());
		}
	}
	
	public void setPoint(int index , int point) {
		
		points.set(index, point);
		
	}
	
	public void addPoint(int index, int point) {
		points.add(index,point);
	}
	
	public int getSum() {
		int sum = 0;
		for (int point : points) {
			sum = sum + point;
		}
		
		return sum;
	}
	
	public int lowPoint() {
		int newLow = points.get(0);
		
		for (int point: points) {
			if (point < newLow) {
				newLow = point;
			}
		}
		return newLow;
	}
	
	public int highPoint() {
		int newHigh = points.get(0);
		
		for (int point: points) {
			if (point > newHigh) {
				newHigh = point;
			}
		}
		return newHigh;
	}
	
	public int getSize() {
		return points.size();
	}
	
	public String toString() {
		String print = "";
		for(int point : points)
		{
			print = print + " " + point;
		}
		return print;
	}

}




	
