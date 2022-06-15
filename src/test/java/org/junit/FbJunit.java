package org.junit;

import org.testing.LoginPojoClass;
import org.utilities.BaseClass;

public class FbJunit extends BaseClass{
	@Before
public void launchchrome() {
	launchChrome();
	loadUrl("https://www.facebook.com/");
	fullWindow();
}

	
	  @Test
	public void fbClass() {
		  LoginPojoClass f = new LoginPojoClass();
		  fill(f.getTxtusr(), "anu kumar");
		  String ev = f.getTxtusr().getAttribute("value");
		  Assert.assertEquals("check user","anukumar", ev);
		  fill(f.getTxtPass(), "erytyioijkj");
		  btnClick(f.getBtnLogin());

	}
}
