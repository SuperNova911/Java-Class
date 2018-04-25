package ¹®Á¦2;

public class Salesman extends Employee implements PolicyHolder
{
	public Salesman(String name)
	{
		this.employeeName = name;
	}

	@Override
	public void payInsurance(String employeeName)
	{
		System.out.println(employeeName + " paying sales insurance");
	}

}
