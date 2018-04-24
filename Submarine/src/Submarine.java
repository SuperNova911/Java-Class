import java.util.ArrayList;

public class Submarine
{
	private int name;
	private int length;
	private int life;
	
	private int xPos;
	private int yPos;
	private int direction;
	
	
	public Submarine(int name, int length)
	{
		this.name = name;
		this.length = length;
		life = length;
	}
	
	public int getLength()
	{
		return length;
	}
	
	public int getXpos()
	{
		return xPos;
	}
	public int getYpos()
	{
		return yPos;
	}
	public int getDirection()
	{
		return direction;
	}
	public int getLife()
	{
		return life;
	}
	public void setLife(int life)
	{
		this.life = life;
	}
	
	public int getName()
	{
		return name;
	}
	
	public void setPosition(int x, int y)
	{
		xPos = x;
		yPos = y;
	}
	
	public void setPosition(int x, int y, int direction)
	{
		xPos = x;
		yPos = y;
		this.direction = direction;
	}
	
	public void setDirection(int direction)
	{
		this.direction = direction;
	}
}
