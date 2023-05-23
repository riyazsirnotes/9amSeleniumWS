package testscripts.smoke;

import org.testng.annotations.Test;

import base.BaseTest;
import keywords.ApplicationKeywords;

public class ValidateSearchHotel extends BaseTest {
	
	@Test
	public void validateSearchHotelTest() throws InterruptedException
	{
		
		ApplicationKeywords app=new ApplicationKeywords();
		
		app.openBrowser();
		
		app.type("usernameTextBox_xpath", "reyaz0617");
		
		app.type("passwordTextBox_xpath", "reyaz123");
		
		app.click("loginButon_xpath");
		
		app.validateTitle("Adactin.com - Search Hotel");
				
		app.selectOptionFromDropdown("locationDropdown_xpath", "New York");
		
		app.selectOptionFromDropdown("hotelsDropdown_xpath", "Hotel Sunshine");
		
		app.selectOptionFromDropdown("roomTypeDropdown_xpath", "Standard");
		
		app.selectOptionFromDropdown("roomNosDropdown_xpath", "1 - One");
		
		app.type("checkInDateTextbox_xpath", "23/05/2023");
		
		app.type("checkOutDateTextbox_xpath", "24/05/2023");
		
		app.selectOptionFromDropdown("adultsPerRoomDropdown_xpath", "2 - Two");
		
		Thread.sleep(3000);
		
		
	}

}
