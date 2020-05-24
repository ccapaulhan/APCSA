//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package StarFighter;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private List<Alien> aliens;
	private int score;

	public AlienHorde(int size)
	{
		score = 0;
		aliens = new ArrayList<Alien>();
		// there is always three rows
		int startX = 0;
		int startY = -200;
		
		for (int a = 0 ; a < size / 3; a++) {
			aliens.add(new Alien( startX + 50, startY, 40, 40, 1));
			startX = startX + 150;
		}
		
		startY += 40;
		startX=0;
		
		for (int a = 0 ; a < size / 3; a++) {
			aliens.add(new Alien( startX + 50, startY, 40, 40, 1));
			startX = startX + 150;
		}
		
		startY += 40;
		startX=0;

		for (int a = 0 ; a < size / 3; a++) {
			aliens.add(new Alien( startX + 50, startY, 40, 40, 1));
			startX = startX + 150;
		}
		
	}

   
	public void add(Alien al)
	{
		aliens.add(al);
	}

	public void drawEmAll( Graphics window )
	{
		for (Alien alien : aliens) {
			alien.draw(window);
		}
	}

	public void moveEmAll()
	{
		for (Alien alien: aliens) {
			
			alien.move("DOWN");
			
			if (alien.getY() <  0) {
				alien.move("RIGHT"); 
			}
			else if (alien.getY() < 300 ) {
				alien.move("LEFT"); 

			}
			else if (alien.getY() < 600 ) {
				alien.move("RIGHT"); 

			}
		
		}
		
	}
	public int getScore() {
		return score;
	}
	
	public List<Alien> getList() {
        return aliens;
    }
	
	public void checkShip(Ship ship) {
		for(Alien alien: aliens) {
			if ( (ship.getX() > alien.getX() - alien.getWidth() / 2 ) && (ship.getX() < alien.getX() + alien.getWidth() /  2 ) && (ship.getY() < alien.getY() + alien.getHeight()) && ship.getY() > alien.getY()) {
			
				ship.setX(-1000);
				ship.setY(-1000);
			}
		}
	}

	public void removeDeadOnes(List<Ammo> shots)
	{
		for (Ammo ammo : shots) {
			for (Alien alien: aliens) {
				if ( (ammo.getX() > alien.getX() - alien.getWidth() / 2 ) && (ammo.getX() < alien.getX() + alien.getWidth() /  2 ) && (ammo.getY() < alien.getY() + alien.getHeight()) && ammo.getY() > alien.getY()) {
					aliens.remove(alien);
					score++;
					ammo.setX(-200);
					ammo.setY(0);
					break;
				}
			}
		}
	}

	public String toString()
	{
		return "";
	}
}





	

	
