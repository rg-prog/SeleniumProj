package com.webappsecurity.zero.Mavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransferFundsConfirmationPage {
	
	@FindBy(css="#transfer_funds_content > div > div > div.alert.alert-success")
	private WebElement successMess;
	
	public TransferFundsConfirmationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String successMsg() {
		String confirmText=successMess.getText();
		return confirmText;
	}

}
