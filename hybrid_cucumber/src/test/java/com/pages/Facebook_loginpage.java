package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Library;

public class Facebook_loginpage  extends Library{
	public Facebook_loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
@FindBy(id="email")
WebElement emailid;

@FindBy(id="pass")
WebElement password;

@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")
WebElement Submit;

public void fbLogin(String email_id,String passWord) {
	emailid.sendKeys(email_id);
	password.sendKeys(passWord);
	Submit.click();
}
}
