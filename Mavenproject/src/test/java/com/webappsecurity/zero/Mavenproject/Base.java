package com.webappsecurity.zero.Mavenproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base {
	
	WebDriver driver;

	@BeforeClass
	public void openApplication() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		//for the applications with http. For https websites you dont need 
		ChromeOptions capability=new ChromeOptions();
		capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);

		driver=new ChromeDriver(capability);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://zero.webappsecurity.com/login.html");
	}
	@AfterClass
	public void closeApplication() {
		driver.close();
	}

}
