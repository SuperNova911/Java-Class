package chapter02;

public class GuessGame2
{
	public void startGame()
	{
		Player2 p1 = new Player2(1);
		Player2 p2 = new Player2(2);
		Player2 p3 = new Player2(3);
		
		int targetNumber = (int)(Math.random() * 10);
		System.out.println("0이상 9이하의 숫자를 맞춰보세요.");
		
		while (true)
		{
			System.out.println("맞춰야 할 숫자는" + targetNumber + "입니다.");

			p1.guess();
			p2.guess();
			p3.guess();
			
			if (isRight(p1, targetNumber) || isRight(p2, targetNumber) || isRight(p3, targetNumber))
			{
				System.out.println("맞춘 선수가 있습니다.");
				System.out.println(p1.getId() + "번 선수 : " + isRight(p1, targetNumber));
				System.out.println(p2.getId() + "번 선수 : " + isRight(p2, targetNumber));
				System.out.println(p3.getId() + "번 선수 : " + isRight(p3, targetNumber));
				System.out.println("게임 끝");
				break;
			}
			else
			{
				System.out.println("다시 시도해야 합니다.");
			}
		}
	}
	
	private boolean isRight(Player2 p, int answer)
	{
		if (p.getNumber() == answer)
		{
			return true;
		}
		return false;
	}
}
