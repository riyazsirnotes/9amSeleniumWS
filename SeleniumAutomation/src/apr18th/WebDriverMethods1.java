package apr18th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverMethods1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		// get():void

		driver.get("https://adactinhotelapp.com/");

		// getTitle():String

		System.out.println(driver.getTitle());

		// getCurrentUrl() : String

		System.out.println(driver.getCurrentUrl());
		
		// getPageSource() : String
		
		System.out.println(driver.getPageSource());

		driver.findElement(By.linkText("New User Register Here")).click();

		// getTitle():String

		System.out.println(driver.getTitle());

		// getCurrentUrl() : String

		System.out.println(driver.getCurrentUrl());

		Thread.sleep(5000);

		// close

		driver.close();

	}

}
