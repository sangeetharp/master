package org.testng;

import org.testng.annotations.Test;
import org.utilities.BaseClass;

public class ChromeReport extends BaseClass{
	@Test
	private void tc1() {
		launchChrome();
		loadUrl(" http://www.greenstechnologys.com/");
		fullWindow();

	}
	

}
