package org.testng;

import org.testng.annotations.Test;

public class SampleGrouping {

	
	@Test(groups={"smoke","regression"})
	private void tc33() {
		System.out.println("tc33");
	}
	
	
	@Test(groups="smokess")
	private void tc55() {
		System.out.println("tc55");

	}

}
