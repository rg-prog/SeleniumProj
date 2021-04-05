package com.webappsecurity.zero.Mavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountSummary {
	//Update and save
	@FindBy(linkText="Transfer Funds")
	private WebElement transferFunds;
	
	public AccountSummary(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clicktransferFunds() {
		transferFunds.click();
	}
	public boolean isTransferFundsPresent() {
		boolean transferfundsPresent=transferFunds.isDisplayed();
		return transferfundsPresent;
	}

}
