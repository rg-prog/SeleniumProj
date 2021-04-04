package com.webappsecurity.zero.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransFundsVerify {
	
	@FindBy(css="#btn_submit")
	private WebElement subBtn;
	
	public TransFundsVerify(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickConfirmTrans() {
		subBtn.click();
	}

}
