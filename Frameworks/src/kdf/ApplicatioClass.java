package kdf;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import utils.GenericMethods;

public class ApplicatioClass {
	@Test
	public void verifyInvalidLogin() throws IOException {
		String[][] data = GenericMethods.getData("C:\\Users\\gkgaj\\workspace\\TestData.xlsx", "Sheet2");
		MethodsClass mtd=new MethodsClass(); 
		for(int i=1;i<data.length;i++) {
			switch(data[i][3]) {
			case "openBrowser":
				mtd.openbrowser();
				break;
			case "maxBrowser":
				mtd.maximiseWindow();
				break;
			case "impWait":
				mtd.implementImplicitWait();
				break;
			case "navigateToApp":
				mtd.navigateToApp(data[i][6]);
				break;
			case "enterInTextBox":
				mtd.enterInTextbox(data[i][5], data[i][6]);
				break;
			case "clickButton":
				mtd.clickbtn(data[i][4], data[i][5]);
				break;
			case "verifyErrorMsg":
				String actualMess=mtd.getErrorMessage(data[i][4],data[i][5]);
				Assert.assertEquals(actualMess, data[i][6]);
				break;
			case "closeApp":
				mtd.closeBrowser();
				break;
				
			}
		}
	}

}
