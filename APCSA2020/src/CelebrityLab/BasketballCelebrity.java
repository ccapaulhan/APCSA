package CelebrityLab;

import java.util.ArrayList;

public class BasketballCelebrity extends Celebrity{
	
	private ArrayList<String> clueList;
	
	public BasketballCelebrity(String answer, String clues)
	{
		super(answer, clues);
		processClues();
	}
	
	private void processClues()
	{
		String [] clues = super.getClue().split(",");
		clueList = new ArrayList<String>();
		for (String currentClue : clues)
		{
			clueList.add(currentClue);
		}
	}
	
	@Override
	public String getClue()
	{
		if (clueList.size() == 0)
		{
			processClues();
		}
		String currentClue = clueList.remove(0);
		
		return currentClue;
	}
	
	
	@Override
	public String toString()
	{
		String dsc = "This is the basketball celebrity: " + getAnswer() + "\nThe clues are:\n";
		
		for (String word : super.getClue().split(","))
		{
			dsc += word + "\n";
		}
		
		return dsc;
	}

}
