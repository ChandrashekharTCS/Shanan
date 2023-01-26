package Assertion;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertFail {
	@Test
	public void TC1() {
		Reporter.log("running TC1",true);//verification 1
		Assert.fail();//intentionally TC1 is failed
		System.out.println("i am after failing TC1");//verification2
	}
	@Test
	public void TC2() {
		Reporter.log("running TC2",true);//verification 1
	}
	}