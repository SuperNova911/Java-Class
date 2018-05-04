package upbit;

import java.util.ArrayList;

public class Account
{
	private String id;
	private String password;
	
	private ArrayList<Wallet> walletList;
	
	
	public Account(String id, String password)
	{
		this.id = id;
		this.password = password;
		this.walletList = new ArrayList<Wallet>();
	}
	
	public boolean addWallet(Wallet wallet)
	{
		try
		{
			walletList.add(wallet);
			return true;
		}
		catch (Exception e) 
		{
			System.out.println("Failed to add wallet");
		}
		return false;
	}
	
	public boolean removeWallet(CoinSymbol coinSymbol)
	{
		for (int i = 0; i < walletList.size(); i++)
		{
			if (walletList.get(i).getCoinSymbol() == coinSymbol)
			{
				walletList.remove(i);
				return true;
			}
		}
		
		System.out.println("Failed to remove wallet: " + coinSymbol);
		return false;
	}
	
	public Wallet searchWallet(CoinSymbol coinSymbol)
	{
		try
		{
			for (Wallet wallet : walletList)
			{
				if (wallet.getCoinSymbol() == coinSymbol)
					return wallet;
			}
		}
		catch (NullPointerException e) 
		{
			e.getMessage();
		}
		System.out.println("Failed to find wallet: " + coinSymbol);
		return null;
	}

	public void addBalance(CoinSymbol coinSymbol, double balance)
	{
		Wallet wallet = searchWallet(coinSymbol);
		
		if (wallet == null)
		{
			System.out.println("Create new wallet :" + coinSymbol);
			this.addWallet(new Wallet(coinSymbol));
			wallet = searchWallet(coinSymbol);
			wallet.addBalance(balance);
			
			return;
		}
		
		wallet.addBalance(balance);
	}
	
	public void subtractBalance(CoinSymbol coinSymbol, double balance)
	{
		Wallet wallet = searchWallet(coinSymbol);

		if (wallet == null)
			return;
		
		if (wallet.subtractBalance(balance) == false || wallet.getBalance() == 0)
		{
			removeWallet(coinSymbol);
		}
	}
	
	public double getBalance(CoinSymbol coinSymbol)
	{
		Wallet wallet = searchWallet(coinSymbol);
		
		if (wallet == null)
			return 0;

		return wallet.getBalance();
	}
	
	public ArrayList<Wallet> getWalletList()
	{
		return walletList;
	}
}
