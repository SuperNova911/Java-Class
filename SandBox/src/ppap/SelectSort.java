package ppap;

public class SelectSort
{
	public static void main(String[] args)
	{
		int[] list = {0,3,5,4,1,2};
		
		int n = list.length - 1;
		int min, loc;
		
		pp(list);
		
		for (int i = 1; i <= n - 1; i++)
		{
			min = list[i];
			loc = i;
			
			for (int j = i; j <= n; j++)
				if (min > list[j])
				{
					min = list[j];
					loc = j;
				}
			
			for (int k = loc; k >= i + 1; k--)
				list[k] = list[k - 1];
			
			list[i] = min;
			pp(list);
			
		}
	}
	
	public static void pp(int[] list)
	{
		for (int n : list)
		{
			System.out.print(n + " ");
		}
		System.out.println();
	}
}
