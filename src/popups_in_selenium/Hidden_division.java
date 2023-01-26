package popups_in_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_division {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\software testing\\chromedriver_win32_2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		//driver.findElement(By.xpath("//button[text()='✕']")).click();//
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	}

}
