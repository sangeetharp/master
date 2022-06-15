package org.testng;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.utilities.BaseClass;
import org.utilities.GmailPojo;

public class GmailLogin extends BaseClass{
@BeforeTest
private void browselaunch() {
launchChrome();
loadUrl("https://accounts.google.com/signin");
}

@Test
private void tc1() throws InterruptedException {
	GmailPojo  g= new GmailPojo();
fill(g.getUsername(), "sangeetharamasamy");
Thread.sleep(2000);
btnClick(g.getNext());
fill(g.getPassword(), "12345678");
btnClick(g.getNext2());
}

}
