package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.linkText("Create new account")).click();
		
		Thread.sleep(5000);
		
		
		new Select(driver.findElement(By.name("birthday_day"))).selectByIndex(1);
		
		Thread.sleep(3000);
		
		new Select(driver.findElement(By.name("birthday_month"))).selectByVisibleText("Oct");
		
		Thread.sleep(3000);
		
		new Select(driver.findElement(By.name("birthday_year"))).selectByIndex(23);
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
	}

}
