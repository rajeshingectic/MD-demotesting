package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signupPage {
WebDriver driver;
	
	//Constructor
	public signupPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
		//Identify web element for FirstName field
	@FindBy(xpath = "//input[@ng-model='FirstName']")
	WebElement enterFirstName;
	
	@FindBy(xpath = "//input[@ng-model='LastName']")
	WebElement enterLastName;
	
	@FindBy(xpath="//textarea[@ng-model='Adress']")
	WebElement enterAddress;
	
	@FindBy(xpath="//textarea[@ng-model='EmailAdress']")
	WebElement enterEmailAddress;
	
	@FindBy(xpath="//textarea[@ng-model='Phone']")
	WebElement enterPhoneNumber;
	
	@FindBy(id="customer.address.state")
	WebElement enterStateName;
	
	@FindBy(id="customer.address.zipCode")
	WebElement enterZipCode;
	
	
	
	@FindBy(id="customer.ssn")
	WebElement enterssnNumber;
	
	@FindBy(id="customer.username")
	WebElement enterUserName;
	
	@FindBy(id="customer.password")
	WebElement enterPassword;
	
	@FindBy(id="repeatedPassword")
	WebElement enterRepeatedPassword;
	
	@FindBy(xpath = "//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")
	WebElement Registor;
	
	@FindBy(xpath = "//*[@id=\"rightPanel\"]/h1")
	WebElement UserName;
	
	
			
		public void FirstName(String firstName) {
			enterFirstName.sendKeys("firstName");
		}
		
		public void LastName(String lastName) {
			enterLastName.sendKeys("lastName");
		}
		
		public void enterAddress(String enterAdress) {
			enterAddress.sendKeys("enterAdress");
		}
		
		public void emailAddress() {
			enterEmailAddress.sendKeys("rajesh@test.com");
		}
		
		public void PhoneNumber() {
			enterPhoneNumber.sendKeys("9952255819");
		}
		
		public void StateName() {
			enterStateName.sendKeys("WA");
		}
		
		public void ZipCode() {
			enterZipCode.sendKeys("98121");
		}
		
		//public void ssnNumber() {
		//	enterssnNumber.sendKeys("981-121");
	//	}
		
		public void UserName() {
			enterUserName.sendKeys("rajesh11");
		}
		
		public void Password() {
			enterPassword.sendKeys("Test@123");
		}
		
		public void RepeatedPassword() {
			enterRepeatedPassword.click();
		}
		
		public void clickOnRegistorLink(){
			Registor.click();
		}
		
		public String getUserName(){
			String text = UserName.getText();
			
			return text;
		}

}
