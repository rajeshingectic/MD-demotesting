package com.mystore.testcases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.mystore.utilities.Config;
import com.mystore.utilities.ExtentReportUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	Config config = new Config();
	
	String url = config.getBaseUrl();
	String browser = config.getBrowser();

	public static WebDriver driver;
	public static Logger logger;
	
	@BeforeClass
	public void setup() {
		String browser = "chrome";
		
		switch(browser.toLowerCase()) {
		
		case "chrome":
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
			
		case "msedge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
			break;
			
		default:
			
			break;
				
		}
		ExtentReportUtil.initExtentReports();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//for logging
				logger = LogManager.getLogger("MyStoreV1");
				
				//open url
				driver.get(url);
				logger.info("url opened");
		
	}
	
	
	@AfterClass()
	public void tearDown() {
		//driver.close();
		driver.quit();
		
	}
	public void captureScreenShot(WebDriver driver,String testName) throws IOException
	{
		//step1: convert webdriver object to TakesScreenshot interface
		TakesScreenshot screenshot = ((TakesScreenshot)driver);
		
		//step2: call getScreenshotAs method to create image file
		
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		
		File dest = new File(System.getProperty("user.dir") + "//Screenshots//" + testName + ".png");
	
		//step3: copy image file to destination
		FileUtils.copyFile(src, dest);
	}
}
