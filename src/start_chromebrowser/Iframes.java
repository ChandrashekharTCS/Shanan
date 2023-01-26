package start_chromebrowser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\software testing\\chromedriver_win32_2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.switchTo().frame("packageListFrame");//switch on 1st iframe
		String t1 = driver.findElement(By.xpath("//h2[text()='Packages']")).getText();
		System.out.println(t1);
		driver.switchTo().defaultContent();//switch default webiframe
		driver.switchTo().frame("packageFrame");//switch on 2nd iframe
		String t2 = driver.findElement(By.xpath("//a[text()='FindAll']")).getText();
		System.out.println(t2);
		driver.switchTo().defaultContent();//switch default webiframe
		driver.switchTo().frame("classFrame");//switch on 3rd iframe
		String t3 = driver.findElement(By.xpath("//a[text()='Alert']")).getText();
		System.out.println(t3);
		
	}

}
