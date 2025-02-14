package com.mystore.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mystore.utilities.WaitUtil;

public class ProductPage {
	
	public WebDriver driver;
	public WaitUtil wait;
	 // Locator for product page path in Catalog section
    By Product = By.linkText("Products");
    By ProductHeader = By.linkText("Products");
    By FilterIcon = By.cssSelector(".text-darkblack");
    By FilterIcon2 = By.cssSelector(".mr-2 > path");
    By filterOptionID = By.xpath("//button[contains(text(),\"id\")]");
    By FilterInput = By.cssSelector(".font-normal:nth-child(1)");
    By FilterApplyButton = By.cssSelector(".rounded-lg");
    By ProductName = By.xpath("//*[contains(text(),\"Freshmint Fluoride Toothpaste - 0.6 oz\")]");
    By Productid = By.cssSelector(".flex:nth-child(1) > .font-normal > .text-m");
    By VarientButton = By.xpath("//button[contains(text(),\"Variants\")]");
    By TransformButton = By.xpath("//button[contains(text(),\"Transform\")]");
    By AddAttributeLink = By.xpath("//a[contains(text(),\"Add Attribute\")]");
    
  //Product 
 	public void Product() {

    	driver.findElement(Product).click();
    	
    }
 	
 	public String ProductHeader() {
 		String text = driver.findElement(ProductHeader).getText();

		return text;
 	}
 	
 	public void filterIcon() {
 		WebElement FilterIconElement = wait.waitForElementToBeVisible(FilterIcon);
 		FilterIconElement.click();
 	}
 
 	public void filterIcon2() {
 		WebElement FilterIcon2Element = wait.waitForElementToBeVisible(FilterIcon2);
 		FilterIcon2Element.click();
 	}
 	
 	public void filterOptionID() {
 		driver.findElement(filterOptionID).click();
 	}
 	
 	public void FilterInput() {
 		driver.findElement(FilterInput).sendKeys("S-N25-759969");
 	}
 	
 	public void FilterApplyButton() {
 		driver.findElement(FilterApplyButton).click();
 	}
 	
 	public String ProductName() {
 		String text = driver.findElement(ProductName).getText();

		return text;
 	}
 	
 	public void Productname() {
 		driver.findElement(ProductName).click();
 	}
 	
 	public String Productid() {
 		
 		String text1 = driver.findElement(Productid).getText();

		return text1;
 	}
 	
 	public void VarientButtonDisplayed() {
 		driver.findElement(VarientButton).isDisplayed();
 		
 	}
 	
 	public void TransformButton() {

    	driver.findElement(TransformButton).click();
    	
    }
 	
 	public boolean AddAttributeLinkDisplay() {

 		WebElement AddAttributebutton = driver.findElement(AddAttributeLink);
        return AddAttributebutton.isDisplayed();
    }
 	
 	public void AddAttributeLinkclick() {

    	driver.findElement(AddAttributeLink).click();
    	
    }
        
    public ProductPage(WebDriver driver) {
    	this.driver = driver;
    	this.wait = new WaitUtil(driver); 
    }

}