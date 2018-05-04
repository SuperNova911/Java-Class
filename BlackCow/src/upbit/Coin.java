package upbit;

public class Coin
{
	private String code;
	private String candleDateTime;
	private String candleDateTimeKst;
	private double openingPrice;
	private double highPrice;
	private double lowPrice;
	private double tradePrice;
	private double candleAccTradeVolume;
	private double candleAccTradePrice;
	private long timestamp;
	private double prevClosingPrice;
	private String change;
	private double changePrice;
	private double changeRate;
	private double signedChangePrice;
	private double signedChangeRate;
	
	
	public Coin(String code,
			String candleDateTime,
			String candleDateTimeKst,
			double openingPrice,
			double highPrice,
			double lowPrice,
			double tradePrice,
			double candleAccTradeVolume,
			double candleAccTradePrice,
			long timestamp)
	{
		this.code = code;
		this.candleDateTime = candleDateTime;
		this.candleDateTimeKst = candleDateTimeKst;
		this.openingPrice = openingPrice;
		this.highPrice = highPrice;
		this.lowPrice = lowPrice;
		this.tradePrice = tradePrice;
		this.candleAccTradeVolume = candleAccTradeVolume;
		this.candleAccTradePrice = candleAccTradePrice;
		this.timestamp = timestamp;
	}
	
	public Coin(String code,
			String candleDateTime,
			String candleDateTimeKst,
			double openingPrice,
			double highPrice,
			double lowPrice,
			double tradePrice,
			double candleAccTradeVolume,
			double candleAccTradePrice,
			long timestamp,
			double prevClosingPrice,
			String change,
			double changePrice,
			double changeRate,
			double signedChangePrice,
			double signedChangeRate)
	{
		this.code = code;
		this.candleDateTime = candleDateTime;
		this.candleDateTimeKst = candleDateTimeKst;
		this.openingPrice = openingPrice;
		this.highPrice = highPrice;
		this.lowPrice = lowPrice;
		this.tradePrice = tradePrice;
		this.candleAccTradeVolume = candleAccTradeVolume;
		this.candleAccTradePrice = candleAccTradePrice;
		this.timestamp = timestamp;
		this.prevClosingPrice = prevClosingPrice;
		this.change = change;
		this.changeRate = changeRate;
		this.signedChangePrice = signedChangePrice;
		this.signedChangeRate = signedChangeRate;
	}

	public void print()
	{
		System.out.println("code: " + code);
		System.out.println("candleDateTime: " + candleDateTime);
		System.out.println("candleDateTimeKst: " + candleDateTimeKst);
		System.out.println("openingPrice: " + openingPrice);
		System.out.println("highPrice: " + highPrice);
		System.out.println("lowPrice: " + lowPrice);
		System.out.println("tradePrice: " + tradePrice);
		System.out.println("candleAccTradeVolume: " + candleAccTradeVolume);
		System.out.println("candleAccTradePrice: " + candleAccTradePrice);
		System.out.println("timestamp: " + timestamp);
		System.out.println("prevClosingPrice: " + prevClosingPrice);
		System.out.println("change: " + change);
		System.out.println("changePrice: " + changePrice);
		System.out.println("changeRate: " + changeRate);
		System.out.println("signedChangePrice: " + signedChangePrice);
		System.out.println("signedChangeRate: " + signedChangeRate);
	}
}
