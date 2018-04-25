package 문제3;

import java.util.ArrayList;

class Shape { // 슈퍼 클래스
	public void draw(int i) {
		System.out.println("Shape");
	}
}

class Triangle extends Shape {
	public void draw(int i)
	{
		System.out.println(i + "번째 도형은 삼각형입니다.");
	}
}

class Rectangle extends Shape {
	public void draw(int i)
	{
		System.out.println(i + "번째 도형은 사각형입니다.");
	}
}

class Circle extends Shape {
	public void draw(int i)
	{
		System.out.println(i + "번째 도형은 원입니다.");
	}
}

public class shapeList {
	ArrayList<Shape> lists = new ArrayList();
	int nextIndex = 0;

	public shapeList() {
		System.out.println("--------------------");
		System.out.println("1번 : 삼각형 추가 / 2번 : 사각형 추가 / 3번 : 원 추가");
		System.out.println("4번 : 도형출력 / 5번 : 종료");
	}

	public void add(Object ob)
	{
		lists.add((Shape) ob);
		System.out.println("도형이 추가되었습니다.");
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
				System.out.println("종료되었습니다.");
				break;
			}

			input = helper.getUserInput();
		}


		System.out.println("--------------------");
	}
}