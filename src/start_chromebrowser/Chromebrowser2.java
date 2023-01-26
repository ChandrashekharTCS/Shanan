package start_chromebrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromebrowser2 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","E:\\software testing\\chromedriver_win32_2\\chromedriver.exe");
		WebDriver w=new ChromeDriver();
		w.get("https://www.google.com");
		w.manage().window().maximize();
		//maximize the window
		w.get("https://www.amazon.com");
		Thread.sleep(1000);
		w.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mobile under 20000");
		w.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		w.navigate().back();
		w.navigate().back();

		
	}

}
