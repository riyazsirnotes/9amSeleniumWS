package may5th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandle {
	
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.angelfire.com/super/badwebs/");
		driver.manage().window().maximize();
		
	}
	
	
	@Test
	public void frameHandleTest() throws InterruptedException
	{
		//driver.switchTo().frame(1);
		//driver.switchTo().frame("contents");
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='left.htm']")));
		driver.findElement(By.xpath("//font[contains(text(),'Hate Frames Page')]/parent::a")).click();
	}
	
	
	@AfterMethod
	public void teardown() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}
	
	
	


}
