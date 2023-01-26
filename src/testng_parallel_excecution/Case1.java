package testng_parallel_excecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//the process of running multiple test cases parallely 
//rather than one after one 
//here we can run two or more applications simultaneously.

public class Case1 {
@Test
public void TC1() {
	System.setProperty("webdriver.chrome.driver", "E:\\software testing\\chromedriver_win32_2\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	
}
}
