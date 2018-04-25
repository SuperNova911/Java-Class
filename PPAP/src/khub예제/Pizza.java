package khub����;

public class Pizza
{
	static double PI = 3.14;
	
	private String name;
	private int radius;
	
	public Pizza()
	{
		this.name = "����";
		this.radius = 1;
	}
	
	public Pizza(String name, int radius)
	{
		this.name = name;
		this.radius = radius;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public double getArea()
	{
		return PI * radius * radius;
	}
	
	public static void main(String[] args)
	{
		Pizza pizza1 = new Pizza("���ξ��� ����", 10);
		System.out.println(pizza1.getName() + "�� ����: " + pizza1.getArea());
		
		Pizza pizza2 = new Pizza();
		System.out.println(pizza2.getName() + "�� ����: " + pizza2.getArea());
	}
}
