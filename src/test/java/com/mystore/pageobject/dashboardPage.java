package com.mystore.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class dashboardPage {
	public WebDriver driver;

	// Locator for Merchant cloud section
	By merchantCloudSection = By.xpath("/html/body/div/div/aside/div[2]/nav/div[1]");
	
	// Locator for Merchant cloud Section Header
    By merchantCloudSectionHeader = By.xpath("//*[contains(text(),\"MERCHANT CLOUD\")]");
	 
    // Locator for ManagerAccess section
    By managerAccessSection = By.xpath("//*[@class=\"no-scrollbar flex flex-col overflow-y-auto duration-300 ease-linear\"]//div[2]");
    
 // Locator for ManagerAccess section Header
    By managerAccessSectionHeader = By.xpath("//h3[contains(text(),\"MANAGER ACCESS\")]");
 
    // Locator for Admin Access Section
    By adminAccessSection = By.xpath("//*[@class=\"no-scrollbar flex flex-col overflow-y-auto duration-300 ease-linear\"]//div[3]");
    
    // Locator for Admin Access Section Header
    By adminAccessSectionHeader = By.xpath("//h3[contains(text(),\"ADMIN ACCESS\")]");
    
    // Locator for internal Access Section
    By internalAccessSection = By.xpath("//*[@class=\"no-scrollbar flex flex-col overflow-y-auto duration-300 ease-linear\"]//div[4]");
    
    // Locator for internal Access SectionHeader
    By internalAccessSectionHeader = By.xpath("//h3[contains(text(),\"INTERNAL ACCESS\")]");
    
 
    
    
    
    // Method to check Merchant cloud section
    public boolean merchantCloudSection(){
		try {
			WebElement merchantCloud = driver.findElement(merchantCloudSection);
			if (merchantCloud.isDisplayed()) {
				return true;
			}
		} catch (Exception e) {
			return false; // Returns false if element not found
		}	return false;
	}
    
    //Method to check Merchant cloud section header
    public String merchantCloudSectionHeaderTitle() {
    	String title = driver.findElement(merchantCloudSectionHeader).getText();

		return title;
	}
    
    // Method to check ManagerAccess section
    public boolean managerAccessSection(){
    	try {
			WebElement managerAccess = driver.findElement(managerAccessSection);
			if (managerAccess.isDisplayed()) {
				return true;
			}
		} catch (Exception e) {
			return false; // Returns false if element not found
		}	return false;
    }
    
    //Method to check ManagerAccess section header
    public String managerAccessSectionHeaderTitle() {
    	String title = driver.findElement(managerAccessSectionHeader).getText();

		return title;
	}
    
 // Method to check Admin Access Section
    public boolean adminAccessSection(){
    	try {
			WebElement adminAccess = driver.findElement(adminAccessSection);
			if (adminAccess.isDisplayed()) {
				return true;
			}
		} catch (Exception e) {
			return false; // Returns false if element not found
		}	return false;
    }
    
    //Method to check Admin Access Section header
    public String adminAccessSectionHeaderTitle() {
    	String title = driver.findElement(adminAccessSectionHeader).getText();

		return title;
	}
    
 // Method to check internal Access section
    public boolean internalAccessSection(){
    	try {
			WebElement internalAccess = driver.findElement(internalAccessSection);
			if (internalAccess.isDisplayed()) {
				return true;
			}
		} catch (Exception e) {
			return false; // Returns false if element not found
		}	return false;
    }
    
    //Method to check internal Access section header
    public String internalAccesssectionHeaderTitle() {
    	String title = driver.findElement(internalAccessSectionHeader).getText();

		return title;
	}     
        
    public dashboardPage(WebDriver driver) {
    	this.driver = driver;
    }
	
}
