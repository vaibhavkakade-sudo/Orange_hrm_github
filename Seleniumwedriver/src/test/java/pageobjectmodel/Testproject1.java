package pageobjectmodel;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Testproject1 {
	
	WebDriver driver;
	
	// constructor
	public Testproject1(WebDriver driver) {
		
		this.driver = driver;
	}
	
	// Locators
	By username_locator =  By.xpath("//input[@placeholder='Username']");
	By password_locator = By.xpath("//input[@placeholder='Password']");
	By loginbutton_locator = By.xpath("//button[@type='submit']");
	
	
//	 Webelement elementname = driver.findElement(By.xpath(@));
//	By  locatorname = By.xpath(@)
//	
//	Driver.findElement(locatorname).sendkeys
	
	
    // Execution/Action methods  
	public void fillUN(String username) {
		driver.findElement(username_locator).sendKeys(username);
	}
	
	public void fillPW(String pwd) {
		driver.findElement(password_locator).sendKeys(pwd);
	}
	
	public void ClickLoginBtn() {
		driver.findElement(loginbutton_locator).click();
	}
	

}
