package �������̽�_����;

public class Cat extends Animal implements Pet, Wildness
{
	@Override
	public void notifyThePolice()
	{
		System.out.println(name + " ������ ���� ������ �Ű��ϴ�!");		
	}

	@Override
	public void beFriendly()
	{
		System.out.println(name + " �������� �ʴ´�! (CAT)");
	}

	@Override
	public void play()
	{
		System.out.println(name + " ��� �ִ�! (CAT)");
	}
	
	public void eat()
	{
		System.out.println(name + " �� �԰� �ִ�!");
	}
}
