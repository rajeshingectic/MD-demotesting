package com.mystore.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mystore.pageobject.dashboardPage;
import com.mystore.pageobject.loginPage;

public class TC_UserAccess_Validation extends BaseClass {
	@Test(priority = 1 )
	public void Verify_AdminAccess ()  throws IOException, InterruptedException {
		loginPage loginpg = new loginPage(driver);
		
		System.out.println("launch");
		loginpg.typeEmailId
		("rajesh.harinadha@awanoo.com");
		logger.info("Entered emailID success");
		
		
		loginpg.typePassword("Test@123");
		logger.info("Entered password success");
		
		loginpg.clickSignIn();
		logger.info("Tapping on login button success");
		
		Thread.sleep(30);
		String userName = loginpg.getUserName();
		Assert.assertEquals("Rajesh J H", userName);
		
		dashboardPage dbpage = new dashboardPage(driver);
		
		boolean merchantCloud = dbpage.merchantCloudSection();
		Assert.assertTrue(merchantCloud, "Admin user Doesn't have access to merchant cloud section  - Failed");
		logger.info("Admin user has access to merchant cloud section");
	
		boolean managerAccess = dbpage.managerAccessSection();
		Assert.assertTrue(managerAccess, "Admin user Doesn't have access to manager access section  - Failed");
		logger.info("Admin user has access to manager access section");
		
		boolean adminAccess = dbpage.adminAccessSection();
		Assert.assertTrue(adminAccess, "Admin user Doesn't have access to admin access section  - Failed");
		logger.info("Admin user has access to admin access section");
		
		
		loginpg.dropDownIcon();
		loginpg.clickOnSignOut();
	}
	@Test(priority = 2)
	public void Verify_Basic_User_Access () throws IOException {
		loginPage loginpg = new loginPage(driver);
		
		System.out.println("launch");
		loginpg.typeEmailId
		("rajesh.harinadha+1@awanoo.com");
		logger.info("Entered emailID success");
		
		loginpg.typePassword("Test@111");
		logger.info("Entered password success");
		
		loginpg.clickSignIn();
		logger.info("Tapping on login button success");
		
		String userName = loginpg.getUserName();
		Assert.assertEquals("Rajesh J H", userName);
		
		dashboardPage dbpage = new dashboardPage(driver);
		
		boolean merchantCloud = dbpage.merchantCloudSection();
		Assert.assertTrue(merchantCloud, "Basic user Doesn't have access to merchant cloud section  - Failed");
		logger.info("Basic user has access to merchant cloud section");
	
		boolean managerAccess = dbpage.managerAccessSection();
		Assert.assertFalse(managerAccess, "Basic user has access to manager access section  - Failed");
		logger.info("Basic user Doesn't have access to manager access section");
		
		boolean adminAccess = dbpage.adminAccessSection();
		Assert.assertFalse(adminAccess, "Basic user has access to admin access section  - Failed");
		logger.info("Basic user Doesn't have access to admin access section");
		
		boolean internalAccess = dbpage.internalAccessSection();
		Assert.assertFalse(internalAccess, "Basic user has access to internal access section  - Failed");
		logger.info("Basic user Doesn't have access to internal access section");
		
		loginpg.dropDownIcon();
		loginpg.clickOnSignOut();
	}
	
	@Test(priority = 3)
	public void Verify_Manager_Access () throws IOException {
		loginPage loginpg = new loginPage(driver);
		
		System.out.println("launch");
		loginpg.typeEmailId
		("rajesh.harinadha+2@awanoo.com");
		logger.info("Entered emailID success");
		
		loginpg.typePassword("Test@222");
		logger.info("Entered password success");
		
		loginpg.clickSignIn();
		logger.info("Tapping on login button success");
		
		String userName = loginpg.getUserName();
		Assert.assertEquals("Rajesh J H", userName);
		
		dashboardPage dbpage = new dashboardPage(driver);
		
		boolean merchantCloud = dbpage.merchantCloudSection();
		Assert.assertTrue(merchantCloud, "Manager Doesn't have access to merchant cloud section  - Failed");
		logger.info("Manager has access to merchant cloud section");
	
		boolean managerAccess = dbpage.managerAccessSection();
		Assert.assertTrue(managerAccess, "Manager Doesn't have access to manager access section  - Failed");
		logger.info("Manager has access to manager access section");
		
		boolean adminAccess = dbpage.adminAccessSection();
		Assert.assertFalse(adminAccess, "Manager has access to admin access section  - Failed");
		logger.info("Manager Doesn't have access to admin access section");
		
		boolean internalAccess = dbpage.internalAccessSection();
		Assert.assertFalse(internalAccess, "Manager has access to internal access section  - Failed");
		logger.info("Manager Doesn't have access to internal access section");
	}

}
