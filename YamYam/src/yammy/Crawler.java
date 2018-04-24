package yammy;

import java.io.IOException;
import java.sql.Time;
import java.util.Calendar;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Crawler
{
	private String url;
	private String originData;
	private String baseURL = "http://likehome.jbnu.ac.kr/board/bbs/board.php?dk_table=cbnu2_7_1_k";

	private int year;
	private int month;
	private int day;
	
	Calendar cal = Calendar.getInstance();
	
	public void getData() 
	{
		try
		{
			Document doc = Jsoup.connect(url).get();
			Elements elem = doc.select(".tbline1");
			originData = elem.text();
		} catch (Exception e)
		{
			e.getMessage();
		}
	}
	
	public void setURL()
	{						
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH) + 1;
		day = cal.get(Calendar.DAY_OF_MONTH);
		
		url = baseURL + "&mode=w" + "&year=" + year + "&month=" + month + "&day=" + day;
	}
	
	public void setURL(int year, int month, int day)
	{
		this.year = year;
		this.month = month;
		this.day = day;
		url = baseURL + "&mode=w" + "&year=" + year + "&month=" + month + "&day=" + day;
	}

	public String getURL()
	{
		return url;
	}
	
	public String getOriginData()
	{
		return originData;
	}
	
	public int getYear()
	{
		return year;
	}
	public int getMonth()
	{
		return month;
	}
	public int getDay()
	{
		return day;
	}
}
