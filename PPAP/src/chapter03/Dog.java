package chapter03;

public class Dog 
{
	String name;
	
	public static void main(String[] args) 
	{
		Dog dog1 = new Dog();
		dog1.bark();
		dog1.name = "大大捞";
		
		Dog[] myDogs = new Dog[3];
		myDogs[0] = new Dog();
		myDogs[1] = new Dog();
		myDogs[2] = dog1;
		
		myDogs[0].name = "檬内";
		myDogs[1].name = "捻虐";
		
		System.out.print("付瘤阜 俺狼 捞抚: ");
		System.out.println(myDogs[2].name);
		
		int x = 0;
		
		while (x < myDogs.length)
		{
			myDogs[x].bark();
			x++;
		}
	}
	
	public void bark()
	{
		System.out.println(name + ": 港港~");
	}
	
	public void eat()
	{
		
	}
	
	public void chaseCat()
	{
		
	}
}
