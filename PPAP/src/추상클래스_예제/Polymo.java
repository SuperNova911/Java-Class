package 추상클래스_예제;

public class Polymo
{

	public static void main(String[] args)
	{
		B b = new B();
		b.print();
		b.print(50);
		System.out.println();
		
		C c = new C();
		System.out.println(c.num);
		System.out.println();
		
		C c1 = new C(1000);
		System.out.println(c1.num);
	}

}
