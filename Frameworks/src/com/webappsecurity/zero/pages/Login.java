package com.webappsecurity.zero.pages;

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
	private WebElement loginBtn;
	
	@FindBy(css="#login_form > div.alert.alert-error")
	private WebElement loginFailMess;
	
	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void applicationLogin(String username, String password) {
		uName.sendKeys("username");
		pass.sendKeys("password");
		loginBtn.click();
	}
	public String errorMessage() {
		String errMesage=loginFailMess.getText();
		return errMesage;
	}

}
