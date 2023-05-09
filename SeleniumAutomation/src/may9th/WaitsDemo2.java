package may9th;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitsDemo2 {
	
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		//implicit Wait
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	
	@Test
	public void waitsTest() throws InterruptedException
	{
		
		//Explicit Wait
		
		WebDriverWait myWait=new WebDriverWait(driver, 30);
		
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@data-gtm-bnr-imgname,'NikeSkechers-Upto40') and @href]")));
		
		driver.findElement(By.xpath("//a[contains(@data-gtm-bnr-imgname,'NikeSkechers-Upto40') and @href]")).click();
		
		
	}
	
	
	@AfterMethod
	public void teardown() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}


}
