package com.mystore.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mystore.utilities.WaitUtil;

public class CatalogPages {
	
	public WebDriver driver;
	public WaitUtil wait;
	
	// Locator for categories page path in Catalog section
		By Catalog = By.xpath("/html/body/div/div/aside/div[2]/nav/div[1]/ul/li[2]/a");
	 	By Categories = By.xpath("//*[contains(@class,\"group relative flex items-center gap-2.5 rounded-sm py-2 px-4 font-medium text-bodydark1 duration-300 ease-in-out hover:bg-graydark dark:hover:bg-meta-4 false\") and text()=\"Categories\"]");
	    By CategoryHeader = By.xpath("//h4[contains(text(),\"Categories\")]");
	 	By CategoryName = By.xpath("//*[contains(text(),\"Puzzles\")]");
	 	By FilterIcon = By.cssSelector(".text-darkblack > path");
	    By FilterIcon2 = By.cssSelector(".mr-2 > path");
	    By filterOptionID = By.xpath("//button[contains(text(),\"id\")]");
	    By FilterInput = By.cssSelector(".font-normal:nth-child(1)");
	    By FilterApplyButton = By.cssSelector(".rounded-lg");
	    By DetailsButton = By.xpath("//button[contains(text(),\"Details\")]");
	    By PoductButton = By.xpath("//button[contains(text(),\"Products\")]");
	    By ParentCategories = By.xpath("//button[contains(text(),\"Parent Categories\")]");
	    By Categoryid = By.cssSelector(".flex:nth-child(1) > .font-normal > .text-m");
	    By TransformButton = By.xpath("//button[contains(text(),\"Transform\")]");
	    By AddAttributeLink = By.xpath("//a[contains(text(),\"Add Attribute\")]");
	    By EnrichmentButton = By.xpath("//button[contains(text(),\"Enrichment\")]");
	    By DeriveandOverwriteButton = By.xpath("//button[contains(text(),\"Derive and Overwrite\")]");
	    By CustomAttributeButton = By.xpath("//button[contains(text(),\"Custom Attributes\")]");
	    By AIAttributeButton = By.xpath("//button[contains(text(),\"AI Recommendations\")]");
	    
	 // Locator for product page path in Catalog section
	    By Product = By.linkText("Products");
	    
	    public void Catalog()  {
	    	driver.findElement(Catalog).click();
	    }
	    
	 	public void categories() {

	    	driver.findElement(Categories).click();
	    	
	    }
	 	
	 	public String CategoryHeader() {
	 		String text = driver.findElement(CategoryHeader).getText();

			return text;
	 	}
	 	
	 	public String CategoryName() {
	 		String text = driver.findElement(CategoryName).getText();

			return text;
	 	}
	 	
	 	public void Categoryname() {
	 		driver.findElement(CategoryName).click();
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
	 		driver.findElement(FilterInput).sendKeys("1000");
	 	}
	 	
	 	public void FilterApplyButton() {
	 		driver.findElement(FilterApplyButton).click();
	 	}
	 	public void DetailsButton() {
	 		driver.findElement(DetailsButton).click();
	 	}
	 	
	 	public void PoductButton() {
	 		driver.findElement(PoductButton).click();
	 	}
	 	
	 	public void PoductButtonDisplayed() {
	 		driver.findElement(PoductButton).isDisplayed();
	 		
	 	}
	 	
	 	public void ParentCategories() {
	 		driver.findElement(ParentCategories).click();
	 	}
	 	
	 	public String Categoryid() {
	 		
	 		String text1 = driver.findElement(Categoryid).getText();

			return text1;
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
	 	
	 	public void EnrichmentButton() {

	    	driver.findElement(EnrichmentButton).click();
	    	
	    }
	 	
	 	public void DeriveandOverwriteButton() {

	    	driver.findElement(DeriveandOverwriteButton).click();
	    	
	    }
	 	
	 	public void CustomAttributeButton() {

	    	driver.findElement(CustomAttributeButton).click();
	    	
	    }
	 	
	 	public void AIAttributeButton() {

	    	driver.findElement(AIAttributeButton).click();
	    	
	    }
	 	
	 	//Product 
	 	public void Product() {

	    	driver.findElement(Product).click();
	    	
	    }
	        
	    public CatalogPages(WebDriver driver) {
	    	this.driver = driver;
	    	this.wait = new WaitUtil(driver); 
	    }

}
