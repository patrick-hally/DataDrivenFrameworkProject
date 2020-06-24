package listeners;

import java.io.IOException;

import org.testng.ISuite;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import utilities.TestUtil;

public class CustomListeners implements ITestListener{

		public void onFinish(ITestContext arg0) {
			// TODO Auto-generated method stub
			
		}

		public void onStart(ITestContext arg0) {
			// TODO Auto-generated method stub
			
		}

		public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
			// TODO Auto-generated method stub
			
		}

		public void onTestFailure(ITestResult arg0) {
		
			System.setProperty("org.uncommons.reportng.escape-output", "false");
			try {
				TestUtil.captureScreenshot();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Reporter.log("Click to see screenshot");
			Reporter.log("<a target=\"_blank\" href="+TestUtil.screenshotName+">Screenshot</a>");
			Reporter.log("<br>");
			Reporter.log("<br>");
			Reporter.log("<a target=\"_blank\" href="+TestUtil.screenshotName+"><img src="+TestUtil.screenshotName+" height=200 width=200></img></a>");
		
			
		}

		public void onTestSkipped(ITestResult arg0) {
			// TODO Auto-generated method stub
		}


		public void onTestStart(ITestResult arg0) {
           // TODO Auto-generated method stub
		}

		public void onTestSuccess(ITestResult arg0) {
			// TODO Auto-generated method stub
		}

		public void onFinish(ISuite arg0) {
			// TODO Auto-generated method stub
		}

		public void onStart(ISuite arg0) {
			// TODO Auto-generated method stub
			
		}

	}

