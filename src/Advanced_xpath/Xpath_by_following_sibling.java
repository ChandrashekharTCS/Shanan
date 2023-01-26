package Advanced_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//one element/following-sibling::which next element
//(next element of same parent)

//one element/preceding-sibling::which is previous element
//(previous element of same parent 
public class Xpath_by_following_sibling {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\software testing\\chromedriver_win32_3\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		String gt = driver.findElement(By.xpath("//div[@id='container']/following-sibling::div[@id='scrnli_recorder_root']")).getText();
		System.out.println(gt);
	}

}
