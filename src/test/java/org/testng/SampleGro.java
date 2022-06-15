package org.testng;

import org.testing.LoginPojoClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.utilities.BaseClass;

public class SampleGro extends BaseClass{
	@BeforeTest
	private void BrowseLau() throws InterruptedException {
		launchChrome();
		loadUrl("https://www.facebook.com/");
		fullWindow();
		
	
		
	}
	
	
	
		@Test(groups="have",invocationCount = 20)
	private void tc5() throws InterruptedException {
		
	LoginPojoClass l =new LoginPojoClass();
		fill(l.getTxtusr(),"prabakaran Gurunathan");
		
		fill(l.getTxtPass(),"199090");
		
		System.out.println("success");
	btnClick(l.getBtnLogin());
		
	}
		
	@AfterTest
	private void exitTheTab() {
closeABrowser();
	}

	

}
