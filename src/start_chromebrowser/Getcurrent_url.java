package start_chromebrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getcurrent_url {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\software testing\\chromedriver_win32_2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.monsterindia.com/");
		String link=driver.getCurrentUrl();//get current URL method
		System.out.println(link);
	}

}
