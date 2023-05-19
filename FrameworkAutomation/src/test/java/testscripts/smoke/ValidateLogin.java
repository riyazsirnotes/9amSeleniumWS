package testscripts.smoke;

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
