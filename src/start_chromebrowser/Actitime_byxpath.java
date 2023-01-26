package start_chromebrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime_byxpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\\\software testing\\\\chromedriver_win32_2\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		String expT = "actiTIME - Login";
		String actT = driver.getTitle();
		System.out.println(actT);
		if(expT.equals(actT)) {
			System.out.println("TC is passed");
		}
		else {
			System.out.println("TC is failed");
		}
		
		
	}

}
