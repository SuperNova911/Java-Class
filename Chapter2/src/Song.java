
public class Song
{
	String title;
	String artist;
	int number;
	
	public void setTitle()
	{
		System.out.println("제목 변경");
	}
	
	public void setArtist()
	{
		System.out.println("가수 변경");
	}
	
	public void play()
	{
		System.out.println(number + "번 노래가 연주되고 있어요!");
	}
}