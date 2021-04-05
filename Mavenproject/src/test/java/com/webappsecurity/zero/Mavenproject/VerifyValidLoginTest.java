package com.webappsecurity.zero.Mavenproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class VerifyValidLoginTest extends Base {

	@Test
	public void verifyValidLogin() {
		Login lp=new Login(driver);
		lp.applicationLogin("username", "password");

		AccountSummary actsum=new AccountSummary(driver);
		boolean transferFundsPresent=actsum.isTransferFundsPresent();
		Assert.assertTrue(transferFundsPresent);
	}

}
