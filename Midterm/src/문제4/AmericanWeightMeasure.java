package 문제4;

public class AmericanWeightMeasure implements StandardWeightMeasure
{

	@Override
	public void exchange(int weight)
	{
		System.out.println("미국 환산 량 : " + weight * 35.273962);
	}

}
