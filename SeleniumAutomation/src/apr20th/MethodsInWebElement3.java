package apr20th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MethodsInWebElement3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		
		System.out.println(driver.findElement(By.id("username")).getLocation().getX());
		
		System.out.println(driver.findElement(By.id("username")).getLocation().getY());
		
		System.out.println(driver.findElement(By.id("username")).getSize().getHeight());
		
		System.out.println(driver.findElement(By.id("username")).getSize().getWidth());
		
		System.out.println(driver.findElement(By.id("username")).getRect().getX()+" "+driver.findElement(By.id("username")).getRect().getY());
		
		//System.out.println(driver.findElement(By.id("username")).getRect().getY());
		
		System.out.println(driver.findElement(By.id("username")).getRect().getHeight());
		
		System.out.println(driver.findElement(By.id("username")).getRect().getWidth());
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
