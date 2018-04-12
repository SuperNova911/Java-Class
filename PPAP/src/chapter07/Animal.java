package chapter07;

public class Animal
{
	String food;
	String name;
	int age;
	
	public void makeNoise()
	{
		System.out.println(name + "이(가) 소리지르고 있다.");
	}
	
	public void roam()
	{
		System.out.println(name + "이(가) 돌아다니고 있다.");
	}
	
	public void eat()
	{
		System.out.println(name + "이(가) 먹고 있다.");
	}
	
	public void sleep()
	{
		System.out.println(name + "이(가) 잠자고 있다.");
	}
}
