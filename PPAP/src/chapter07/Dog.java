package chapter07;

public class Dog extends Canine
{
	String type;
	
	public Dog()
	{
		System.out.println("��ü����");
	}
	
	public Dog(String type)
	{
		this.type = type;
	}
	
	public void sleep(int count)
	{
		System.out.println(name + "��(��) " + count + " �� ���ڰ� �ִ�.");
	}
	
	public void makeNoise()
	{
		super.roam();
		super.eat();
		
		System.out.println("���� : " + type);
	}
	
	
	public static void main(String[] args)
	{
		Dog d2 = new Dog("����̰� ����");
		d2.makeNoise();
		
		Dog d = new Dog();
		d.name = "�����";
		d.type = "����̰� ����";
		d.sleep(5);
		d.makeNoise();
	}
}
