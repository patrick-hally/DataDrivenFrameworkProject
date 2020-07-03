package testcases;

import org.testng.annotations.Test;

import base.TestBase;
import utilities.TestUtil;

public class OpenAccountTest extends TestBase{

	//params are the columns in the excel file
	@Test (dataProviderClass=TestUtil.class, dataProvider="dp")
	public void openAccountTest(String customer, String currency) throws InterruptedException {
		
		
	}
	

}
