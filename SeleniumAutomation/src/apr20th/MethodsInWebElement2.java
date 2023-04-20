package apr20th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MethodsInWebElement2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		
		String text=driver.findElement(By.className("build_title")).getText();
		
		System.out.println(text);
		
		System.out.println(driver.findElement(By.className("build_title")).getCssValue("font-weight"));
		
		System.out.println(driver.findElement(By.className("build_title")).getCssValue("color"));
		
		Thread.sleep(3000);
		
		System.out.println(driver.findElement(By.linkText("Forgot Password?")).getAttribute("href"));
		
		System.out.println(driver.findElement(By.linkText("Forgot Password?")).getAttribute("id"));
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
