package chapter02;

public class Player2
{
	private int id;
	private int number = 0;
	
	public Player2(int n)
	{
		id = n;
	}
	
	public void guess()
	{
		number = (int)(Math.random() * 10);
		System.out.println(id + "번 선수가 찍은 숫자 : " + number);
	}
	
	public int getId()
	{
		return id;
	}
	
	public int getNumber()
	{
		return number;
	}
}