package com.mystore.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mystore.pageobject.CatalogPages;
import com.mystore.pageobject.VariantPage;
import com.mystore.pageobject.loginPage;

public class TC_VariantPage extends BaseClass {


	@Test(priority=1)
	public void verify_Specific_product_name_is_displayed_in_products() throws IOException {
		
		
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
		
		VariantPage variantPage = new VariantPage(driver);
		variantPage.Variant();
		logger.info("Tapping on Variant link success");
		
		variantPage.VariantHeader();
		logger.info("Variant header title is getting displayed");
		
		logger.info("***************TestCase Verify Variant Header is displyed ends*****************");
		}
		
		
		  @Test(priority=2) public void
		  verify_Specific_Variant_by_using_filter_option_in_products() throws
		  IOException {
		  
		  VariantPage variantPage = new VariantPage(driver);
		  variantPage.filterIcon(); 
		  logger.info("Tapping on filter icon success");
		  
		  variantPage.filterIcon2(); 
		  logger.info("Tapping on filter icon2 success");
		  
		  variantPage.filterOptionID();
		  logger.info("Tapping on filterOptionID success");
		  
		  variantPage.FilterInput(); 
		  variantPage.FilterApplyButton();
		  
		  String VariantName = variantPage.VariantName();
		  Assert.assertEquals("Foam Puzzle Alphabet and Numbers - Assorted Packs", VariantName);
		  
		  if(VariantName.equals("Foam Puzzle Alphabet and Numbers - Assorted Packs")) {
		  logger.info("Verify VAriant Name is - Passed"); Assert.assertTrue(true); }
		  else { logger.info("Verify Variant Name is - Failed");
		  captureScreenShot(driver,"Verify Variant Name"); Assert.assertTrue(false);
		  
		  }
			logger.info("Variant name is getting displayed");
			logger.info("***************TestCase Verify Variant Name by using filters ends*****************"
		  );
		  
		  }
			
			  @Test(priority=3) public void verify_Specific_Variant_id_in_general_page()
			  throws IOException {
			  
			 VariantPage variantPage = new VariantPage(driver);
			 variantPage.Variantname();
			 logger.info("Tapping on filtered Variant success");
			  
			  String Variantid = variantPage.Variantid(); 
			  Assert.assertEquals("1001004",Variantid);
			  
			  if(Variantid.equals("1001004")) {
			  logger.info("Verify Variant id in general page - Passed");
			  Assert.assertTrue(true); } else {
			  logger.info("Verify Variant id in general page - Failed");
			  captureScreenShot(driver,"Verify Variant id"); 
			  Assert.assertTrue(false); }
			  logger.info("***************TestCase Verify Variant id in Variant general page ends*****************"
			  ); }
			  
			  
				
				  @Test(priority=4) public void
				  verify_user_is_navigated_to_Transform_page_for_specific_Variant() throws
				  IOException { 
					  VariantPage variantPage = new VariantPage(driver);
				  
					  variantPage.TransformButton(); 
					  logger.info("Tapping on transform button and navigated to transform page through specific Variant detail page success"
				  );
				  
					  variantPage.AddAttributeLinkDisplay(); 
					  Assert.assertTrue(true); 
					  logger.info("Verify user is in Tranform page by verifying Add Attribute link is displayed -- success"
				  );
				  
				  logger. info("***************TestCase Verify Tapping on transform button and navigated to transform page ends*****************"
				  ); }
				 
			 
			 
		 
		
		}
		
	

