package may3rd;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinksTesting6 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement block=driver.findElement(By.xpath("//div[text()='Make Money with Us']/parent::div"));
		
		List<WebElement>  allLinks=block.findElements(By.tagName("a"));
		
		System.out.println("No of Links "+allLinks.size());
		
		for(int i=0;i<allLinks.size();i++)
		{
			System.out.println(allLinks.get(i).getText());
		   System.out.println(allLinks.get(i).getAttribute("href"));
		   allLinks.get(i).click();
		   Thread.sleep(3000);
		   
		   System.out.println(driver.getTitle());
		   
		   System.out.println(driver.getCurrentUrl());
		   
		   System.out.println("******************************");
		   //navigating back to home page
		   
		   driver.navigate().back();
		   
		   Thread.sleep(3000);
		   
		   block=driver.findElement(By.xpath("//div[text()='Make Money with Us']/parent::div"));
			
		   allLinks=block.findElements(By.tagName("a"));
			
		   
		}
		
		
		driver.quit();

	}

}
