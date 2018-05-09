package upbit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

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
			System.out.println("Failed to request: " + urlAddress);
			result = "RQ_FAIL";
		}
		
		return result;
	}
	 
	// 이름 바꾸기
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
		
		url += termType;
		
		if (termType == TermType.minutes)
			url += "/" + Integer.toString(term);		
		
		url += "?code=CRIX.UPBIT."
				+ market + "-"
				+ coinSymbol;
		
		if (dataAmount >= 1)
			url += "&count=" + dataAmount;
		
		if (!timeStamp.equals("now"))
			url += "&to=" + timeStamp;
		
		return url;
	}
	
	
	public static String KappaURL(Market market, CoinSymbol coinSymbol)
	{
		String url = "https://www.upbit.com/exchange?code=CRIX.UPBIT.";
		
		url += market + "-" + coinSymbol;
		
		return url;
	}
	
	public static String Kappa(String url)
	{
		String data = "";
		
		try
		{
			Document doc = Jsoup.connect(url).get();
			Elements elem = doc.select(".kline-para > ul:nth-child(2) > li:nth-child(1)");
			data = elem.text();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		return data;
	}
}
