package 巩力2;

public class PermanentWorker extends Employee implements PolicyHolder
{
	public PermanentWorker()
	{
		// TODO 磊悼 积己等 积己磊 胶庞
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
