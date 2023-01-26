package start_chromebrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_if_else {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\software testing\\chromedriver_win32_2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		String expT="Amazon.com.Spent less.Smile more.";
		String actT=driver.getTitle();
		if(expT.equals(actT)) {
			System.out.println("TC is pass");
		}
		else {
			System.out.println("TC is fail");
		}
		
	}

}
