package org.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.utilities.BaseClass;
public class CrossBrowse extends BaseClass {
	
	

@Parameters({"browser"})
@Test
private void tc1(String name) {
if(name.equals("chrome")) {
	launchChrome();
		}

else {
	launchFirefox();
	
}
loadUrl(" http://www.greenstechnologys.com/");
fullWindow();



	}}
