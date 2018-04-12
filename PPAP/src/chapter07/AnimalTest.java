package chapter07;

import java.util.ArrayList;

public class AnimalTest
{
	public static void main(String[] args)
	{
//		�迭 ��������� ������ ��
//		Animal[] a = new Animal[4];
//		a[0] = new Cat();
//		a[1] = new Canine();
//		a[2] = new Dog();
//		
//		for (int i = 0; i < a.length; i++)
//		{
//			a[i].name = "������";
//			a[i].age = 12;
//			a[i].makeNoise();
//			a[i].roam();
//		}

//		ArrayList�� ����ؼ� �ذ�
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(new Cat());
		animalList.add(new Canine());
		animalList.add(new Dog());
		
		for (Animal ani : animalList)
		{
			ani.name = "������";
			ani.age = 12;
			ani.makeNoise();
			ani.roam();
		}
	}
}
