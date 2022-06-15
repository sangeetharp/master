package org.testng;


import java.io.IOException;

import org.testing.LoginPojoClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.utilities.BaseClass;

public class SampleTestng extends BaseClass {

	@BeforeClass
	private void browserLaunch() {launchChrome();
	loadUrl("https://www.facebook.com/");
	fullWindow();

		}
	@Parameters({"hoc","cri"})
	@Test
	private void fbLoad(String s1,String s2) throws IOException {
		LoginPojoClass l =new LoginPojoClass();
		fill(l.getTxtusr(),s1);
		fill(l.getTxtPass(),s2);
		btnClick(l.getBtnLogin());
		
	}

	@Test
	private void fbLog() {
		System.out.println("success");
		}
}
