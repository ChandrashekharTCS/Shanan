package Assertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertAssertion {
	@Test
	public void TC1() {
		String s1="hii";
		String s2="hii";
		SoftAssert s=new SoftAssert();
		s.assertEquals(s1, s2);
		System.out.println("i am after failing the TC1");
		//we need to write mandatorilly
		s.assertAll();
		
		
		
}
}