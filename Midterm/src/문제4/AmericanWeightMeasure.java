package ����4;

public class AmericanWeightMeasure implements StandardWeightMeasure
{

	@Override
	public void exchange(int weight)
	{
		System.out.println("�̱� ȯ�� �� : " + weight * 35.273962);
	}

}
