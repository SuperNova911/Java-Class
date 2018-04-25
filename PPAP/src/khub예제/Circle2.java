package khub¿¹Á¦;

class Shape2
{
	protected String name;
	
	public void paint()
	{
		this.draw();
	}
	
	public void draw()
	{
		System.out.println(name);
	}
}

public class Circle2 extends Shape2
{
	protected String name;
	
	public void draw()
	{
		this.name = "Circle";
		super.name = "Shape";
		
		super.draw();
		System.out.println(name);
	}

	
	public static void main(String[] args)
	{
		Shape2 pizza = new Circle2();
		
		pizza.paint();
	}

}
