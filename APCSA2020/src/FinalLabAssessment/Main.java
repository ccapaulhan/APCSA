package FinalLabAssessment;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
	 public static void main(String[] args) throws FileNotFoundException {
				
		Scanner file = new Scanner(new File("src/FinalLabAssessment/warriors.txt"));
		String teamName = file.nextLine();
		int teamSize = file.nextInt();
		file.nextLine();
				
		Team team = new Team(teamName);
				
		for(int i=0; i<teamSize; i++)
		{
			String playerName = file.nextLine();
			String scoreList = file.nextLine();			
			team.addPlayer(new BasketballPlayer(playerName, scoreList));
		}
				
		System.out.println(team);
				
		System.out.println("Superstars are " + team.getSuperstars());	
		System.out.println("The best player is " + team.getBestPlayer());
		System.out.println("The worst player is " + team.getWorstPlayer());
				
		System.out.println(team.getTeamName() + " score an average points per game of " + team.pointsPerGame());
	}
}


