package org.junit;

import org.utilities.BaseClass;
import org.utilities.PojoHotel;

public class AdactinJunit extends BaseClass{
@Before
public void browselaunch() {
launchChrome();
loadUrl("https://adactinhotelapp.com/index.php");
fullWindow();
}
	
@Test
public void adactin() throws InterruptedException  {
PojoHotel h = new PojoHotel();
fill(h.getName(), "prabakaranio");
fill(h.getPass(), "12345qwerty");
btnClick(h.getLogin());
System.out.println("success");
winMax();
selectByIn(h.getLocation(), 2);
selectByIn(h.getHotel(),2);
h.getSubmitbtn().click();
h.getButton().click();
h.getContinuebtn().click();
winMax();
fill(h.getFirst(),"sangeetha");
fill(h.getLast(),"R");
fill(h.getAddress(),"abcd,abcde,abcdefghijk");
Thread.sleep(2000);
fill(h.getCcno(),"6734123412345678");
selectByIn(h.getCctype(), 2);
selectByIn(h.getCcmonth(),7);
selectByIn(h.getCcyear(), 12);
fill(h.getCvv(),"456");
winMax();
h.getBook().click();
winMax();
Thread.sleep(5000);
System.out.println("success");
//toGetAttribute(h.getOrderNo());
}
}
