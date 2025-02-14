package com.mystore.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.mystore.utilities.Config;
import com.mystore.utilities.WaitUtil;

@SuppressWarnings("unused")
public class loginPage {
	public WebDriver driver;
	public WaitUtil wait;

	By EmailAddress = By.xpath("//*[@id=\"loginemail\"]");
	 
    // Locator for Password field
    By Password= By.xpath("//*[@id=\"loginpassword\"]");
 
    // Locator for SignIn Button
    By SignInButton= By.xpath("//input[@type=\"submit\"]");
    
    By userName = By.xpath("//span[contains(text(),\"Rajesh J H\")]"); 
	
    
    By dropDownIcon =By.cssSelector(".gap-3 > .relative > .items-center");
    
    
    By signOut = By.xpath("//button[@class=\" dark:text-bodydark flex items-center gap-3.5 py-4 px-6 text-sm font-medium duration-300 ease-in-out hover:text-primary lg:text-base\"]");
    
    By signinPageTitle = By.xpath("//h2[contains(text(),\"Merchant Cloud\")]");
	
    public String getPageTitle() {
    	String title = driver.findElement(signinPageTitle).getText();

		return title;
	}
     
    // Method to type EmailId
    public void typeEmailId(String Id){
        driver.findElement(EmailAddress).sendKeys(Id);
    }
 
    // Method to type Password
    public void typePassword(String PasswordValue){
        driver.findElement(Password).sendKeys(PasswordValue);
    }
 
    // Method to click SignIn Button
    public void clickSignIn(){
        driver.findElement(SignInButton).click();
    }
    
    public String getUserName()
	{
		String text = driver.findElement(userName).getText();

		return text;
	}
    
    public void dropDownIcon() {
    	WebElement dropDownIconElement = wait.waitForElementToBeVisible(dropDownIcon);
    	dropDownIconElement.click();
    }
    
    public void clickOnSignOut()
	{
		driver.findElement(signOut).click();
	}
    
    public loginPage(WebDriver driver) {
    	this.wait = new WaitUtil(driver);
    	this.driver = driver;
    }
	
}
