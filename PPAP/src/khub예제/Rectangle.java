package khub����;

import java.util.Scanner;

public class Rectangle
{
	private int width;
	private int height;
	
	public Rectangle(int width, int height)
	{
		this.width = width;
		this.height = height;
	}
	
	public int getArea()
	{
		return width * height;
	}
	
	
	public static void main(String[] args)
	{
		int width, height;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�簢���� �غ�, ���� �Է�: ");
		
		width = sc.nextInt();
		height = sc.nextInt();
		
		Rectangle rect = new Rectangle(width, height);
		
		System.out.println("�簢���� ����: " + rect.getArea());
		
		sc.close();
	}
}
