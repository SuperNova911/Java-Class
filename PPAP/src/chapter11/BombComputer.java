package chapter11;

public class BombComputer 
{
	boolean power = false;
	
	public void powerOn()
	{
		power = true;
		System.out.println("���߹� ó�� ���� ON");
	}
	
	public void powerOff()
	{
		power = false;
		System.out.println("���߹� ó�� ���� OFF");
	}
	
	public void process() throws Exception
	{
		System.out.println("�۾�ó�� 1");
		System.out.println("�۾�ó�� 2");
		
		throw new Exception("�۾�ó�� 3 �����߻� KAPPA");
	}
}
