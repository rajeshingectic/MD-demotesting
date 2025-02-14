package com.mystore.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mystore.pageobject.Settingspage;
import com.mystore.pageobject.loginPage;

public class TC_SettingsPage extends BaseClass {

	@Test(priority=1)
	public void verify_Specific_User_is_displayed_in_Settings_Invite_User() throws IOException {
		
		
		loginPage loginpg = new loginPage(driver);
		
		System.out.println("launch");
		loginpg.typeEmailId
		("rajesh.harinadha@awanoo.com");
		logger.info("Entered emailID success");
		
		loginpg.typePassword("Test@123");
		logger.info("Entered password success");
		
		loginpg.clickSignIn();
		logger.info("Tapping on login button success");
		
		
		String userName = loginpg.getUserName();
		Assert.assertEquals("Rajesh J H", userName);
		
		Settingspage setpg = new Settingspage(driver);
		setpg.SettingspageLink();
		logger.info("Tapping on Settings page link success");
		
		setpg.SearchField("Rajesh");
		
		String userName1 = setpg.getUserName();
		Assert.assertEquals("Rajesh J H", userName1);
		logger.info("Specific User is displyed in settings invite user page success");
		
		
		logger.info("***************TestCase Verify specific User is displyed in settings invite user page ends*****************");
		}
		
	@Test(priority=2)
	public void verify_App_Configuration_id_in_Settings_page() throws IOException {
		
		Settingspage setpg = new Settingspage(driver);
		
		setpg.AppConfigurationLimk();
		logger.info("Tapping on app configuration tab success");
		
		String appconfigId = setpg.getappconfigID();
		
		if(appconfigId.equals("appcfg10100"))
		{
			logger.info("Verify App config ID  - Passed");
			Assert.assertTrue(true);
		}
		else
		{
			logger.info("Verify App config ID - Failed");
			captureScreenShot(driver,"VerifyAppconfigID");
			Assert.assertTrue(false);

		}
		
		logger.info("***************TestCase Verify App config id in app configuration page ends*****************");
		
		
	}
		

	}

