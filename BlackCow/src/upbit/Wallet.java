package upbit;

public class Wallet
{
	private CoinSymbol coinSymbol;
	private double balance;
	
	public Wallet(CoinSymbol coinSymbol)
	{
		this(coinSymbol, 0);
	}
	
	public Wallet(CoinSymbol coinSymbol, double balance)
	{
		this.setCoinSymbol(coinSymbol);
		this.setBalance(balance);
	}
	
	public void addBalance(double balance)
	{
		this.balance += balance;
	}
	
	public boolean subtractBalance(double balance)
	{
		if (this.balance < balance)
		{
			System.out.println("Error occurred on subtractBalance: " + this.coinSymbol + " " + this.balance + " - " + balance);
			
			this.balance = 0;
			return false;
		}
		
		this.balance -= balance;
		return true;
	}

	
	public CoinSymbol getCoinSymbol()
	{
		return coinSymbol;
	}
	public void setCoinSymbol(CoinSymbol coinSymbol)
	{
		this.coinSymbol = coinSymbol;
	}

	public double getBalance()
	{
		return balance;
	}
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	
	
}
