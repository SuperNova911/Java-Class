package khub����;

class PDA
{
	public int calculate(int x, int y)
	{
		return x + y;
	}
}

class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface
{

	@Override
	public void play()
	{
		System.out.println("���� ���");
	}

	@Override
	public void stop()
	{
		System.out.println("��� ����");
	}

	@Override
	public void sendSMS()
	{
		System.out.println("SMS ������");
	}

	@Override
	public void receiveSMS()
	{
		System.out.println("SMS �ޱ�");
	}

	@Override
	public void sendCall()
	{
		System.out.println("��ȭ �ɱ�");
	}

	@Override
	public void receiveCall()
	{
		System.out.println("��ȭ �ޱ�");
	}
	
	public void schedule()
	{
		System.out.println("���� ����");
	}
}

public class InterfaceEx
{
	public static void main(String[] args)
	{
		SmartPhone sp = new SmartPhone();
		
		sp.sendCall();
		sp.play();
		
		System.out.println(sp.calculate(3, 5));
				
		sp.schedule();
	}
}
