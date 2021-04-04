package com.webappsecurity.zero.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TransferFunds {

	@FindBy(css="#tf_fromAccountId")
	private WebElement fromAcct;

	@FindBy(css="#tf_toAccountId")
	private WebElement toAcct;

	@FindBy(css="#tf_amount")
	private WebElement amt;

	@FindBy(css="#tf_description")
	private WebElement desc;

	@FindBy(css="#btn_submit")
	private WebElement submt;

	public TransferFunds(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void doTransferFunds(String amount, String description) {
		Select frmtransfer=new Select(fromAcct);
		frmtransfer.selectByIndex(2);

		Select totransfer=new Select(toAcct);
		totransfer.selectByIndex(3);

		amt.sendKeys(amount);
		desc.sendKeys(description);
		submt.click();			
	}

}
