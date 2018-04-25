package ¹®Á¦2;

public class JavaDeveloper extends PermanentWorker implements Programmer
{
	public JavaDeveloper(String name)
	{
		this.employeeName = name;
	}

	@Override
	public void coding(String employeeName)
	{
		System.out.println("JavaDeveloper " + employeeName + " programming java");
	}

	public void payInsurance(String employeeName)
	{
		System.out.println(employeeName + " paying JavaDeveloper insurance");
	}
}
