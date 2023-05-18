package testscripts.regression;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import utils.UtilKit;

public class ValidateRegistration extends BaseTest {
	
	@Test(dataProvider="getData")
	public void validateRegistrationTest(HashMap<String,String> hMap)
	{
		
		/*
		 * System.out.println("Size of HashMap "+hMap.size());
		 * 
		 * Set<Entry<String, String>> entries=hMap.entrySet();
		 * 
		 * for(Entry<String, String> entry:entries) {
		 * System.out.println(entry.getKey()+"----"+entry.getValue()); }
		 */
		
		driver.findElement(By.xpath("//a[text()='New User Register Here']")).click();
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(hMap.get("Username"));
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(hMap.get("Password"));
		
		driver.findElement(By.xpath("//input[@name='re_password']")).sendKeys(hMap.get("Confirm Password"));
		
		driver.findElement(By.xpath("//input[@name='full_name']")).sendKeys(hMap.get("Full Name"));
		
		driver.findElement(By.xpath("//input[@name='email_add']")).sendKeys(hMap.get("Email Address"));
		
		driver.findElement(By.xpath("//input[@name='captcha']")).sendKeys(hMap.get("Captcha Text"));
		
		
	}

	//
	@DataProvider
	public Object[][] getData()
	{
		
		Object[][] data=new Object[1][1];
		
		data[0][0]=UtilKit.getTestData("TC-101");
		
		return data;
		
		
		
	}
	
}
