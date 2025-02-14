package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {
	//Create object of WebDriver
	WebDriver ldriver;
	
	//Constructor
	public homePage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	//Identify web element
	@FindBy(id = "email")
	WebElement emailInputField;
	
	@FindBy(id = "enterimg")
	WebElement enterimg;
	
	
	
	//Sending the email id to the email input field in Homepage
	public void enteremailid(String emailid) {
		emailInputField.sendKeys(emailid);
    }
	
	//Clicking on Account drop down link
	public void clickOnenterimgIcon(){
		enterimg.click();
	}
	
	/*
	 * public void SignUplink() { SignUpLink.click(); }
	 * 
	 * //Clicking on Login link public void Login() { clickOnLogin.click(); }
	 */
}
