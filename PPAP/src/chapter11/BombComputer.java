package chapter11;

public class BombComputer 
{
	boolean power = false;
	
	public void powerOn()
	{
		power = true;
		System.out.println("폭발물 처리 컴터 ON");
	}
	
	public void powerOff()
	{
		power = false;
		System.out.println("폭발물 처리 컴터 OFF");
	}
	
	public void process() throws Exception
	{
		System.out.println("작업처리 1");
		System.out.println("작업처리 2");
		
		throw new Exception("작업처리 3 오류발생 KAPPA");
	}
}
