package chapter03;

public class Animal
{
	private String name = "";
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void play(String str)
	{
		System.out.println(name + "��(��)" + str + "���� ��ƿ�!");
	}
}
