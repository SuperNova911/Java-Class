package khub예제;

public class Pizza
{
	static double PI = 3.14;
	
	private String name;
	private int radius;
	
	public Pizza()
	{
		this.name = "핏자";
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
		Pizza pizza1 = new Pizza("파인애플 피자", 10);
		System.out.println(pizza1.getName() + "의 면적: " + pizza1.getArea());
		
		Pizza pizza2 = new Pizza();
		System.out.println(pizza2.getName() + "의 면적: " + pizza2.getArea());
	}
}
