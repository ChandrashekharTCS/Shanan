package start_chromebrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromebrowser {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\software testing\\chromedriver_win32_2\\chromedriver.exe");
		///System.setProperty("key","value");
		///key=to unlock the browser & value=path of browser class
		///key=webdriver.chrome.driver & value=.exe path of chromedriver
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
	}

}
