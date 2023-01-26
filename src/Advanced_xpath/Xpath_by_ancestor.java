package Advanced_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_by_ancestor {
	//child/ancestor::which parent
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\software testing\\chromedriver_win32_3\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		String gett = driver.findElement(By.xpath("//div[@class='xtXmba']/ancestor::html")).getText();
		System.out.println(gett);
	}

}
