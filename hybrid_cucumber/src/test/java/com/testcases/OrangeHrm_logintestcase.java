package com.testcases;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.baseclass.Library;
import com.pages.OrangeHrm_loginpage;
import com.selenium_reusablefunctions.SeleniumUtility;

public class OrangeHrm_logintestcase extends Library {
	OrangeHrm_loginpage lpage;
	SeleniumUtility sel;
	@BeforeTest
	public void launchApp()
	{
		//launchApplication("edge","https://opensource-demo.orangehrmlive.com/");
		browserSetUp();
		logger.info("Browser Launched");
	}
	@Test
	public void login() {
		lpage=new OrangeHrm_loginpage(driver);
	lpage.Login(properties.getProperty("username"),properties.getProperty("password"));
	logger.info("Login Succesfull!!");
		
	}
	@AfterTest
	public void close() {
		sel= new SeleniumUtility(driver);
		sel.to_take_screenshot("login");
		sel.getTitle();
		quit();
		logger.info("Closing Browser");
	}

}
