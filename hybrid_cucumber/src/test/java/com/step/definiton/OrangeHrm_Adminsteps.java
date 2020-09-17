package com.step.definiton;

import com.baseclass.Library;
import com.pages.OrangeHrm_Adminpage;
import com.selenium_reusablefunctions.SeleniumUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHrm_Adminsteps extends Library  {
	
	OrangeHrm_Adminpage	orangeadminpage;
	SeleniumUtility sel;
	
	@Given("To Open Admin functionlity of OrangeHrm")
	public void to_Open_Admin_functionlity_of_OrangeHrm() {
	    // Write code here that turns the phrase above into concrete actions
	   orangeadminpage=new OrangeHrm_Adminpage(driver);
	   orangeadminpage.clickMenuAdmin();
	   logger.info("menu admin biutton is clicked");
	   
	}

	@When("To Enter {string}")
	public void to_Enter(String uName) {
	    // Write code here that turns the phrase above into concrete actions
	   orangeadminpage= new OrangeHrm_Adminpage(driver);
	   orangeadminpage.insertUserName(uName);
	   logger.info("Username is Entered");
	}


	@Then("Select {string}")
	public void select(String uRole){
	   orangeadminpage=new OrangeHrm_Adminpage(driver);
	   orangeadminpage.selectUserType(uRole);
	   logger.info("UserRole is Entered");
	}

	@Then("To Enter EmployeeName")
	public void to_Enter_EmployeeName() {
	    // Write code here that turns the phrase above into concrete actions
		orangeadminpage = new OrangeHrm_Adminpage(driver);
		orangeadminpage.insertEmployeeName(properties.getProperty("adminEmployeeName"));
		logger.info("Employee Name is Entered");
	}

	@Then("Select Status")
	public void select_Status(){
	    // Write code here that turns the phrase above into concrete actions
		orangeadminpage = new OrangeHrm_Adminpage(driver);
		orangeadminpage.selectStatus(properties.getProperty("adminStatus"));
		logger.info("Status is selected");
	}

	@Then("Click Search Button")
	public void click_Search_Button() {
	    // Write code here that turns the phrase above into concrete actions
		orangeadminpage = new OrangeHrm_Adminpage(driver);
		orangeadminpage.search();
	    logger.info("Search button is clicked");
	}

	@Then("Take the Screenshot and the Title")
	public void take_the_Screenshot_and_the_Title(){
	    // Write code here that turns the phrase above into concrete actions
		sel= new SeleniumUtility(driver);
		sel.to_take_screenshot("searchAdmin");
		sel.getTitle();
		logger.info("Taken Screenshot Of Login Page And Title printed in console");
	}

	@Then("Close the browser")
	public void close_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
	tearDown();
	logger.info("Browser is closed");
	}


}
