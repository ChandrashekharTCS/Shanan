package popups_in_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\software testing\\chromedriver_win32_2\\chromedriver.exe");
		ChromeOptions c=new ChromeOptions();
		c.addArguments("disable notification");
		c.addArguments("start maximized");
		WebDriver driver=new ChromeDriver(c);
		driver.get("https://www.irctc.co.in/nget/train-search/");
	}

}
