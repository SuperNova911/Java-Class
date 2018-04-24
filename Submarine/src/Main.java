
public class Main
{

	public static void main(String[] args)
	{
		GameManager gm = new GameManager();
		gm.setSubmarine();
		gm.drawMap();
		System.out.println();
		gm.deploySubmarine();
		gm.drawMap();
		System.out.println();
		
		System.out.println("�� ũ�� :" + gm.MAPSIZE + "x" + gm.MAPSIZE + ", ����� �� :" + gm.SUBMARINE_NUMBER);
		int tryCount = 0;
		
		while (gm.submarineCount() > 0)
		{
			gm.getInput();
			tryCount++;
		}

		System.out.println("�̤��褻");
		System.out.println("�õ�Ƚ��: " + tryCount);
		System.out.println("���߷�: " + String.format("%.2f", (gm.SUBMARINE_NUMBER * gm.SUBMARINE_LENGTH) / (double)tryCount * 100) + "%");
		
//		int a = 0;
//		int b = 0;
//		int c = 0;
//		int n;
//		for (int i = 0; i <= 300; i++)
//		{
//			//System.out.println((int) (Math.random() * 2));
//			n = (int)(Math.random() * 3);
//			
//			if (n == 0)
//				a++;
//			else if( n == 1)
//				b++;
//			else if (n == 2)
//				c++;
//		}
//		System.out.println(a + " " +b + " " + c);
	}

}
