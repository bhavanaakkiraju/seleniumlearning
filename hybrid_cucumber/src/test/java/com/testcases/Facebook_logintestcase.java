package com.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.baseclass.Library;
import com.pages.Facebook_loginpage;
import com.pages.OrangeHrm_loginpage;
import com.selenium_reusablefunctions.SeleniumUtility;

public class Facebook_logintestcase extends Library{

	Facebook_loginpage login;
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
		login=new Facebook_loginpage(driver);
	login.fbLogin(properties.getProperty("email_id"),properties.getProperty("passWord"));
	logger.info("Login Succesfull!!");
		
	}
	
	@AfterTest
	public void close() {
		sel= new SeleniumUtility(driver);
		sel.to_take_screenshot("fblogin");
		sel.getTitle();
		quit();
		logger.info("Closing Browser");
	}
}
