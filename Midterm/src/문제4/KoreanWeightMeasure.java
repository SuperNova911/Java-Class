package ����4;

public class KoreanWeightMeasure implements StandardWeightMeasure
{

	@Override
	public void exchange(int weight)
	{
		System.out.println("�ѱ� ȯ�� �� : " + weight * 1.666667);
	}
}
