package org.testng;

import org.utilities.BaseClass;

public class OpenQaPom extends BaseClass {
public static void main(String[] args) throws InterruptedException {
	launchChrome();
	loadUrl("https://www.toolsqa.com/selenium-training/#enroll-form");
	winMax();
}
}
