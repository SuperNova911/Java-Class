package 문제3;

import java.util.ArrayList;
import java.util.Arrays;

public class ClassSelectThread 
{
	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<String>(
				Arrays.asList("박신혜", "이영애", "박지성", "김수지", "차승법", "김지우", "김미경", "서영민", "백설현", "최영화"));
		
		for (int i = 0; i < 30; i++)
		{
			WeeklyDuty duty = new WeeklyDuty(new ClassSelectThread(), list);
			duty.run();
		}
		
	}
	
	public void print(ArrayList<String> student)
	{
		int index = (int) (Math.random() * 10);
		
		try
		{
			System.out.println(student.get(index));
			student.remove(index);
		} catch (Exception e)
		{
			return;
		}
	}
}
