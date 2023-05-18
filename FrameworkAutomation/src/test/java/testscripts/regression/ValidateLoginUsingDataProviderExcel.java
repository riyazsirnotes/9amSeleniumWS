package testscripts.regression;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;

public class ValidateLoginUsingDataProviderExcel extends BaseTest {
	
	@Test(dataProvider="getData")
	public void validateLoginTest(String username,String password,String expectedTitle)
	{
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		
		driver.findElement(By.xpath("//input[@name='login']")).click();
		
		Assert.assertEquals(driver.getTitle(), expectedTitle);
		
				
	}
	
	@DataProvider
	public Object[][] getData() throws IOException
	{
		
		FileInputStream fis=new FileInputStream("src\\test\\resources\\testdata\\excels\\Adactin Test Data.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet ws=wb.getSheet("credentials");
		
		int noOfRows=ws.getLastRowNum();
		
		int noOfCells=ws.getRow(0).getLastCellNum();
		
		Object[][] data=new Object[noOfRows][noOfCells];
		
		for(int i=0;i<noOfRows;i++)
		{
			
			for(int j=0;j<noOfCells;j++)
			{
				
				data[i][j]=ws.getRow(i+1).getCell(j).getStringCellValue();
			}
			
		}
		
		
		
		
		return data;
		
	}
	
	
	
	
	
	

}
