package ����2;

public class PermanentWorker extends Employee implements PolicyHolder
{
	public PermanentWorker()
	{
		// TODO �ڵ� ������ ������ ����
	}
	
	public PermanentWorker(String name)
	{
		this.employeeName = name;
	}

	@Override
	public void payInsurance(String employeeName)
	{
		System.out.println("PermanentWorker " + employeeName + " paying worker insurance");
	}
	
}
