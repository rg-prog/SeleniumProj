package kdf;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsClass {
	
	WebDriver driver;
	
	public void openbrowser() {
		driver=new ChromeDriver();
	}
	public void maximiseWindow() {
		driver.manage().window().maximize();
	}
	public void implementImplicitWait() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	public void navigateToApp(String url) {
		driver.get(url);
	}
	public void enterInTextbox(String locValue, String value) {
		driver.findElement(By.id(locValue)).sendKeys(value);	
	}
	public void clickbtn(String loc,String locValue) {
		if(loc.equals("name")) {
		driver.findElement(By.name(locValue)).click();
		}else if(loc.equals("xpath")) {
		driver.findElement(By.xpath(locValue)).click();
		}
	}
	public String getErrorMessage(String loc, String locValue) {
		String errorMsg=null;
		if(loc.equals("cssSelector")) {
		 errorMsg = driver.findElement(By.cssSelector(locValue)).getText();
		}else if(loc.equals("id")) {
		 errorMsg = driver.findElement(By.id(locValue)).getText();
		}
		return errorMsg;
	}
	public void closeBrowser() {
		driver.close();
	}

}
