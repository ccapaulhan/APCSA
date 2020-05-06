package Winter;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;


public class Cloud extends AbstractShape {
	
	
	
	
	
	public Cloud(int xPos, int yPos, int width, int height ,int xSpeed, int ySpeed) {
		super(xPos,yPos,width,height,Color.gray, xSpeed,ySpeed);
	}

	@Override
	public void draw(Graphics window) {
		// TODO Auto-generated method stub
		window.setColor(Color.gray);
		
		
		
		window.fillOval(getXPos(),getYPos(), getWidth(),getHeight());
		
		window.fillOval(getXPos() + 30,getYPos() -15, getWidth()  /2 ,getHeight() / 2 );

	    
		window.fillOval(getXPos() + 10,getYPos() +30, getWidth()  /2 ,getHeight() / 2 );
		window.fillOval(getXPos() - 30,getYPos() +15, getWidth() /2  ,getHeight() /2 );
		window.fillOval(getXPos() + 40,getYPos() +25, getWidth()  / 2 ,getHeight() /3 *2 );


		window.setColor(new Color(150, 75,0));

		
	}
	
	

	@Override
	public void moveAndDraw(Graphics window) {
		// TODO Auto-generated method stub
		  draw(window);

	      setXPos(getXPos()+getXSpeed());
	      
	      
	      window.setColor(Color.gray);
	      
	      draw(window);
		
	}
}


