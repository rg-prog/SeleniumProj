package com.webappsecurity.zero.Mavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransferFundsVerify {
	
	@FindBy(id="btn_submit")
	private WebElement submit_btn;
	
	public TransferFundsVerify(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickSubmitTrnsfer() {
		submit_btn.click();
		
	}

}
