package testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.TestBase;

public class LoginTest extends TestBase {
	
	@Test
	public void login() {
		driver.findElement(By.xpath(OR.getProperty("Username"))).sendKeys(Sendkeys.getProperty("name"));
		driver.findElement(By.xpath(OR.getProperty("Password"))).sendKeys(Sendkeys.getProperty("pass"));
		driver.findElement(By.xpath(OR.getProperty("Submit"))).click();
		

	}
}

	
