package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Library;
import com.selenium_reusablefunctions.SeleniumUtility;

public class OrangeHrm_loginpage extends Library {
	
public OrangeHrm_loginpage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	
}
@FindBy(id = "txtUsername")
WebElement usernameText;

@FindBy(id = "txtPassword")
WebElement passwordText;

@FindBy(id = "btnLogin")
WebElement loginButton;

	/*
	 * @FindBy(xpath = "//*[@id='menu_admin_viewAdminModule']/b") WebElement
	 * menu_adminButton;
	 */

public void Login(String username, String password) {
	//AdminIcon.click();
	usernameText.sendKeys(username);
	passwordText.sendKeys(password);
	
	
}
public void submit() {
	loginButton.click();
	
}
}
