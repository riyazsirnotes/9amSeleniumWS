package may15th;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidateLogin {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() throws IOException
	{
		
		FileInputStream fis= new FileInputStream("Properties\\config.properties");
		
		Properties pr=new Properties();
		
		pr.load(fis);
		
		
		String browserName=pr.getProperty("browser");
		
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
		
		driver.get(pr.getProperty("url"));
		
		driver.manage().window().maximize();
		
		
		
		driver.manage().timeouts().implicitlyWait(Long.parseLong(pr.getProperty("implicitWait")), TimeUnit.SECONDS);
		
	}
	
	@Test
	public void validateLoginTest()
	{
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("reyaz0617");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("reyaz123");
		driver.findElement(By.xpath("//input[@name='login']")).click();
		
		Assert.assertEquals(driver.getTitle(), "Adactin.com - Search Hotel");
	}

	@AfterMethod
	public void teardown() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}
}
