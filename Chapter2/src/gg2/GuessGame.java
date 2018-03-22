package gg2;

public class GuessGame
{
	public void startGame()
	{
		Player p1 = new Player(1);
		Player p2 = new Player(2);
		Player p3 = new Player(3);
		
		int targetNumber = (int)(Math.random() * 10);
		System.out.println("0�̻� 9������ ���ڸ� ���纸����.");
		
		while (true)
		{
			System.out.println("����� �� ���ڴ�" + targetNumber + "�Դϴ�.");

			p1.guess();
			p2.guess();
			p3.guess();
			
			if (isRight(p1, targetNumber) || isRight(p2, targetNumber) || isRight(p3, targetNumber))
			{
				System.out.println("���� ������ �ֽ��ϴ�.");
				System.out.println(p1.getId() + "�� ���� : " + isRight(p1, targetNumber));
				System.out.println(p2.getId() + "�� ���� : " + isRight(p2, targetNumber));
				System.out.println(p3.getId() + "�� ���� : " + isRight(p3, targetNumber));
				System.out.println("���� ��");
				break;
			}
			else
			{
				System.out.println("�ٽ� �õ��ؾ� �մϴ�.");
			}
		}
	}
	
	private boolean isRight(Player p, int answer)
	{
		if (p.getNumber() == answer)
		{
			return true;
		}
		return false;
	}
}
