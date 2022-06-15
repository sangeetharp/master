package org.testng;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.utilities.BaseClass;

public class FlipkartValidate extends BaseClass {
	@BeforeTest
	private void tc0() {
		launchChrome();
		loadUrl("https://www.flipkart.com/");
		winMax();
		

	}

	@Test
	private void tc1() {
		
		
		
	}
}

