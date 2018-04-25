package khub¿¹Á¦;

class Shape
{
	protected String name;
	
	public Shape next;
	
	public Shape()
	{
		next = null;
	}
	
	public void paint()
	{
		this.draw();
	}
	
	public void draw()
	{
		System.out.println("Shape");
	}
}

class Line extends Shape
{
	@Override
	public void draw()
	{
		System.out.println("Line");
	}
}

class Rect extends Shape
{
	@Override
	public void draw()
	{
		System.out.println("Rect");
	}
}

class Circle extends Shape
{
	@Override
	public void draw()
	{
		System.out.println("Circle");
	}
}

public class MethodOverriding
{
	public static void paint(Shape p)
	{
		p.draw();
	}
	
	public static void main(String[] args)
	{
		paint(new Shape());
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
	}
}
