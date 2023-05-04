package may4th;

import org.testng.annotations.Test;

import graphql.Assert;

public class AdactinRegression {
	
	@Test(priority=2)
	public void loginTest()
	{
		System.out.println("Start Browser ...");
		System.out.println("Launch App ...");
		Assert.assertTrue(false);
		System.out.println("Validate Login functionality ...");
		System.out.println("Close Browser ...");
		
	}
	
	@Test(priority=1)
	public void registrationTest()
	{
		System.out.println("Start Browser ...");
		System.out.println("Launch App ...");
		System.out.println("Validate Registration functionality ...");
		System.out.println("Close Browser ...");
	}
	
	@Test(priority=3)
	public void forgotPasswordTest()
	{
		System.out.println("Start Browser ...");
		System.out.println("Launch App ...");
		System.out.println("Validate Forgot Password functionality ...");
		System.out.println("Close Browser ...");
	}
	
	@Test(priority=4,dependsOnMethods="loginTest")
	public void changePasswordTest()
	{
		System.out.println("Start Browser ...");
		System.out.println("Launch App ...");
		System.out.println("Validate Change Password functionality ...");
		System.out.println("Close Browser ...");
	}

	
	
}
