package upbit;

import java.io.File;

import org.jsoup.Connection.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicCrawler
{
	private WebDriver driver;
	private boolean headless = false;
	private String baseXPath = "//*[@id=\"root\"]/div/div/div[3]/section[1]/div/div[1]/article/span[2]/div/div/div[1]/table/tbody";

	public enum OrderData
	{
		price, quantity, percentage
	}
	
	public static void main(String[] args)
	{
		DynamicCrawler crawler = new DynamicCrawler();

		crawler.test(crawler);


		crawler.getDriver().close();
		crawler.getDriver().quit();
	}
	
	public DynamicCrawler()
	{
		launchBrowser();
	}
	
	public void test(DynamicCrawler crawler)
	{
		String url = crawler.createURL(Market.KRW, CoinSymbol.BTC);
		crawler.moveTo(url);
		
		crawler.waitUntilLoad(30, "//*[@id=\"root\"]/div/div/div[3]/section[1]/div/div[1]/article/span[2]/div/div/div[1]/table/tbody/tr[18]/td[1]/a/div[1]/strong");

		WebElement element = crawler.fappa();
		
		
		for (int i = 1; i <= 20; i++)
		{
			String priceXPath = crawler.createXpath(i, OrderData.price, false);
			String percentageXPath = crawler.createXpath(i, OrderData.percentage, false);
			String quantityXPath = crawler.createXpath(i, OrderData.quantity, false);
			
			System.out.println(priceXPath);

			String price = "";
			String percentage = "";
			String quantity = "";

			try
			{
				price = crawler.findElementByXPath(element, priceXPath).getText();
				percentage = crawler.findElementByXPath(element, percentageXPath).getText();
				quantity = crawler.findElementByXPath(element, quantityXPath).getText();
			}
			catch (Exception e)
			{
				priceXPath = crawler.createXpath(i, OrderData.price, true);
				percentageXPath = crawler.createXpath(i, OrderData.percentage, true);
				quantityXPath = crawler.createXpath(i, OrderData.quantity, true);

				price = crawler.findElementByXPath(element, priceXPath).getText();
				percentage = crawler.findElementByXPath(element, percentageXPath).getText();
				quantity = crawler.findElementByXPath(element, quantityXPath).getText();
			}

			System.out.println("Element " + i + ": \t" + price + "\t" + percentage + "\t" + quantity);
		} 
	}
		
	public boolean launchBrowser()
	{
		try
		{
			File file = new File("chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
			
			ChromeOptions options = new ChromeOptions();
			options.setHeadless(headless);
			options.addArguments("disable-gpu");
			
			driver = new ChromeDriver(options);
			
			return true;
		}
		catch (Exception e)
		{
			System.out.println("Failed to launchBrower");
			return false;
		}
	}
	
	public String createURL(Market market, CoinSymbol coinSymbol)
	{
		String url = "https://www.upbit.com/exchange?code=CRIX.UPBIT.";
		
		url += market + "-" + coinSymbol;
		
		return url;
	}
	
	public String createXpath(int n, OrderData orderData, boolean selected)
	{
		if (!(1 <= n && n <= 20))
		{
			System.out.println("Wrong input: " + n + ", " + orderData);
			n = 1;
		}
		
		String xpath = baseXPath + "/tr";
		xpath += "[" + n + "]";
		
		int kappa;
		if (n <= 10)
			kappa = 3;
		else
			kappa = selected ? 2 : 1;
		
		int fappa = selected ? 3 : 2;
		
		switch (orderData)
		{
		case price:
			xpath += "/td[" + kappa + "]/a/div[1]/strong";
			break;
			
		case quantity:
			xpath += "/td[" + fappa + "]/a/p";
			break;
				
		case percentage:
			xpath += "/td[" + kappa + "]/a/div[2]";
			break;
		}
		
		return xpath;
	}
	
	public void moveTo(String url)
	{
		driver.get(url);
	}
	
	public WebElement fappa()
	{
		return driver.findElement(ByXPath.xpath(baseXPath));
	}
//	
//	public void kappa(Market market, CoinSymbol coinSymbol)
//	{		
//		String targetUrl = createURL(market, coinSymbol);
//		
//		if (targetUrl != driver.getCurrentUrl())
//		{
//			System.out.println("moveTo: " + targetUrl);
//			moveTo(targetUrl);
//		}
//
//		System.out.println("Wait for load elements");
//		waitUntilLoad(30, createXpath(1)[0]);
//		System.out.println("Elements load complete");
//		
//		String[] xpath = new String[2];
//		
//		for (int i = 1; i <= 20; i++)
//		{
//			xpath = createXpath(i);
//
//			System.out.println("data1: " + findElementByXPath(xpath[0]).getText());
//			System.out.println("data2: " + findElementByXPath(xpath[1]).getText());
//		}
//	}
	
	public boolean waitUntilLoad(int sec, String xpath)
	{
		try
		{
			new WebDriverWait(driver, sec).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
			return true;
		}
		catch (Exception e)
		{
			System.out.println("Failed to waitUntilLoad, xpath: " +xpath);
			return false;
		}
	}
	
	public WebElement findElementByXPath(WebElement element, String xpath)
	{
		return element.findElement(ByXPath.xpath(xpath));
	}
	
	public WebDriver getDriver()
	{
		return driver;
	}
	
	public String getBaseXPath()
	{
		return baseXPath;
	}
}
