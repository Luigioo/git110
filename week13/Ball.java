import java.util.*;

/**
 * Models a simple solid sphere. 
 * This class represents a Ball object. When combined with the GameArena class,
 * instances of the Ball class can be displayed on the screen.
 */
public class Ball 
{
	// The following instance variables define the
	// information needed to represent a Ball
	// Feel free to more instance variables if you think it will 
	// support your work... 
	
	private double xPosition;			// The X coordinate of this Ball
	private double yPosition;			// The Y coordinate of this Ball
	private double size;				// The diameter of this Ball
	private String colour;				// The colour of this Ball

	private double dx = 0.0001;
	private double dy = 0.00008;

	private double g = 	0.00000000003;

										// Permissable colours are:
										// BLACK, BLUE, CYAN, DARKGREY, GREY,
										// GREEN, LIGHTGREY, MAGENTA, ORANGE,
										// PINK, RED, WHITE, YELLOW 

	/**
	 * Constructor. Creates a Ball with the given parameters.
	 * @param x The x co-ordinate of centre of the Ball (in pixels)
	 * @param y The y co-ordinate of centre of the Ball (in pixels)
	 * @param diameter The diameter of the Ball (in pixels)
	 * @param col The colour of the Ball (Permissable colours are: BLACK, BLUE, CYAN, DARKGREY, GREY, GREEN, LIGHTGREY, MAGENTA, ORANGE, PINK, RED, WHITE, YELLOW)
	 */

	public Ball(double x, double y, double diameter, String col)
	{
		xPosition = x;
		yPosition = y;
		size = diameter;
		colour = col;
	}

//start modifying from here------------------------
	public Ball(){}
	
	public void iniBall(double x, double y, double diameter, String col){
		xPosition = x;
		yPosition = y;
		size = diameter;
		colour = col;
	}	
	public double getDx(){
		return dx;
	}
	public double getDy(){
		return dy;
	}
	public void flipx(){
		dx = -dx;
	}
	public void flipy(){
		dy = -dy;
	}
	public void bounce(){
		yPosition -= 10;
		dy = -Math.abs(dy) * 0.97;
	}
	public void randSpeed(){
		Random rand = new Random();
		dx = rand.nextBoolean()? 0.0001 : -0.0001;
		dy = rand.nextBoolean()? 0.00008 : -0.00008;
		
		dx += dx * (rand.nextDouble()/20);
		dy += dy * (rand.nextDouble()/20);
	}

	public void updatePos(long dTime){
		this.xPosition += dTime * dx;
		this.yPosition += dTime * dy;
		dy += g;
	}

	public void setPosition(double x, double y){
		this.xPosition = x;
		this.yPosition = y;
	}



//------------------------------------------


	public double getXPosition()
	{
		return xPosition;
	}

	/**
	 * Obtains the current position of this Ball.
	 * @return the Y coordinate of this Ball within the GameArena.
	 */
	public double getYPosition()
	{
		return yPosition;
	}
	public void setXPosition(double x)
	{
		this.xPosition = x;
	}

	/**
	 * Moves the current position of this Ball to the given co-ordinates
	 * @param y the new y co-ordinate of this Ball
	 */
	public void setYPosition(double y)
	{
		this.yPosition = y;
	}

	/**
	 * Obtains the size of this Ball.
	 * @return the diameter of this Ball,in pixels.
	 */
	public double getSize()
	{
		return size;
	}
	
	/**
	 * Sets the diameter of this Ball to the given size.
	 * @param s the new diameter of this Ball, in pixels.
	 */
	public void setSize(double s)
	{
		size = s;
	}

	/**
	 * Obtains the colour of this Ball.
	 * @return a textual description of the colour of this Ball.
	 */
	public String getColour()
	{
		return colour;
	}

	/**
	 * Sets the colour of this Ball.
	 * @param c the new colour of this Ball, as a String value. Permissable colours are: BLACK, BLUE, CYAN, DARKGREY, GREY, GREEN, LIGHTGREY, MAGENTA, ORANGE, PINK, RED, WHITE, YELLOW.
	 */
	public void setColour(String c)
	{
		colour = c;
	}
}
