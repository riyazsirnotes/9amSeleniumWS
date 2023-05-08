package may8th;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AltertsDemo1 {
	
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		
	}
	
	
	@Test
	public void alertTest() throws InterruptedException
	{
		
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		
		Thread.sleep(3000);
		
		//alert instance creation 
		
		Alert alert=driver.switchTo().alert();
		
		//to validate text on alert
		//Expected text : Please enter a valid user name
		
		Assert.assertEquals(alert.getText(), "Please enter a valid user name");
		
		//to click Ok button alert
		
		alert.accept();
		
		
		
	}
	
	
	@AfterMethod
	public void teardown() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}
	

}
