package testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;

public class BankManagerLoginTest extends TestBase {

	@Test
	public void loginAsBankManager() throws InterruptedException, IOException {

		// soft assertion
		// - allows test to keep running after failure
		// - does not come up as failure in console but does in reports. Does not really work well with report ng
		verifyEquals("abc", "xyz");
	

		log.info("Inside Login test");
		click("bmlBtn_CSS");

		Assert.assertTrue(isElementPresent(By.cssSelector(OR.getProperty("addCustBtn_CSS"))), "Login not successful");

		log.info("Login successfully executed");

		// Assert.fail("Login not successful");
	}

}
