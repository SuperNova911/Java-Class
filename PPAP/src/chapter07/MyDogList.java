package chapter07;

import java.util.ArrayList;

public class MyDogList
{
	ArrayList<Dog2> dogs = new ArrayList<Dog2>();
	
	int nextIndex = 0;
	
	public void add(Object obj)
	{
		dogs.add(nextIndex,(Dog2) obj);
		nextIndex++;
	}
	
//	public void add(Object obj)
//	{
//		dogs.add((Dog2) obj);
//	}
	
	public void print()
	{
		for (int i = 0; i < dogs.size(); i++)
		{
			System.out.println("Dog added at " + i);
			System.out.println("Type " + dogs.get(i));
			Dog2 d = dogs.get(i);
			d.run();
		}
	}
	
	
	public static void main(String[] args)
	{
		MyDogList m = new MyDogList();
		
		Dog2 c = new Cat2();
		Dog2 d = new Dog2();
		
		m.add(c);
		m.add(d);
		m.print();
	}
}
