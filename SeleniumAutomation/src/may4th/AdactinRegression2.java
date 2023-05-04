package may4th;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import graphql.Assert;

public class AdactinRegression2 {
	
	@AfterMethod
	public void teardown()
	{
		System.out.println("Close Browser ...");
	}
	
	@BeforeMethod
	public void setup()
	{
		System.out.println("Start Browser ...");
		System.out.println("Launch App ...");
	}
	@Test(priority=2)
	public void loginTest()
	{
		Assert.assertTrue(false);
		System.out.println("Validate Login functionality ...");
		
		
	}
	
	@Test(priority=1)
	public void registrationTest()
	{
		
		System.out.println("Validate Registration functionality ...");
		
	}
	
	@Test(priority=3)
	public void forgotPasswordTest()
	{
		
		System.out.println("Validate Forgot Password functionality ...");
		
	}
	
	@Test(priority=4,dependsOnMethods="loginTest")
	public void changePasswordTest()
	{
		
		System.out.println("Validate Change Password functionality ...");
		
	}

	
	
}
