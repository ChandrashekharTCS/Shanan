package start_chromebrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Minimize {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "E:\\software testing\\chromedriver_win32_2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.monsterindia.com");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.manage().window().minimize();//this method is not present in selenium 3.141.59
		Thread.sleep(4000);
		driver.manage().window().maximize();
		
	}

}
