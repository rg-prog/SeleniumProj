package com.webappsecurity.zero.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransferFundsConformation {
	@FindBy(css="#transfer_funds_content > div > div > div.alert.alert-success")
	private WebElement sucessMesg;
	
	@FindBy(css="#settingsBox > ul > li:nth-child(3) > a")
	private WebElement username;
	
	@FindBy(css="#logout_link")
	private WebElement logout;
	
	public TransferFundsConformation(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public String succMessage(){
		String sucMessage= sucessMesg.getText();
		return sucMessage;
	}
	public void logoutFromAppl() {
		username.click();
		logout.click();
	}
	

}
