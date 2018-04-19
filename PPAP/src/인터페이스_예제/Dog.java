package 인터페이스_예제;

public class Dog extends Animal implements Pet
{
	String food;
	
	@Override
	public void beFriendly()
	{
		System.out.println(name + "좋아하지 않는다! (DOG)");
	}

	@Override
	public void play()
	{
		System.out.println(name + " 놀고 있다! (DOG");
	}
	
	public void eat(String food)
	{
		System.out.println(name + "가 " + food + "를 먹고 있다!");
	}

}
