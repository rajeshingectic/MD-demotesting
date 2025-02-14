package com.mystore.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mystore.pageobject.CatalogPages;
import com.mystore.pageobject.loginPage;

public class TC_CategoriesPage extends BaseClass {


	@Test(priority=1)
	public void verify_category_header_is_displayed_in_categories() throws IOException {
		
		
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
		
		categoriesPage.categories();
		logger.info("Tapping on categories link success");
		
		categoriesPage.CategoryHeader();
		logger.info("Category header title is getting displayed");
		
		logger.info("***************TestCase Verify category header is displyed ends*****************");
		}
		
		@Test(priority=2)
		public void verify_Specific_category_by_using_filter_option_in_categories() throws IOException {
			
		
		CatalogPages categoriesPage = new CatalogPages(driver);
		categoriesPage.filterIcon();
		logger.info("Tapping on filter icon success");
		
		categoriesPage.filterIcon2();
		logger.info("Tapping on filter icon2 success");
		
		categoriesPage.filterOptionID();
		logger.info("Tapping on filterOptionID success");
		
		categoriesPage.FilterInput();
		categoriesPage.FilterApplyButton();
		
		String CategoryName = categoriesPage.CategoryName();
		Assert.assertEquals("Puzzles", CategoryName);
		
		if(CategoryName.equals("Puzzles"))
		{
			logger.info("Verify Category Name is - Passed");
			Assert.assertTrue(true);
		}
		else
		{
			logger.info("Verify Category Name is - Failed");
			captureScreenShot(driver,"Verify Category Name");
			Assert.assertTrue(false);

		}
		logger.info("***************TestCase Verify Category Name by using filters ends*****************"); 

	}
		@Test(priority=3)
		public void verify_Specific_category_id_in_general_page() throws IOException {
			
		
		CatalogPages categoriesPage = new CatalogPages(driver);
		categoriesPage.Categoryname();
		logger.info("Tapping on filtered category success");
		
		String categoryid = categoriesPage.Categoryid();
		Assert.assertEquals("1000", categoryid);
		
		if(categoryid.equals("1000"))
		{
			logger.info("Verify Category id in general page - Passed");
			Assert.assertTrue(true);
		}
		else
		{
			logger.info("Verify Category id in general page - Failed");
			captureScreenShot(driver,"Verify Category id");
			Assert.assertTrue(false);
		}
		logger.info("***************TestCase Verify Category id category general page ends*****************"); 
		}
		
		@Test(priority=4)
		public void verify_product_section_in_specific_category_page() throws IOException {
			CatalogPages categoriesPage = new CatalogPages(driver);
					
			categoriesPage.PoductButtonDisplayed();
			logger.info("Poduct section is getting Displayed in category detail page success");
			
			
			
			logger.info("***************TestCase Verify product section in specific category page ends*****************"); 
			}
		@Test(priority=5)
		public void verify_user_is_navigated_to_Transform_page_for_specific_category() throws IOException {
			CatalogPages categoriesPage = new CatalogPages(driver);
					
			categoriesPage.TransformButton();
			logger.info("Tapping on transform button and navigated to transform page through specific category detail page success");
			
			categoriesPage.AddAttributeLinkDisplay();
			Assert.assertTrue(true);
			logger.info("Verify user is in Tranform page by verifying Add Attribute link is displayed -- success");
			
			logger.info("***************TestCase Verify Tapping on transform button and navigated to transform page ends*****************"); 
			}
		
		}
		
	

