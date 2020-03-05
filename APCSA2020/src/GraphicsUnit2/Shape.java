//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -
package GraphicsUnit2;

import java.awt.Color; 
import java.awt.Graphics;

public class Shape
{
   //instance variables
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private Color color;
	private int xSpeed;
	private int ySpeed;

   /*
    *The constructor is used to initialize all instance variables.
    *The constructor makes the object.
    */
   public Shape(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd)
   {
		xPos = x;
		yPos = y;
		width = wid;
		height = ht;
		color = col;
		xSpeed = xSpd;
		ySpeed = ySpd;
		//finish this constructor
   }

      /*
    *The draw method draws the shape on the screen.
    */
   public void draw(Graphics window)
   {
      window.setColor(color);

      window.drawRect(xPos, yPos, 5*width, 4* height);
      window.fillOval(xPos, yPos, 5*width, 4* height);
      
      window.setColor(Color.cyan);

      window.drawOval(xPos+25, yPos+25, 5*width, 4* height);

      window.drawOval(xPos-25, yPos-25, 5*width, 4* height);

      window.drawOval(xPos+25, yPos-25, 5*width, 4* height);
      window.drawOval(xPos-25, yPos+25, 5*width, 4* height);
      window.setColor(Color.yellow);

      window.drawLine(xPos, yPos,xPos+ 50, yPos+ 0);
      window.drawLine(xPos, yPos,xPos + 0, yPos+ 50);
      window.drawLine(xPos, yPos,xPos - 50, yPos+ 0);
      window.drawLine(xPos, yPos,xPos , yPos- 50);





      //draw whatever you want
      //    ^
      //  [ :: ]
      //    ()

   }

   /*
    *This draw method will be used to erase the shape.
    */
   public void draw(Graphics window, Color col)
   {
      window.setColor(col);
      window.fillRect(xPos, yPos, width, height);
   }

   public void moveAndDraw(Graphics window)
   {
	     window.setColor(color);

	     window.drawRect(xPos, yPos, 5*width, 4* height);
	     window.fillOval(xPos, yPos, 5*width, 4* height);
	      
	     window.setColor(Color.cyan);

	     window.drawOval(xPos+25, yPos+25, 5*width, 4* height);

	     window.drawOval(xPos-25, yPos-25, 5*width, 4* height);

	     window.drawOval(xPos+25, yPos-25, 5*width, 4* height);
	     window.drawOval(xPos-25, yPos+25, 5*width, 4* height);
	     window.setColor(Color.yellow);

	     window.drawLine(xPos, yPos,xPos+ 50, yPos+ 0);
	     window.drawLine(xPos, yPos,xPos + 0, yPos+ 50);
	     window.drawLine(xPos, yPos,xPos - 50, yPos+ 0);
	     window.drawLine(xPos, yPos,xPos , yPos- 50);
	     
	     
	     xPos += xSpeed;
	     yPos += ySpeed;

   }

   //add in set and get methods for xPos, yPos, xSpeed, and ySpeed
   public void setXPos(int xPos) {
	   this.xPos = xPos;
   }
   
   public void setYPos(int yPos) {
	   this.yPos = yPos;
   }
   
   public void setXSpeed(int xSpeed) {
	   this.xSpeed = xSpeed;
   }
   public void setYSpeed(int ySpeed) {
	   this.ySpeed = ySpeed;
   }
   
   public int getX()
   {
   	return xPos;
   }
   public int getY()
   {
   	return yPos;
   }
   public int getXSpeed()
   {
   	return xSpeed;
   }
   public int getYSpeed()
   {
   	return ySpeed;
   }

 
   public String toString()
   {
   	return xPos+" "+yPos+" "+width+" "+height+" "+color+" "+xSpeed+" "+ySpeed;
   }
}