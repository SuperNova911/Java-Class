package chapter07;

public class Dog extends Canine
{
	String type;
	
	public Dog()
	{
		System.out.println("°´Ã¼»ý¼º");
	}
	
	public Dog(String type)
	{
		this.type = type;
	}
	
	public void sleep(int count)
	{
		System.out.println(name + "ÀÌ(°¡) " + count + " ¹ø ÀáÀÚ°í ÀÖ´Ù.");
	}
	
	public void makeNoise()
	{
		super.roam();
		super.eat();
		
		System.out.println("Á¾·ù : " + type);
	}
	
	
	public static void main(String[] args)
	{
		Dog d2 = new Dog("°í¾çÀÌ°ú µ¿¹°");
		d2.makeNoise();
		
		Dog d = new Dog();
		d.name = "´ó´óÀÌ";
		d.type = "´ó´óÀÌ°ú µ¿¹°";
		d.sleep(5);
		d.makeNoise();
	}
}
