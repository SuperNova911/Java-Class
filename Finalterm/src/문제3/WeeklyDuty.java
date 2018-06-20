package ¹®Á¦3;

import java.util.ArrayList;

public class WeeklyDuty implements Runnable 
{
	private ClassSelectThread thread;
	private ArrayList<String> list;
	
	public WeeklyDuty(ClassSelectThread thread, ArrayList<String> list)
	{
		this.thread = thread;
		this.list = list;
	}

	@Override
	public void run()
	{
		thread.print(list);
	}

}
