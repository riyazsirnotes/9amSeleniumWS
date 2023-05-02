package may2nd;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinksTesting3 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		//to collect all links in page
		// use findElements 
		//locator : tagname = a
		
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		
		System.out.println("No of Links : "+allLinks.size());
		
		driver.quit();
		

	}

}
