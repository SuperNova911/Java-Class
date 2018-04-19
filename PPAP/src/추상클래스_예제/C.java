package 추상클래스_예제;

public class C extends A
{
	int num = 0;
	
	public C()
	{
		System.out.println("C클래스!");
		num = 20;
	}
	
	public C(int i)
	{
		num = i;
	}
}
