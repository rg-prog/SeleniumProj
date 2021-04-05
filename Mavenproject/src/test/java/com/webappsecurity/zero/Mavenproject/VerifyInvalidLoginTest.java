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



public class VerifyInvalidLoginTest extends Base {
	
	@Test
	public void verifyInValidLogin() {
		Login lp=new Login(driver);
		lp.applicationLogin("user111", "pass111");
        String actualmessage=lp.getErrorMsg();
        String expecteMessage="Login and/or password are wrong."; 
        Assert.assertEquals(actualmessage, expecteMessage);
	}
}
