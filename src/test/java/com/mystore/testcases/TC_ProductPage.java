package com.mystore.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mystore.pageobject.CatalogPages;
import com.mystore.pageobject.ProductPage;
import com.mystore.pageobject.loginPage;

public class TC_ProductPage extends BaseClass {


	@Test(priority=1)
	public void verify_product_Header_is_displayed_in_products() throws IOException {
		
		
		loginPage loginpg = new loginPage(driver);
		
		System.out.println("launch");
		loginpg.typeEmailId
		("rajesh.harinadha@awanoo.com");
		logger.info("Entered emailID success");
		
		loginpg.typePassword("Test@123");
		logger.info("Entered password success");
		
		loginpg.clickSignIn();
		logger.info("Tapping on login button success");
		
		
		//registeredUserAccount regUser = new registeredUserAccount(driver);
		String userName = loginpg.getUserName();
		Assert.assertEquals("Rajesh J H", userName);
		
		
		CatalogPages categoriesPage = new CatalogPages(driver);
		categoriesPage.Catalog();
		logger.info("Tapping on Catalog link success");
		
		ProductPage productpage = new ProductPage(driver);
		productpage.Product();
		logger.info("Tapping on Product link success");
		
		productpage.ProductHeader();
		logger.info("Product header title is getting displayed");
		
		logger.info("***************TestCase Verify Product Header is displyed ends*****************");
		}
		
		
		  @Test(priority=2) public void
		  verify_Specific_product_by_using_filter_option_in_products() throws
		  IOException {
		  
		  
		  ProductPage productpage = new ProductPage(driver);
		  productpage.filterIcon(); 
		  logger.info("Tapping on filter icon success");
		  
		  productpage.filterIcon2(); 
		  logger.info("Tapping on filter icon2 success");
		  
		  productpage.filterOptionID();
		  logger.info("Tapping on filterOptionID success");
		  
		  productpage.FilterInput(); 
		  productpage.FilterApplyButton();
		  
		  String ProductName = productpage.ProductName();
		  Assert.assertEquals("Freshmint Fluoride Toothpaste - 0.6 oz", ProductName);
		  
		  if(ProductName.equals("Freshmint Fluoride Toothpaste - 0.6 oz")) {
		  logger.info("Verify Product Name is - Passed"); Assert.assertTrue(true); }
		  else { logger.info("Verify Product Name is - Failed");
		  captureScreenShot(driver,"Verify Product Name"); Assert.assertTrue(false);
		  
		  }
			logger.info("Product name is getting displayed");
			logger.info("***************TestCase Verify Product Name by using filters ends*****************"
		  );
		  
		  }
			
			  @Test(priority=3) public void verify_Specific_product_id_in_general_page()
			  throws IOException {
			  
			  
			 ProductPage productpage = new ProductPage(driver);
			 productpage.Productname();
			 logger.info("Tapping on filtered Product success");
			  
			  String Productid = productpage.Productid(); 
			  Assert.assertEquals("S-N25-759969",Productid);
			  
			  if(Productid.equals("S-N25-759969")) {
			  logger.info("Verify Product id in general page - Passed");
			  Assert.assertTrue(true); } else {
			  logger.info("Verify Product id in general page - Failed");
			  captureScreenShot(driver,"Verify Product id"); Assert.assertTrue(false); }
			  logger.info("***************TestCase Verify Product id in product general page ends*****************"
			  ); }
			  
			
			  @Test(priority=4) public void
			  verify_Varient_section_in_specific_product_page() throws IOException {
				  ProductPage productpage = new ProductPage(driver);
					 productpage.VarientButtonDisplayed(); 
					 logger.info("Poduct section is getting Displayed in category detail page success");
			  
			  
			  
			  logger.info("***************TestCase Verify Varient section in specific product page ends*****************"
			  ); 
			  }
			  
				
				  @Test(priority=5) public void
				  verify_user_is_navigated_to_Transform_page_for_specific_product() throws
				  IOException { 
					  ProductPage productpage = new ProductPage(driver);
				  
					  productpage.TransformButton(); 
					  logger.info("Tapping on transform button and navigated to transform page through specific product detail page success"
				  );
				  
					  productpage.AddAttributeLinkDisplay(); Assert.assertTrue(true); 
					  logger.info("Verify user is in Tranform page by verifying Add Attribute link is displayed -- success"
				  );
				  
				  logger. info("***************TestCase Verify Tapping on transform button and navigated to transform page ends*****************"
				  ); }
				 
			 
			 
		 
		
		}
		
	

