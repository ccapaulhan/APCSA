package FinalLabAssessment;


import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.util.ArrayList;


public class BasketballPlayer {
	
	private String name;
	private Points playerPoints;
	
	public BasketballPlayer(String name, String pointsList) {
		this.name = name;
		playerPoints = new Points(pointsList);
	}
	
	public void setPoint(int index, int point) {
		playerPoints.setPoint(index, point);
	}
	
	public String getName() {
		return name;
	}

	public int getSize() {
		return playerPoints.getSize();
	}
	
	public int getSum() {
		return playerPoints.getSum();
	}
	
	public double getAverage() {
		return (double) playerPoints.getSum() / playerPoints.getSize();
	}
	
	public int getHighPointsScored() {
		return playerPoints.highPoint();
	}
	
	public int getLowPointsScored() {
		return playerPoints.lowPoint();
	}
	
	public boolean isBetter(BasketballPlayer player) {
		if (getAverage() > player.getAverage()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isSuperstar() {
		
		if (getAverage()> 20) {
			return true;
		}
		else {
			return false;
		}
	}

	
	public String toString() {
		return "Player name is " + name + " and points scored is " + playerPoints.toString();
	}
	
}



	