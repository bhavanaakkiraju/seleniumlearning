package com.step.definiton;

import com.baseclass.Library;

import com.pages.OrangeHrm_loginpage;
import com.selenium_reusablefunctions.SeleniumUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHrm_loginsteps extends Library {
	
	OrangeHrm_loginpage orangeloginPage;
	SeleniumUtility sel; 
	
	@Given("To launch the browser and Navigate to the Url")
	public void to_launch_the_browser_and_Navigate_to_the_Url() {
	    // Write code here that turns the phrase above into concrete actions
		browserSetUp();
		logger.info("Browser Launched");
	}

	@When("To Enter Username and Password")
	public void to_Enter_Username_and_Password() {
	    // Write code here that turns the phrase above into concrete actions
	    orangeloginPage=new OrangeHrm_loginpage(driver);
	    orangeloginPage.Login(properties.getProperty("username"),properties.getProperty("password"));
	    logger.info("Entered UserName And Password");
	}
	@Then("To Click the Submit button")
	public void to_Click_the_Submit_button() {
	  orangeloginPage = new OrangeHrm_loginpage(driver);	
	  orangeloginPage.submit();
	  logger.info("Login Button Clicked");
	}
	
	@Then("To Take the Screenshot and the Title")
	public void to_Take_the_Screenshot_and_the_Title() {
		sel = new SeleniumUtility(driver);
		sel.to_take_screenshot("LoginPage");
		sel.getTitle();
		logger.info("Taken Screenshot Of Login Page And Title printed in console");
	}
	



}
