package com.webappsecurity.zero.Mavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TransferFunds {
	
	@FindBy(id="tf_fromAccountId")
	private WebElement fromAcct;
	
	@FindBy(id="tf_toAccountId")
	private WebElement toAcct;
	
	@FindBy(id="tf_amount")
	private WebElement amt;
	
	@FindBy(id="tf_description")
	private WebElement desc;
	
	@FindBy(id="btn_submit")
	private WebElement submit;
	
	public TransferFunds(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void doTranserFunds(String amount, String description) {
		
		Select fromdd=new Select(fromAcct);
		fromdd.selectByIndex(2);
		
		Select todd=new Select(toAcct);
		todd.selectByIndex(3);
		
		amt.sendKeys(amount);
		desc.sendKeys(description);
		
		submit.click();
		
	}

}
