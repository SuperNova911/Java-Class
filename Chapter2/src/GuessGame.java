
public class GuessGame
{
	Player p1;
	
	public void startGame()
	{
		p1 = new Player();
		
		int guessp1 = 0;
		
		boolean p1isRight = false;
		
		int targetNumber = (int)(Math.random() * 10);
		System.out.println("0이상 9이하의 숫자를 맞춰보세요.");
		
		while (true)
		{
			System.out.println("맞춰야 할 숫자는" + targetNumber + "입니다.");
			
			p1.guess();
			
			guessp1 = p1.number;
			System.out.println("1번 선수가 찍은 숫자: " + guessp1);
			
			if (guessp1 == targetNumber)
			{
				p1isRight = true;
			}
			
			if (p1isRight)
			{
				System.out.println("맞춘 선수가 있습니다.");
				System.out.println("1번 선수 : " + p1isRight);
				System.out.println("게임 끝");
				break;
			}
			else
			{
				System.out.println("다시 시도해야 합니다.");
			}
		}
	}
}
