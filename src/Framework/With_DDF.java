package Framework;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class With_DDF {
	public static void main(String[] args) throws Throwable {
		FileInputStream file=new FileInputStream("C:\\Users\\CHANDRASHEKHAR\\Desktop\\actitime.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("sheet1");
		System.setProperty("webdriver.chrome.driver", "E:\\software testing\\chromedriver_win32_2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://demo.actitime.com/login.do");
		
		String un = sh.getRow(0).getCell(0).getStringCellValue();
		//user name
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(un);
		
		String pw = sh.getRow(0).getCell(1).getStringCellValue();
		//password
		
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(pw);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
	}

} 
