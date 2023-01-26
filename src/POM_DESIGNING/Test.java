package POM_DESIGNING;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\software testing\\chromedriver_win32_2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.actitime.com/login.do");
		//call first POM class
		LoginPage l=new LoginPage(driver);
		l.enterUn();
		l.enterPwd();
		l.clickLoginBtn();
		
		//now call 2nd POM class
		Homepage h=new Homepage(driver);
		h.verifytext();
	}

}
