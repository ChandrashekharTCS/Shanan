package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Invocation {
	@Test(invocationCount = 8)
	public void TC1() {
		Reporter.log("Running TC1",true);
	}

}
///it is used to avoid repetation of code & helps to count all test cases
//some time we need to execute multiple times then it is possible by invocation count