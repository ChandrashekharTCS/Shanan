package TestNG;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Firefox {
	@Test
	public void TC() {
		System.setProperty("webdriver.gecko.driver", "E:\\software testing\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
	}
}
	