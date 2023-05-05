package may5th;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindows {

	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
	}
	
	
	@Test
	public void windowsHandleTest() throws InterruptedException
	{
		
		
		String homeWindowID=driver.getWindowHandle();
		
		
		driver.findElement(By.xpath("//img[contains(@src,'google-play')]")).click();
		
		Thread.sleep(3000);
		
		Set<String> windowIds=driver.getWindowHandles();
		
		Iterator<String> it=windowIds.iterator();
		
		while(it.hasNext())
		{
			String currentWindow=it.next();
			
			//to switch to some window
			
			driver.switchTo().window(currentWindow);
			
			if(driver.getTitle().equals("Adactin Hotel App - Apps on Google Play"))
			{
				break;
			}
			
		}
		
		
		
		driver.findElement(By.xpath("//span[text()='Games']/parent::span/parent::button")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().window(homeWindowID);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//img[contains(@src,'ios-button')]")).click();
		
		windowIds=driver.getWindowHandles();
		
		it=windowIds.iterator();
		
		while(it.hasNext())
		{
			String currentWindow=it.next();
			
			//to switch to some window
			
			driver.switchTo().window(currentWindow);
			
			if(driver.getTitle().equals("TestFlight - Apple"))
			{
				break;
			}
			
		}
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='Terms of Service']")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().window(homeWindowID);
		
		windowIds=driver.getWindowHandles();
		
		it=windowIds.iterator();
		
		while(it.hasNext())
		{
			String currentWindow=it.next();
			
			//to switch to some window
			
			driver.switchTo().window(currentWindow);
			
			if(driver.getTitle().equals("Legal - Apple Media Services - Apple"))
			{
				break;
			}
			
		}
		
		driver.findElement(By.xpath("//a[text()='Choose your country/region']")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().window(homeWindowID);
		
	}
	
	
	@AfterMethod
	public void teardown() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}
	
}
