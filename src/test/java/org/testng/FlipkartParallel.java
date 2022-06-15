package org.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.utilities.BaseClass;
import org.utilities.FlipkartPojo;

public class FlipkartParallel extends BaseClass {
	
	@Parameters({"browser"})
	@Test
	private void tc1(String name) {
	if(name.equals("chrome")) {
		launchChrome();
			}
	
	else if(name.equals("ff")) {
		launchFirefox();
		
	}
	
	else {
		launchEdgeDriver();

	}
	loadUrl("https://www.flipkart.com/account/login");
	fullWindow();
	FlipkartPojo f = new FlipkartPojo();
	fill(f.getUsername(),"9342409813");
	fill(f.getPassword(),"passwotrd");
	btnClick(f.getClk());



		}}



