package apr21st;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownTesting2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		//Select class
		
		Select s1=new Select(driver.findElement(By.id("searchDropdownBox")));
		
		//selectByIndex(int)
		
		//s1.selectByIndex(10);
		
		//selectByValue(String)
		
		//s1.selectByValue("search-alias=computers");
		
		//selectByVisibleText(String)
		
		s1.selectByVisibleText("Garden & Outdoors");
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}
