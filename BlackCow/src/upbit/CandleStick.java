package upbit;

public class CandleStick
{
	public void drawCandleStick(double openingPrice, double highPrice, double lowPrice, double tradePrice, double posX, double posY)
	{
		if (highPrice > tradePrice)
		{
			// Draw Line
		}
		
		if (openingPrice > tradePrice)
		{
			// Draw BlueCandle
		}
		else if (openingPrice == tradePrice)
		{
			// Draw HorizonLine
		}
		else if (openingPrice < tradePrice)
		{
			// Draw RedCandle
		}
		
		
	}
}
