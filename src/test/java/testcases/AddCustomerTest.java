package testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;
import utilities.TestUtil;

public class AddCustomerTest extends TestBase{

	//params are the columns in the excel file
	@Test (dataProviderClass=TestUtil.class, dataProvider="dp")
	public void addCustomerTest(String firstName, String lastName, String postCode, String alerttext) throws InterruptedException {
		
		click("addCustBtn_CSS");
		type("firstname_CSS",firstName);
		type("lastname_XPATH",lastName);
		type("postcode_CSS",postCode);
		click("addBtn_CSS");
		Thread.sleep(2000);
		
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		Assert.assertTrue(alert.getText().contains(alerttext));
		alert.accept();
		
		//Assert.fail("Customer not added");
		Thread.sleep(2000);
	}
	

}
