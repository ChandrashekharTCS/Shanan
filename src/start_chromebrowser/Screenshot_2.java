package start_chromebrowser;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot_2 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "E:\\\\software testing\\\\chromedriver_win32_2\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement abc = driver.findElement(By.xpath("//img[@class='lnXdpd']"));
		//take screenshot by xpath
		
		File src = abc.getScreenshotAs(OutputType.FILE);
		//used getScreenshot method
		
		File dest=new File("C:\\Users\\CHANDRASHEKHAR\\Desktop\\screenshot\\google2.png");
		
		
		Files.copy(src, dest);
		
		
	}

}
