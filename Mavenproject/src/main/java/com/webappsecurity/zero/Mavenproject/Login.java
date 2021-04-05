package com.webappsecurity.zero.Mavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	@FindBy(css="#user_login")
	private WebElement uName;
	
	@FindBy(css="#user_password")
	private WebElement pass;
	
	@FindBy(css="#login_form > div.form-actions > input")
	private WebElement signIn;
	
	@FindBy(css="#login_form > div.alert.alert-error")
	private WebElement errorMessage; 
	
	public Login(WebDriver driver) {
		//is an in built class, method will initialize all the webelements of this class on the driver
		PageFactory.initElements(driver, this);
	}
	
	public void applicationLogin(String loginName, String loginPassword ) {
		uName.sendKeys(loginName);
		pass.sendKeys(loginPassword);
		signIn.click();
	}
	public String getErrorMsg() {
		String errMesg=errorMessage.getText();
		return errMesg;
	}
	

}
