package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.TestBase;

public class LoginTest extends TestBase{

	
	
	@Test
	public void loginAsBankManager() throws InterruptedException {
		log.info("Inside Login test");
		driver.findElement(By.cssSelector(OR.getProperty("bmlBtn"))).click();
		Thread.sleep(3000);
		
		log.info("Login successfully executed");
	}
	
	
}
