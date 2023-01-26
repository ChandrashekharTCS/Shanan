package Assertion;

import static org.testng.Assert.assertTrue;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertTrue {
	@Test
	public void m2() {
		Reporter.log("Running m2",true);
		boolean actResult=true;
		assertTrue(actResult);
	}

}
