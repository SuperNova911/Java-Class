
public class GuessGame
{
	Player p1;
	
	public void startGame()
	{
		p1 = new Player();
		
		int guessp1 = 0;
		
		boolean p1isRight = false;
		
		int targetNumber = (int)(Math.random() * 10);
		System.out.println("0�̻� 9������ ���ڸ� ���纸����.");
		
		while (true)
		{
			System.out.println("����� �� ���ڴ�" + targetNumber + "�Դϴ�.");
			
			p1.guess();
			
			guessp1 = p1.number;
			System.out.println("1�� ������ ���� ����: " + guessp1);
			
			if (guessp1 == targetNumber)
			{
				p1isRight = true;
			}
			
			if (p1isRight)
			{
				System.out.println("���� ������ �ֽ��ϴ�.");
				System.out.println("1�� ���� : " + p1isRight);
				System.out.println("���� ��");
				break;
			}
			else
			{
				System.out.println("�ٽ� �õ��ؾ� �մϴ�.");
			}
		}
	}
}
