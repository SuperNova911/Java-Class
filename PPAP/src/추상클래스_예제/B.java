package �߻�Ŭ����_����;

public class B extends A
{
	public void print()
	{
		System.out.println("BŬ����");
	}

	public void print(int number)
	{
		super.m = number;
		super.print();
		this.print();
	}
}
