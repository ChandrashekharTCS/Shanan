package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled {
	@Test
	public void TC1(){
		Reporter.log("it is my first program in testNG",true);
		
	}
	@Test(enabled = false)
	public void TC2(){
		Reporter.log("it is my second program in testNG",true);
		
		
	}
}
///if we want to skip/ignore test case then we use enabled = false 