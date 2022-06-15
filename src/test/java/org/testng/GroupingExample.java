package org.testng;


import org.testing.LoginPojoClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.utilities.BaseClass;


public class GroupingExample extends BaseClass {
	@BeforeClass(enabled=false)
	private void browserLaunch() {
	System.out.println("before");

		}

@Test(enabled=false)
private void tc1() {
System.out.println("tc1");


}
@Test(dataProvider = "fbval",dataProviderClass = DataProClass.class)
private void tc2(String s1,String s2) throws InterruptedException {
	launchChrome();
	loadUrl("https://www.facebook.com/");
	fullWindow();
	
LoginPojoClass l =new LoginPojoClass();
	fill(l.getTxtusr(),s1);
	fill(l.getTxtPass(),s2);
	

System.out.println("tc2");
}
@Test(enabled=false)
private void tc3() {
	System.out.println("tc3");

}
@Test(enabled=false)
private void tc4() {
	System.out.println("tc4");
}
@Test(enabled=false)
private void tc5() {
	System.out.println("tc5");
	}
@AfterClass(enabled=false)
private void tc22() {
System.out.println("tc22end");
}

}
