package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Timeout {
	@Test
	public void TC1(){
		Reporter.log("it is my first program in testNG",true);
		
	}
	@Test(timeOut = 60000)
	public void TC2(){
		Reporter.log("it is my second program in testNG",true);
		
		
	}
}
//if one of test case is taking to much time for excecution,in such 
//case we will go through timeout 