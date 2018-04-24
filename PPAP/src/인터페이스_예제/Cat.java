package 인터페이스_예제;

public class Cat extends Animal implements Pet, Wildness
{
	@Override
	public void notifyThePolice()
	{
		System.out.println(name + " 구출을 위해 경찰에 신고하다!");		
	}

	@Override
	public void beFriendly()
	{
		System.out.println(name + " 좋아하지 않는다! (CAT)");
	}

	@Override
	public void play()
	{
		System.out.println(name + " 놀고 있다! (CAT)");
	}
	
	public void eat()
	{
		System.out.println(name + " 가 먹고 있다!");
	}
}
