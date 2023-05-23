package testscripts.smoke;

import org.testng.annotations.Test;

import base.BaseTest;
import keywords.ApplicationKeywords;

public class ValidateRegister extends BaseTest {

	@Test
	public void validateRegisterTest()
	{
		ApplicationKeywords app=new ApplicationKeywords();
		
		app.click("register_linktext");
		
		
	}
	
}
