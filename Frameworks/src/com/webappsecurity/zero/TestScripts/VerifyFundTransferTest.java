package com.webappsecurity.zero.TestScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.webappsecurity.zero.pages.AccountSummary;
import com.webappsecurity.zero.pages.Login;
import com.webappsecurity.zero.pages.TransFundsVerify;
import com.webappsecurity.zero.pages.TransferFunds;
import com.webappsecurity.zero.pages.TransferFundsConformation;

import utils.GenericMethods;

public class VerifyFundTransferTest extends Base {
	
	@Test
	public void verifyFundTransfer() throws IOException {
		Login lp=new Login(driver);
		AccountSummary actsum= new AccountSummary(driver);
		TransferFunds tsf = new TransferFunds(driver);
		TransferFundsConformation tsfc =new TransferFundsConformation(driver);
		TransFundsVerify tsfv =  new TransFundsVerify(driver);
		
		String[][] data = GenericMethods.getData("C:\\Users\\gkgaj\\workspace\\TestData.xlsx", "Sheet1");
		
		for(int i=1;i<data.length;i++) {
			lp.applicationLogin(data[i][0], data[i][1]);
			actsum.clicktransferFunds();
			tsf.doTransferFunds(data[i][2], data[i][3]);
			tsfv.clickConfirmTrans();
			String actualscucssMes=tsfc.succMessage();
			String expectedScuMsg=data[1][4];
			Assert.assertEquals(actualscucssMes, expectedScuMsg);
			tsfc.logoutFromAppl();
			driver.get("http://zero.webappsecurity.com/login.html");
		}
		
	}
	
	

}
