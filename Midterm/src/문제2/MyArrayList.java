package ¹®Á¦2;

import java.util.ArrayList;

public class MyArrayList
{
	public static ArrayList<Employee> empList = new ArrayList<Employee>();
	
	public static void main(String[] args)
	{
		JavaDeveloper javaDev = new JavaDeveloper("yang");
		PermanentWorker permaWork = new PermanentWorker("lee");
		PythonDeveloper pythonDev = new PythonDeveloper("kim");
		Salesman salesMan = new Salesman("park");

		add(javaDev);
		add(permaWork);
		add(pythonDev);
		add(salesMan);
		
		print();
	}
	
	public static void add(Employee e)
	{
		empList.add(e);
	}
	
	public static void print()
	{
		for (Employee e : empList)
		{
			if (e instanceof JavaDeveloper)
			{
				((JavaDeveloper) e).coding(e.employeeName);
			}
			if (e instanceof PythonDeveloper)
			{
				((PythonDeveloper) e).coding(e.employeeName);
			}
			if (e instanceof PermanentWorker)
			{
				((PermanentWorker) e).payInsurance(e.employeeName);
			}
			if (e instanceof Salesman)
			{
				((Salesman) e).payInsurance(e.employeeName);
			}
			
			System.out.println("-----");
		}
	}
}
