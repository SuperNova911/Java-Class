package upbit;

import org.json.simple.JSONObject;

import upbit.JsonManager.JsonKey;

public class CryptoCurrency
{	
	private JSONObject jsonObject;
	
	public CryptoCurrency(JSONObject jsonObject)
	{
		this.setJsonObject(jsonObject);
	}

	public JSONObject getJsonObject()
	{
		return jsonObject;
	}

	public void setJsonObject(JSONObject jsonObject)
	{
		this.jsonObject = jsonObject;
	}
	
	public String getData(JsonKey jsonKey)
	{
		return JsonManager.getData(this.jsonObject, jsonKey);
	}
	
	// �׽�Ʈ�� �Լ�
	public CoinSymbol getCoinSymbol()
	{
		return CoinSymbol.BTC;
	}
}
