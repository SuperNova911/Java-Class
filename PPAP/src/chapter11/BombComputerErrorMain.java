package chapter11;

public class BombComputerErrorMain
{
	public static void main(String[] args)
	{
		BombComputer computer = new BombComputer();
		
		try
		{
			computer.powerOn();
			computer.process();
			computer.powerOff();
		} 
		catch (Exception e)
		{
			
			e.printStackTrace();
		}
	}
}
