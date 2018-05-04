package upbit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Request
{
	public enum TermType
	{
		minutes, days, weeks, months
	}
	
	public static String request(String urlAddress)
	{
		URL url;
		String result;
		
		try
		{
			url = new URL(urlAddress);
			URLConnection urlConn = url.openConnection();
			BufferedReader br = new BufferedReader(new InputStreamReader(urlConn.getInputStream()));

			result = br.readLine();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
			result = "request failed";
		}
		
		return result;
	}
	 
	public static String createUpbitURL(
			Market market, CoinSymbol coinSymbol, TermType termType, int dataAmount)
	{
		return createUpbitURL(market, coinSymbol, termType, 0, dataAmount, "now");
	}

	public static String createUpbitURL(
			Market market, CoinSymbol coinSymbol, TermType termType, int dataAmount, String timeStamp)
	{
		return createUpbitURL(market, coinSymbol, termType, 0, dataAmount, timeStamp);
	}
	
	public static String createUpbitURL(
			Market market, CoinSymbol coinSymbol, TermType termType, int term, int dataAmount)
	{
		return createUpbitURL(market, coinSymbol, termType, term, dataAmount, "now");
	}
	
	public static String createUpbitURL(
			Market market, CoinSymbol coinSymbol, TermType termType, int term, int dataAmount, String timeStamp)
	{
		String url = "https://crix-api-endpoint.upbit.com/v1/crix/candles/";
		
		url += termType.toString();
		
		if (termType == TermType.minutes)
			url += "/" + Integer.toString(term);		
		
		url += "?code=CRIX.UPBIT."
				+ market.toString() + "-"
				+ coinSymbol.toString();
		
		if (dataAmount >= 1)
			url += "&count=" + dataAmount;
		
		if (!timeStamp.equals("now"))
			url += "&to=" + timeStamp;
		
		return url;
	}
}
