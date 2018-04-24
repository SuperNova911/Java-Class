import java.util.ArrayList;
import java.util.Scanner;

public class GameManager
{
	public enum hit { Miss, Hit, Kill }

	ArrayList<Submarine> subList = new ArrayList<Submarine>();

	static int SUBMARINE_LENGTH = 3;
	static int SUBMARINE_NUMBER = 4;
	static int MAPSIZE = 6;
	int[][] map = new int[MAPSIZE][MAPSIZE];

	public void setSubmarine()
	{
		for (int i = 1; i <= SUBMARINE_NUMBER; i++)
		{
			Submarine sub = new Submarine(i, SUBMARINE_LENGTH);
			subList.add(sub);
		}
	}

	public void deploySubmarine()
	{
		int x, y, direction;
		boolean deployed = false;

		int tryCount = 0;

		for (Submarine sub : subList)
		{
			while (deployed == false && tryCount < MAPSIZE * MAPSIZE * 2)
			{	
				tryCount++;

				x = (int)(Math.random() * (MAPSIZE));
				y = (int)(Math.random() * (MAPSIZE));
				direction = (int)(Math.random() * 4);

				if (map[x][y] != 0)
					continue;

				sub.setPosition(x, y, direction);
				deployed = deploy(sub);
			}

			if (deployed == false)
			{
				System.out.println("망해서 초기화");
				clearMap();
				deploySubmarine();
			}

			deployed = false;
			tryCount = 0;
		}
	}

	private boolean deploy(Submarine sub)
	{
		int x = sub.getXpos();
		int y = sub.getYpos();
		int direction = sub.getDirection();
		int length = sub.getLength();

		if (direction < 0 || direction > 4)
		{
			System.out.println("isDeployable() Wrong direction. input: " + direction);
			return false;
		}

		int start, end;

		if (direction == 0 || direction == 2)
		{
			if (direction == 0)
			{
				start = x - length + 1;
				end = x;
			}
			else
			{
				start = x;
				end = x + length - 1;
			}

			if (start < 0 || end > MAPSIZE - 1)
				return false;

			for (int i = start; i <= end; i++)
			{
				if (map[i][y] != 0)
					return false;
			}

			for (int i = start; i <= end; i++)
				map[i][y] = sub.getName();
		}

		if (direction == 1 || direction == 3)
		{
			if (direction == 1)
			{
				start = y;
				end = y + length - 1;
			}
			else
			{
				start = y - length + 1;
				end = y;
			}

			if (start < 0 || end > MAPSIZE - 1)
				return false;

			for (int i = start; i <= end; i++)
			{
				if (map[x][i] != 0)
					return false;
			}

			for (int i = start; i <= end; i++)
				map[x][i] = sub.getName();
		}

		return true;
	}

	public void clearMap()
	{
		for (int i = 0; i < MAPSIZE; i++)
			for (int j = 0; j < MAPSIZE; j++)
				map[i][j] = 0;
	}

	public void drawMap()
	{
		for (int i = 0; i < MAPSIZE; i++)
		{
			for (int j = 0; j < MAPSIZE; j++)
				System.out.print(map[i][j] + " ");
			System.out.println();
		}
	}

	public void getInput()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("공격 좌표: ");
		String[] input = sc.nextLine().split(" ");
		
		if (input.length != 2)
			return;
		
		if (!input[0].matches(".*[0-9].*") || !input[1].matches(".*[0-9].*"))
			return;

		int x = Integer.parseInt(input[0]);
		int y = Integer.parseInt(input[1]);
		
		if (x < 0 || x >= MAPSIZE || y < 0 || y >= MAPSIZE)
			return;
		
		hitScan(x, y);
	}

	public void hitScan(int x, int y)
	{
		hit hitMark;
		
		if (map[x][y] == 0)
		{
			System.out.println("Miss");
			hitMark = hit.Miss;
			return;
		}
			

		Submarine sub = null;
		
		for (Submarine list : subList)
		{
			if (list.getName() == map[x][y])
			{
				sub = list;
				break;
			}
		}
		
		map[x][y] = 0;
		sub.setLife(sub.getLife() - 1);
		
		if (sub.getLife() == 0)
			hitMark = hit.Kill;
		else
			hitMark = hit.Hit;
		
		switch (hitMark)
		{
		case Hit:
			System.out.println("HIT: Submarine " + sub.getName());
			break;
		case Kill:
			System.out.println("KILL: Submarine " + sub.getName() + ", " + submarineCount() + "대 남음");
			break;
		default:
			System.out.println("? 무엇");
			break;
		
		}
	}
	
	public int submarineCount()
	{
		int n = 0;
		
		for (Submarine sub : subList)
			if (sub.getLife() > 0)
				n++;
		
		return n;
	}
}
