package com.webappsecurity.zero.Mavenproject;


import org.testng.Assert;
import org.testng.annotations.Test;



public class VerifyFundTransferTest extends Base {

	@Test
	public void verifyFundTransfer() {
		Login lp=new Login(driver);
		AccountSummary acc=new AccountSummary(driver);
		TransferFunds tf=new TransferFunds(driver);
		TransferFundsConfirmationPage tfc=new TransferFundsConfirmationPage(driver);
		TransferFundsVerify tfv=new TransferFundsVerify(driver);

		lp.applicationLogin("username", "password");
		acc.clicktransferFunds();
		tf.doTranserFunds("200", "Funds From Savings to Loan of $200");
		tfv.clickSubmitTrnsfer();
		String acctualText=tfc.successMsg();
		String expectedText="You successfully submitted your transaction.";
		Assert.assertEquals(acctualText, expectedText);
	}
}
