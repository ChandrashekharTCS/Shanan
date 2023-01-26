package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multibrowser {
	@Parameters("browsername") //annotation
	@Test
	public void TC(String browsername) {///parametrized method
		
		//now declare global variable
		WebDriver driver=null; //runtime polymorphism
		//apply condition
		if(browsername.equals("Chrome")) {
			
			//for chrome browser
			System.setProperty("webdriver.chrome.driver", "E:\\software testing\\chromedriver_win32_3\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browsername.equals("FireFox")) {
			//for firefox browser
			System.setProperty("webdriver.gecko.driver", "E:\\software testing\\geckodriver-v0.32.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobile under 15000",Keys.ENTER);
		
	
	}

}
