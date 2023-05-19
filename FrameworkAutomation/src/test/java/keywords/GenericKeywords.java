package keywords;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GenericKeywords extends BaseTest {

	/*
	 * clear(String)
click(String)
clickEnterButton(String)
getElement(String)
getLocator(String)
getText(String)
getTitle()
isElementPresent(String)
isElementVisible(String)
log(String)
navigate(String)
openBrowser(String)
quit()
selectByVisibleText(String, String)
takeScreenShot()
type(String, String)
wait(int)
waitForPageToLoad()
	 */

	public void openBrowser()
	{
		String browserName=configProp.getProperty("browser");

		if(browserName.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();

			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();

			driver=new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();

			driver=new EdgeDriver();
		}

		driver.get(configProp.getProperty("url"));

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Long.parseLong(configProp.getProperty("implicitWaitTime")), TimeUnit.SECONDS);

	}
	
	
	public WebElement getElement(String  locatorKey)
	{
		WebElement element=null;
		
		element=driver.findElement(getLocator(locatorKey));
		
		return element;
	}
	
	
	public void type(String locatorKey,String text)
	{
		getElement(locatorKey).sendKeys(text);
	}
	
	public void click(String locatorKey)
	{
		getElement(locatorKey).click();
	}
	
	public By getLocator(String locatorKey)
	{
		By  by=null;
		
		if(locatorKey.endsWith("id"))
		{
			by=By.id(locatorsProp.getProperty(locatorKey));
		}
		else if(locatorKey.endsWith("name"))
		{
			by=By.name(locatorsProp.getProperty(locatorKey));
		}
		else if(locatorKey.endsWith("linktext"))
		{
			by=By.linkText(locatorsProp.getProperty(locatorKey));
		}	
		else if(locatorKey.endsWith("xpath"))
		{
			by=By.xpath(locatorsProp.getProperty(locatorKey));
		}
		return by;
		
	}
	

}
