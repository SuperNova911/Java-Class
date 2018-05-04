package upbit;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonManager
{
	public enum JsonKey
	{
		code, candleDateTime, candleDateTimeKst, openingPrice, highPrice, lowPrice, 
		tradePrice, candleAccTradeVolume, candleAccTradePrice, timestamp, prevClosingPrice, 
		change, changePrice, changeRate, signedChangePrice, signedChangeRate
	}
	
	public static JSONArray parse(String data)
	{
		JSONArray jsonArray = new JSONArray();
		JSONParser jsonParser = new JSONParser();
		
		try
		{
			jsonArray = (JSONArray) jsonParser.parse(data);
			
//			for (int i = 0; i < jsonArray.size(); i++)
//			{
//				jsonObj = (JSONObject)jsonArray.get(i);
//				System.out.println(jsonObj.get("candleDateTimeKst"));
//			}
		}
		catch (ParseException e)
		{
			e.printStackTrace();
		}
		
		return jsonArray;
	}
	
	public static void save(JSONArray array)
	{
		try
		{
			FileWriter file = new FileWriter("upbit.json");

			file.write(array.toJSONString());
			file.flush();
			file.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public static JSONArray load()
	{
		JSONParser jsonParser = new JSONParser();
		JSONArray jsonArray = new JSONArray();
		
		try
		{
			
			FileReader file = new FileReader("upbit.json");
			
			jsonArray = (JSONArray) jsonParser.parse(file);
		}
		catch (IOException | ParseException e)
		{
			e.printStackTrace();
		}
		
		return jsonArray;
	}
	
//	public static Coin assign(JSONArray array)
//	{
//		JSONObject obj = (JSONObject) array.get(0);
//		
//		Coin coin = new Coin(
//				(String) obj.get("code"), 
//				(String) obj.get("candleDateTime"), 
//				(String) obj.get("candleDateTimeKst"), 
//				(double) obj.get("openingPrice"), 
//				(double) obj.get("highPrice"), 
//				(double) obj.get("lowPrice"), 
//				(double) obj.get("tradePrice"), 
//				(double) obj.get("candleAccTradeVolume"), 
//				(double) obj.get("candleAccTradePrice"), 
//				(long) obj.get("timestamp"), 
//				(double) obj.get("prevClosingPrice"), 
//				(String) obj.get("change"), 
//				(double) obj.get("changePrice"), 
//				(double) obj.get("changeRate"), 
//				(double) obj.get("signedChangePrice"), 
//				(double) obj.get("signedChangeRate"));
//		
//		return coin;
//	}
	
	public static CryptoCurrency assign(JSONArray jsonArray)
	{
		JSONObject jsonObject = (JSONObject) jsonArray.get(0);
		
		CryptoCurrency coin = new CryptoCurrency(jsonObject);
		
		return coin;
	}
	
	public static String getData(JSONObject jsonObject, JsonKey jsonKey)
	{
		try
		{
			return jsonObject.get(jsonKey.toString()).toString();
		}
		catch (Exception e)
		{
			System.out.println("ERROR JsonManager.getData(): " + jsonKey.toString());
			return "error";
		}	
	}
}
