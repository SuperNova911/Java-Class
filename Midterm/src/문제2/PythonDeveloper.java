package ¹®Á¦2;

public class PythonDeveloper extends PermanentWorker implements Programmer
{
	public PythonDeveloper(String name)
	{
		this.employeeName = name;
	}

	@Override
	public void coding(String employeeName)
	{
		System.out.println("PythonDeveloper " + employeeName + " programming python");
	}

	public void payInsurance(String employeeName)
	{
		System.out.println(employeeName + " paying PythonDeveloper insurance");
	}
}
