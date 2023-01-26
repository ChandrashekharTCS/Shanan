package Assertion;

import static org.testng.Assert.assertEquals;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertEqual {
	@Test
	public void m1() {
		Reporter.log("Running m1",true);
		String expT="hii";
		String actT="hii";
		assertEquals(expT, actT);
	}
	

}
