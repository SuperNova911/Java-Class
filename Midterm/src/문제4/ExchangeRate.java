package 문제4;

import java.util.ArrayList;

public class ExchangeRate
{
	public static void main(String[] args)
	{
		ArrayList<StandardWeightMeasure> list = new ArrayList<StandardWeightMeasure>();
		
		KoreanWeightMeasure korea = new KoreanWeightMeasure();
		AmericanWeightMeasure america = new AmericanWeightMeasure();
		EnglishWeightMeasure english = new EnglishWeightMeasure();
		
		list.add(korea);
		list.add(america);
		list.add(english);
		
		System.out.println("무게 변환을 시작합니다.");
		for (StandardWeightMeasure e : list)
		{
			e.exchange(1000);
		}
		System.out.println("무게 변환을 종료합니다.");
	}
}
