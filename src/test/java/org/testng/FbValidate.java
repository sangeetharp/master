package org.testng;

import org.testing.LoginPojoClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.utilities.BaseClass;

public class FbValidate extends BaseClass {
	@BeforeTest
	private void tc0() {
		launchChrome();
		loadUrl("https://www.facebook.com/");
		winMax();
		

	}
	
	@Test
	private void tc1() {
		
		LoginPojoClass l = new LoginPojoClass();
		fill(l.getTxtusr(), "sangeetha");
		fill(l.getTxtPass(), "12345");
		//soft assert
		SoftAssert s=new SoftAssert();
		String t = driver.getTitle();
	s.assertTrue(t.endsWith("7up") ,"verify the tiltle");
	btnClick(l.getBtnLogin());
	System.out.println("success");
	System.out.println("success");
	

	}

}
