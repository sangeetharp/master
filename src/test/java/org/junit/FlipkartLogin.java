package org.junit;

import org.utilities.BaseClass;
import org.utilities.FlipkartPojo;

public class FlipkartLogin extends BaseClass{
	@Before
	public void browserlaunch() {
		launchChrome();
		loadUrl("https://www.flipkart.com/");
		winMax();
	}
	@Test
	public void flipkartLogin() {
	FlipkartPojo f = new FlipkartPojo();
	f.getCllose().click();
	btnClick(f.getLoginbuton());
	System.out.println("success");
	fill(f.getUsername(), "9342409813");
	fill(f.getPassword(),"Passwotrd");
	btnClick(f.getClk());
    f.getGrocery().click();
	}
}