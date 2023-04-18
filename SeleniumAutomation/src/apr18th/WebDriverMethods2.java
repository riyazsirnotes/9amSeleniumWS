package apr18th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverMethods2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		//driver.findElement(By.xpath("//img[contains(@src,'google-play')]")).click();
		
		Thread.sleep(5000);
		
		//driver.close();
		
		//quit() : void
		
		driver.quit();

	}

}
