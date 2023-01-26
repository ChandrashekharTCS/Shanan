package TestNG_Pagefactory;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {
	Sheet sh;
	WebDriver driver;
	LoginPage1 l;
	HomePage1 h;
	
	@BeforeClass
	public void openBrowser() throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\CHANDRASHEKHAR\\Desktop\\Actitimmaven.xlsx");
		sh = WorkbookFactory.create(fis).getSheet("Sheet1");
		System.setProperty("webdriver.chrome.driver","E:\\software testing\\chromedriver_win32_3\\chromedriver.exe");
		driver=new ChromeDriver();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		//all objects we need to create
				l=new LoginPage1(driver);
				 h=new HomePage1(driver);
			}
			@BeforeMethod
			public void openApp() {
				String username = sh.getRow(0).getCell(0).getStringCellValue();
				l.enterUn(username);
				String password = sh.getRow(0).getCell(1).getStringCellValue();
				l.enterPwd(password);
				l.clickLoginBtn();
			}
			@Test
			public void verifyText() {
				Reporter.log("Running VerifyText",true);
				String expText = sh.getRow(0).getCell(2).getStringCellValue();
				String actText = h.verifyText();
			  Assert.assertEquals(expText,actText);
				
				
			}
			@AfterMethod
			public void logout() {
				Reporter.log("logout from app",true);
			}
			@AfterClass
			public void closeBrowser() {
				Reporter.log("close the browser",true);
			}

	

}
