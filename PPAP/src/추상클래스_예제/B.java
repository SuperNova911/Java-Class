package 추상클래스_예제;

public class B extends A
{
	public void print()
	{
		System.out.println("B클래스");
	}

	public void print(int number)
	{
		super.m = number;
		super.print();
		this.print();
	}
}
