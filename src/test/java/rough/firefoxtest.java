package rough;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class firefoxtest {
	public static WebDriver driver;
	public static void main(String[] args) throws IOException {

		
		 System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\geckodriver.exe");
			 FirefoxOptions options = new FirefoxOptions();
			 options.setCapability("marionette", false);
			 driver = new FirefoxDriver(options);
			
		driver.get("www.google.com");
		
		
	}
}
