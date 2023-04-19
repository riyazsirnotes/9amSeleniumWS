package apr19th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverMethods3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		System.out.println(driver.getWindowHandle());
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//img[contains(@src,'google-play')]")).click();
		
		System.out.println(driver.getWindowHandles());
		
		Thread.sleep(5000);
		
		driver.quit();
		
		

	}

}
