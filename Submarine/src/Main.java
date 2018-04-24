
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
		
		System.out.println("¸Ê Å©±â :" + gm.MAPSIZE + "x" + gm.MAPSIZE + ", Àá¼öÇÔ ¼ö :" + gm.SUBMARINE_NUMBER);
		int tryCount = 0;
		
		while (gm.submarineCount() > 0)
		{
			gm.getInput();
			tryCount++;
		}

		System.out.println("ÀÌ¤»±è¤»");
		System.out.println("½ÃµµÈ½¼ö: " + tryCount);
		System.out.println("¸íÁß·ü: " + String.format("%.2f", (gm.SUBMARINE_NUMBER * gm.SUBMARINE_LENGTH) / (double)tryCount * 100) + "%");
		
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
