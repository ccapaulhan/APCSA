package FinalLabAssessment;

import java.util.ArrayList;

public class Team {
	
	private String name;
	
	private ArrayList<BasketballPlayer> playerList; 
	
	public Team(String name) {
		
		this.name = name;
		playerList = new ArrayList<BasketballPlayer>();
		
		
	}
	
	public void addPlayer(BasketballPlayer player) {
		playerList.add(player);
	}
	
	public String getTeamName() {
		return name;
	}

	
	
	public double pointsPerGame() {
		
		double total = 0;
		
		for(BasketballPlayer player: playerList) {
			total = total + player.getAverage();
		}
		
		return total;
	}
	
	public double getPlayerAverage(int index) {
		return playerList.get(index).getAverage();
	}
	
	public String getPlayerName(int index) {
		return playerList.get(index).getName();
	}
	
	public String getBestPlayer() {
		
		double bestAverage = 0;
		BasketballPlayer best = null;
		
		for (BasketballPlayer player: playerList) {
			
			if (player.getAverage() > bestAverage) {
				bestAverage = player.getAverage();
				best = player;
			}
		}
		
		return best.getName();
	}
	
	public String getWorstPlayer() {
		
		double worstAverage = 100;
		BasketballPlayer worst = null;
		
		for (BasketballPlayer player: playerList) {
			
			if (player.getAverage() < worstAverage) {
				worstAverage = player.getAverage();
				worst = player;
			}
		}
		
		return worst.getName();
	}
	
	public String getSuperstars() {
		
		String string = "";
		
		for (BasketballPlayer player: playerList) {
			if (player.isSuperstar()) {
				
				string = string + player.getName() + " ";
			}
		}
		
		return string;
	}
	
	public String toString() {
		
		String string = "" + getTeamName() + " - ";
		
		for (BasketballPlayer player: playerList) {
			string = string + player.getName() + ", ";
		}
		
		
		return string;
	}
	

}



