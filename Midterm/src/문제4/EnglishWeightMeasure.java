package 문제4;

public class EnglishWeightMeasure implements StandardWeightMeasure
{

	@Override
	public void exchange(int weight)
	{
		System.out.println("영국 환산 량 : " + weight * 2.204623);
	}

}
