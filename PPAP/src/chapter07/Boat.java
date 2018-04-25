package chapter07;

public class Boat
{
	private int length;
	
	public void setLength(int length)
	{
		this.length = length;
	}
	
	public int getLength()
	{
		return length;
	}
	
	public void move()
	{
		System.out.println("drift");
	}
}
