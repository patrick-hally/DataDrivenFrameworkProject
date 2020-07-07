package testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import base.TestBase;
import utilities.TestUtil;

public class OpenAccountTest extends TestBase {

	// params are the columns in the excel file
	@Test(dataProviderClass = TestUtil.class, dataProvider = "dp")
	public void openAccountTest(String customer, String currency) throws InterruptedException {

		click("openaccount_CSS");
		select("customer_CSS", customer);
		select("currency_CSS", currency);
		click("process_CSS");
		Thread.sleep(2000);

		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		alert.accept();
	}

}
