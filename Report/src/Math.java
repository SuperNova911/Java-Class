// 201510743 ±è¼öÈ¯
public class Math
{

	public static void main(String[] args)
	{
		System.out.println(Sum(5));
		System.out.println(Sum1(3));
		System.out.println(Fact(4));
		System.out.println(Fact_Sum(3));
	}
	
	public static int Sum(int n)
	{
		int result = 0;
		
		for (int i = 1; i <= n; i++)
			result += i;
		
		return result;
	}
	
	public static int Sum1(int n)
	{
		int result = 0;
		
		for (int i = 1; i <= n; i++)
			result += Sum(i);
		
		return result;
	}
	
	public static int Fact(int n)
	{
		int result = 1;
		
		for (int i = 1; i <= n; i++)
			result *= i;
		
		return result;
	}
	
	public static int Fact_Sum(int n)
	{
		int result = 0;
		
		for (int i = 1; i <= n; i++)
			result += Fact(i);
			
		return result;
	}
}
