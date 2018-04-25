package 문제4;

public class KoreanWeightMeasure implements StandardWeightMeasure
{

	@Override
	public void exchange(int weight)
	{
		System.out.println("한국 환산 량 : " + weight * 1.666667);
	}
}
