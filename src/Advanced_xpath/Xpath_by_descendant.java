package Advanced_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//formulas
//html-body-//html/descendant::body
//any parent to any child
public class Xpath_by_descendant {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\software testing\\chromedriver_win32_3\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		String gett = driver.findElement(By.xpath("//html/descendant::div[@class='xtXmba']")).getText();
		System.out.println(gett);
	
	}

}
