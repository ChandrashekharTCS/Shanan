package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation {
	@BeforeClass
	public void openBrowser() {
		Reporter.log("Open browser",true);
	}
	@BeforeMethod
	public void logintoapp() {
		Reporter.log("Login to app",true);
	}
	@Test
	public void verifytext() {
		Reporter.log("Running actual test case",true);
	}
	@AfterMethod
	public void logoutapp() {
		Reporter.log("Log out from app",true);
	}
	@AfterClass
	public void closeBrowser() {
		Reporter.log("Close the browser",true);
	}
	
}
//@before suite & @after suite is real in industry which is used to connect Database 