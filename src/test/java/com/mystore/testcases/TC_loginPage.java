package com.mystore.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mystore.pageobject.loginPage;
import com.mystore.utilities.Config;

public class TC_loginPage extends BaseClass {
Config config = new Config();
	
	String url = config.emailid();
	
	@Test
	public void verify_login() throws IOException {
		
		
		loginPage loginpg = new loginPage(driver);
		
		System.out.println("launch");
		loginpg.typeEmailId
		("rajesh.harinadha@awanoo.com");
		logger.info("Entered emailID success");
		
		loginpg.typePassword("Test@123");
		logger.info("Entered password success");
		
		loginpg.clickSignIn();
		logger.info("Tapping on login button success");
		
		
		//registeredUserAccount regUser = new registeredUserAccount(driver);
		String userName = loginpg.getUserName();
		Assert.assertEquals("Rajesh J H", userName);


		if(userName.equals("Rajesh J H"))
		{
			logger.info("VerifyLogin - Passed");
			Assert.assertTrue(true);
		}
		else
		{
			logger.info("VerifyLogin - Failed");
			captureScreenShot(driver,"VerifyLogin");
			Assert.assertTrue(false);

		}
		
		loginpg.dropDownIcon();
		loginpg.clickOnSignOut();
		
		logger.info("***************TestCase Verify Login ends*****************"); 

	}
	
	@Test
	public void verify_logout() throws  IOException {
		
		
		loginPage loginpg = new loginPage(driver);
		
		System.out.println("launch");
		loginpg.typeEmailId
		("rajesh.harinadha@awanoo.com");
		logger.info("Entered emailID success");
		
		loginpg.typePassword("Test@123");
		logger.info("Entered password success");
		
		loginpg.clickSignIn();
		logger.info("Tapping on login button success");
		
		
		//registeredUserAccount regUser = new registeredUserAccount(driver);
		String userName = loginpg.getUserName();
		Assert.assertEquals("Rajesh J H", userName);
		loginpg.dropDownIcon();
		loginpg.clickOnSignOut();


		if(loginpg.getPageTitle().equals("Merchant Cloud"))
		{
			logger.info("VerifySignOut - Passed");
			Assert.assertTrue(true);
		}

		else
		{
			logger.info("VerifySignOut - Failed");
			captureScreenShot(driver,"VerifySignOut");
			Assert.assertTrue(false);
		}
		logger.info("***************TestCase Verify Log out ends*****************"); 


	}
	
}
