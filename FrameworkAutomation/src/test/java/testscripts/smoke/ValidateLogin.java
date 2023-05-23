package testscripts.smoke;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import keywords.ApplicationKeywords;

public class ValidateLogin extends BaseTest {
	
	@Test
	public void validateLoginTest()
	{
		
		ApplicationKeywords app=new ApplicationKeywords();
		
		app.openBrowser();
		
		app.type("usernameTextBox_xpath", "reyaz0617");
		
		app.type("passwordTextBox_xpath", "reyaz123");
		
		app.click("loginButon_xpath");
		
		app.validateTitle("Adactin.com - Search Hotel");
		
		
	}
	
	
	
	

}
