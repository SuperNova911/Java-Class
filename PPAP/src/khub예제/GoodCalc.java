package khub¿¹Á¦;

public class GoodCalc extends Calculator
{

	@Override
	public int add(int x, int y)
	{
		return x + y;
	}

	@Override
	public int subtract(int x, int y)
	{
		return x - y;
	}

	@Override
	public double average(int[] x)
	{
		double result = 0;
		
		for (int i : x)
			result += i;
		
		result = result / x.length;
		
		return result;
	}
	
	
	public static void main(String[] args)
	{
		GoodCalc cal = new GoodCalc();
		
		System.out.println(cal.add(3, 5));
		System.out.println(cal.subtract(5, 7));
		System.out.println(cal.average(new int[] {3,6,7}));
	}
}
