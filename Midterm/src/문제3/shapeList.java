package ����3;

import java.util.ArrayList;

class Shape { // ���� Ŭ����
	public void draw(int i) {
		System.out.println("Shape");
	}
}

class Triangle extends Shape {
	public void draw(int i)
	{
		System.out.println(i + "��° ������ �ﰢ���Դϴ�.");
	}
}

class Rectangle extends Shape {
	public void draw(int i)
	{
		System.out.println(i + "��° ������ �簢���Դϴ�.");
	}
}

class Circle extends Shape {
	public void draw(int i)
	{
		System.out.println(i + "��° ������ ���Դϴ�.");
	}
}

public class shapeList {
	ArrayList<Shape> lists = new ArrayList();
	int nextIndex = 0;

	public shapeList() {
		System.out.println("--------------------");
		System.out.println("1�� : �ﰢ�� �߰� / 2�� : �簢�� �߰� / 3�� : �� �߰�");
		System.out.println("4�� : ������� / 5�� : ����");
	}

	public void add(Object ob)
	{
		lists.add((Shape) ob);
		System.out.println("������ �߰��Ǿ����ϴ�.");
	}

	public void print()
	{
		for (int i = 0; i < lists.size(); i++)
		{
			lists.get(i).draw(i + 1);
		}
	}

	public static void main(String[] args) {
		GameHelper2 helper = new GameHelper2();
		String input = "";

		shapeList shapeList = new shapeList();
		
		input = helper.getUserInput();
		
		while (true)
		{
			if (input.equals("1"))
			{
				shapeList.add(new Triangle());				
			}
			if (input.equals("2"))
			{
				shapeList.add(new Rectangle());
			}
			if (input.equals("3"))
			{
				shapeList.add(new Circle());
			}
			if (input.equals("4"))
			{
				shapeList.print();
			}
			if (input.equals("5"))
			{
				System.out.println("����Ǿ����ϴ�.");
				break;
			}

			input = helper.getUserInput();
		}


		System.out.println("--------------------");
	}
}