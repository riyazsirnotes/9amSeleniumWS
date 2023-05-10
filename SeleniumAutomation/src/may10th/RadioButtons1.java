package may10th;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtons1 {
	
	
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		//implicit Wait
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	
	@Test
	public void radioButtonTest() throws InterruptedException
	{
		
			WebElement milk= driver.findElement(By.xpath("//input[@value='Milk']"));
			WebElement butter= driver.findElement(By.xpath("//input[@value='Butter']"));
			WebElement cheese= driver.findElement(By.xpath("//input[@value='Cheese']"));
			
			Assert.assertEquals(milk.isSelected(), false);
			Assert.assertEquals(butter.isSelected(), true);
			Assert.assertEquals(cheese.isSelected(), false);
	}
	
	
	@AfterMethod
	public void teardown() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}


}
