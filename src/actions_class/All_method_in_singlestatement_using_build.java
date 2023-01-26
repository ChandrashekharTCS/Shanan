package actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class All_method_in_singlestatement_using_build {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\software testing\\chromedriver_win32_2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		//choose the taget element
		WebElement target = driver.findElement(By.xpath("//a[text()='Gmail']"));
		Actions act=new Actions(driver);
		act.moveToElement(target).contextClick().doubleClick().perform();
		
	}

}
