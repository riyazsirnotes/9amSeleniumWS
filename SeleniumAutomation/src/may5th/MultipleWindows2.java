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

public class MultipleWindows2 {

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
		
		switchToWindow("Adactin Hotel App - Apps on Google Play");
		
		
		driver.findElement(By.xpath("//span[text()='Games']/parent::span/parent::button")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().window(homeWindowID);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//img[contains(@src,'ios-button')]")).click();
		
		switchToWindow("TestFlight - Apple");
				
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='Terms of Service']")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().window(homeWindowID);
		
		switchToWindow("Legal - Apple Media Services - Apple");
		
		driver.findElement(By.xpath("//a[text()='Choose your country/region']")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().window(homeWindowID);
		
	}
	
	
	private void switchToWindow(String title) {
		
		Set<String> windowIds=driver.getWindowHandles();
		
		Iterator<String> it=windowIds.iterator();
		
		while(it.hasNext())
		{
			String currentWindow=it.next();
			
			//to switch to some window
			
			driver.switchTo().window(currentWindow);
			
			if(driver.getTitle().equals(title))
			{
				break;
			}
			
		}
	}


	@AfterMethod
	public void teardown() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}
	
}
