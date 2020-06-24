package utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import base.TestBase;

public class TestUtil extends TestBase {

		public static String screenshotPath;
		public static String screenshotName;
		
		public static void captureScreenshot() throws IOException {
			
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			Date d = new Date();
			screenshotName = d.toString().replace(":", "_").replace(" ", "_")+".jpg";
			
			FileHandler.copy(scrFile, new File(System.getProperty("user.dir")+"\\target\\surefire-reports\\html\\"+screenshotName));
		}
}
