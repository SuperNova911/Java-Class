package �������̽�_����;

public class Dog extends Animal implements Pet
{
	String food;
	
	@Override
	public void beFriendly()
	{
		System.out.println(name + "�������� �ʴ´�! (DOG)");
	}

	@Override
	public void play()
	{
		System.out.println(name + " ��� �ִ�! (DOG");
	}
	
	public void eat(String food)
	{
		System.out.println(name + "�� " + food + "�� �԰� �ִ�!");
	}

}
