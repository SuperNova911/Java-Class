package ����3;

import java.util.ArrayList;
import java.util.Arrays;

public class ClassSelectThread 
{
	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<String>(
				Arrays.asList("�ڽ���", "�̿���", "������", "�����", "���¹�", "������", "��̰�", "������", "�鼳��", "�ֿ�ȭ"));
		
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
