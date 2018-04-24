package 인터페이스_예제;

public class InterfaceTest
{

	public static void main(String[] args)
	{
		Dog d = new Dog();
		Cat c = new Cat();
		
		d.name = "dog";
		d.beFriendly();
		
		c.name = "cat";
		c.play();
		c.eat();
	}

}
