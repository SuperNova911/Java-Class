package ����4;

public class EnglishWeightMeasure implements StandardWeightMeasure
{

	@Override
	public void exchange(int weight)
	{
		System.out.println("���� ȯ�� �� : " + weight * 2.204623);
	}

}
