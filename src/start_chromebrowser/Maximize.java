package start_chromebrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "E:\\software testing\\chromedriver_win32_2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");///get method
		Thread.sleep(4000);
		driver.manage().window().maximize();///maximize the browser
		Thread.sleep(4000);
		driver.close();//close method
	}

}
