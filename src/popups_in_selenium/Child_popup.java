package popups_in_selenium;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_popup {
	//it is also called as window handling or handling new tab
	//or new window
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "E:\\software testing\\chromedriver_win32_2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("mobile under 20000",Keys.ENTER);
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
		Set<String> allwindows = driver.getWindowHandles();
		//switched control
		ArrayList<String>al=new ArrayList<String>(allwindows);
		//created object of arraylist
		String mainid = al.get(0);
		System.out.println(mainid);
		driver.switchTo().window(al.get(1));
		//switched to child window
		String cw = al.get(1);
		System.out.println(cw);
		Thread.sleep(5000);
		String title = driver.getTitle();
		System.out.println(title);
		
	
	}
}
