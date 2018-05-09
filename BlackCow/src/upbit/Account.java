package upbit;

import java.util.ArrayList;

public class Account
{
	private String id;
	private String password;
	private int KRW;
	
	private ArrayList<Wallet> walletList;
	
	
	// �α��� ��� ����
	public Account(String id, String password, int KRW)
	{
		this.id = id;
		this.password = password;
		this.walletList = new ArrayList<Wallet>();
		this.KRW = KRW;
	}
	
	public boolean addWallet(Wallet wallet)
	{
		if (checkWallet(wallet.getCoinSymbol()) == false)
		{
			walletList.add(wallet);
			return true;
		}
		
		System.out.println("Failed to addWallet, already exist: " + wallet.getCoinSymbol());
		return false;
	}
	
	public boolean removeWallet(CoinSymbol coinSymbol)
	{
		Wallet wallet = searchWallet(coinSymbol);
		
		if (wallet != null)
		{
			walletList.remove(wallet);
			return true;
		}
		else
			System.out.println("Failed to remove wallet: " + coinSymbol);
		
		return false;
		
//		for (int i = 0; i < walletList.size(); i++)
//		{
//			if (walletList.get(i).getCoinSymbol() == coinSymbol)
//			{
//				walletList.remove(i);
//				return true;
//			}
//		}
	}
	
	public Wallet searchWallet(CoinSymbol coinSymbol)
	{
		for (Wallet wallet : walletList)
		{
			if (wallet.getCoinSymbol() == coinSymbol)
				return wallet;
		}
		
		System.out.println("Failed to searchWallet: " + coinSymbol);
		
		return null;
		
//		try
//		{
//			for (Wallet wallet : walletList)
//			{
//				if (wallet.getCoinSymbol() == coinSymbol)
//					return wallet;
//			}
//		}
//		catch (NullPointerException e) 
//		{
//			e.getMessage();
//		}
//		System.out.println("Failed to find wallet: " + coinSymbol);
//		return null;
	}
	
	public boolean checkWallet(CoinSymbol coinSymbol)
	{
		for (Wallet wallet : walletList)
		{
			if (wallet.getCoinSymbol() == coinSymbol)
				return true;
		}
		
		return false;
	}

	public void addBalance(CoinSymbol coinSymbol, double balance, double buyPrice)
	{
		Wallet wallet = searchWallet(coinSymbol);
		
		if (wallet != null)
		{
			wallet.addBalance(balance, buyPrice);
		}
		else
		{
			System.out.println("Create new wallet :" + coinSymbol);
			addWallet(new Wallet(coinSymbol, balance, buyPrice));
		}
	}
	
	public boolean subtractBalance(CoinSymbol coinSymbol, double balance)
	{
		Wallet wallet = searchWallet(coinSymbol);
		
		if (wallet != null)
			wallet.subtractBalance(balance);
		else
		{
			System.out.println("Failed to subtractBalance, not exist: " + coinSymbol);
			return false;
		}
		
		if (wallet.getBalance() == 0)
			walletList.remove(wallet);
		
		return true;
	}
	
	public double getBalance(CoinSymbol coinSymbol)
	{
		Wallet wallet = searchWallet(coinSymbol);
		
		if (wallet != null)
			return wallet.getBalance();
		else
			return 0;
	}
	
	public ArrayList<Wallet> getWalletList()
	{
		return walletList;
	}
	
	public int getKRW()
	{
		return KRW;
	}
	
	public void setKRW(int KRW)
	{
		this.KRW = KRW;
	}
}
