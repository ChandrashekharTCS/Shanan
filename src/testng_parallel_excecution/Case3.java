package testng_parallel_excecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Case3 {
	@Test
	public void TC3() {
		System.setProperty("webdriver.chrome.driver", "E:\\software testing\\chromedriver_win32_2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
	}
}
