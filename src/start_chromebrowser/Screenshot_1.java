package start_chromebrowser;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot_1 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "E:\\software testing\\chromedriver_win32_2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		TakesScreenshot ts=(TakesScreenshot) driver;
		////typecast takessceenshot interface 

		File src = ts.getScreenshotAs(OutputType.FILE);
		///take the screenshot using getScreenshot method
		
		File desk=new File("C:\\Users\\CHANDRASHEKHAR\\Desktop\\screenshot\\amazon.jpg");
		//created object of file class
		

		Files.copy(src, desk);
		
		
		
	
	
	
	
	
	
	}
	

}
