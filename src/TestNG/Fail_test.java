package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Fail_test {
	@Test
	public void TC1(){
		Reporter.log("it is my first program in testNG",true);
		
	}
	@Test
	public void TC2(){
		Reporter.log("it is my second program in testNG",true);
		Assert.fail();
		
	}

}
///using assert fail we do test case fail