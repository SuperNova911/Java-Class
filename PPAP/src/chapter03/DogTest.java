package chapter03;

import java.util.ArrayList;

public class DogTest
{
	ArrayList<Animal> at = new ArrayList<Animal>();
	
	public ArrayList<Animal> setList(String[] namelist)
	{
		for (String n : namelist)
		{
			Animal ani = new Animal();
			ani.setName(n);
			at.add(ani);
		}
		
		return at;
	}
	
	public static void main(String[] args)
	{
		DogTest dt = new DogTest();
		String[] name = { "얼룩소", "기린", "고양이" };
		
		ArrayList<Animal> animalList = dt.setList(name);
		
		for (int i = 0; i < animalList.size(); i++)
		{
			Animal ani = animalList.get(i);
			System.out.println(ani.getName());
			ani.play("에버랜드");
		}
	}
}
