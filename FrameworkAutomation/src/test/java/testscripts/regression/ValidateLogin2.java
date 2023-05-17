package testscripts.regression;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class ValidateLogin2 extends BaseTest {
	
	@Test
	public void validateLoginTest1()
	{
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("reyaz0617");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("reyaz123");
		
		driver.findElement(By.xpath("//input[@name='login']")).click();
		
		Assert.assertEquals(driver.getTitle(), "Adactin.com - Search Hotel");
		
				
	}
	
	@Test
	public void validateLoginTest2()
	{
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("reyaz0617");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("reyaz456");
		
		driver.findElement(By.xpath("//input[@name='login']")).click();
		
		Assert.assertEquals(driver.getTitle(), "Adactin.com - Hotel Reservation System");
		
				
	}
	
	@Test
	public void validateLoginTest3()
	{
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("reyaz1310");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("reyaz123");
		
		driver.findElement(By.xpath("//input[@name='login']")).click();
		
		Assert.assertEquals(driver.getTitle(), "Adactin.com - Hotel Reservation System");
		
				
	}
	
	@Test
	public void validateLoginTest4()
	{
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("reyaz1310");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("reyaz456");
		
		driver.findElement(By.xpath("//input[@name='login']")).click();
		
		Assert.assertEquals(driver.getTitle(), "Adactin.com - Hotel Reservation System");
		
				
	}



}
