package com.mystore.testcases;

import org.testng.annotations.Test;

import com.mystore.pageobject.homePage;
import com.mystore.pageobject.signupPage;

public class TC_registerPageTest extends BaseClass {
	@Test
	public void verify_registration_and_login() {

		driver.get(url);
		logger.info("url opened");

		homePage hpg = new homePage(driver);
		
		//Entering emailid in input field
		hpg.enteremailid("rajeshtester7gmail.com");
		logger.info("Email ID entered successfully");
		//Click on enterming icon in homepage
		hpg.clickOnenterimgIcon();
		logger.info("Tapping on entericon is success");
		
		signupPage spg = new signupPage(driver);
		
		//Enter the First name in Register page
		spg.FirstName("rajesh");
		logger.info("First Name entered successfully");
		
		spg.LastName("J H");
		logger.info("Last Name entered successfully");
		
		spg.enterAddress("500 wallstreet,Seattle,WA-98121");
		logger.info("User Address entered successfully");
		
		/*
		 * // click on Account Drop down pg.clickOnRegistorLink();
		 * //logger.info("Tapping on registor link text success");
		 * 
		 * signupPage spg = new signupPage(driver);
		 * 
		 * spg.FirstName();
		 * //logger.info("Firstname entered successfully in firstname input field");
		 * 
		 * spg.LastName();
		 * //logger.info("LastName entered successfully in LastName input field");
		 * 
		 * spg.StreetName();
		 * //logger.info("StreetName entered successfully in StreetName input field");
		 * 
		 * spg.CityName();
		 * //logger.info("CityName entered successfully in CityName input field");
		 * 
		 * spg.StateName();
		 * //logger.info("StateName entered successfully in StateName input field");
		 * 
		 * spg.ZipCode();
		 * logger.info("ZipCode entered successfully in ZipCode input field");
		 * 
		 * spg.PhoneNumber();
		 * //logger.info("PhoneNumber entered successfully in PhoneNumber input field");
		 * 
		 * spg.ssnNumber();
		 * //logger.info("ssnNumber entered successfully in ssnNumber input field");
		 * 
		 * spg.Password();
		 * //logger.info("Password entered successfully in Password input field");
		 * 
		 * spg.RepeatedPassword(); //logger.
		 * info("RepeatedPassword entered successfully in RepeatedPassword input field"
		 * );
		 * 
		 * spg.clickOnRegistorLink();
		 * //logger.info("Tapping on registor link text success");
		 * 
		 * //signupPage regUser = new signupPage(driver); //String userName =
		 * regUser.getUserName();
		 * 
		 * //Assert.assertEquals("Welcome rajesh", userName);
		 */		
	}
}
