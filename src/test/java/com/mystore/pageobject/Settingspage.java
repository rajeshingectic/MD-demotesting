package com.mystore.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mystore.utilities.WaitUtil;

public class Settingspage {
	
	public WebDriver driver;
	public WaitUtil wait;
	
	// Locator for categories page path in Catalog section
		By SettingspageLink = By.linkText("Settings");
	 	By SearchField = By.cssSelector(".peer");
	 	By userName = By.cssSelector(".hover\\3A bg-gray-50:nth-child(1) > .jsx-3ae08109fd82d328:nth-child(2) > .jsx-3ae08109fd82d328 > div");
	 	By AppConfigurationLimk = By.id("headlessui-tabs-tab-:r1:");
	 	By appConfigID = By.xpath("//*[@id=\"headlessui-tabs-panel-:r3:\"]/div/div[3]/div/span[2]");
	    
	    public void SettingspageLink()  {
	    	driver.findElement(SettingspageLink).click();
	    }
	    
	    public void SearchField(String Username){
	        driver.findElement(SearchField).sendKeys(Username);
	    }
	    
	    public void AppConfigurationLimk()  {
	    	driver.findElement(AppConfigurationLimk).click();
	    }
	 	
	    public String getUserName()
		{
			String text = driver.findElement(userName).getText();

			return text;
		}
	    
	    public String getappconfigID()
		{
	    	String text1 = driver.findElement(appConfigID).getText();

			return text1 ;
		}
	        
	    public Settingspage(WebDriver driver) {
	    	this.driver = driver;
	    	this.wait = new WaitUtil(driver); 
	    }

}
