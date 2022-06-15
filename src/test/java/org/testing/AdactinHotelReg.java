package org.testing;

import java.io.IOException;

import org.utilities.BaseClass;
import org.utilities.PojoHotel;

public class AdactinHotelReg extends BaseClass {
public static void main(String[] args) throws IOException, InterruptedException ,NullPointerException{
	launchChrome();
	loadUrl("https://adactinhotelapp.com/index.php");
	fullWindow();
	
	PojoHotel h = new PojoHotel();
	fill(h.getName(), getData(1,0));
	fill(h.getPass(), getData(1, 1));
	btnClick(h.getLogin());
	System.out.println("success");
	winMax();
	selectByIn(h.getLocation(), 2);
	selectByIn(h.getHotel(),2);
	h.getSubmitbtn().click();
	h.getButton().click();
	h.getContinuebtn().click();
	winMax();
	fill(h.getFirst(),getData(1, 4));
	fill(h.getLast(),getData(1, 5));
	fill(h.getAddress(),getData(1,6));
	fill(h.getCcno(), getData(1,12));
	selectByIn(h.getCctype(), 2);
	selectByIn(h.getCcmonth(),2);
	selectByIn(h.getCcyear(), 4);
	fill(h.getCvv(),getData(1, 15));
	h.getBook().click();
	Thread.sleep(10000);
	winMax();
	System.out.println("success");
String v = h.getOrderNo().getAttribute("value");

System.out.println("The order no is " +v );
	String val = "ordered No";
	addVAlueToExcelSheet(0, 16, val);
	
	addVAlueToExcelSheet(1, 16, v);
	System.out.println("success");
	System.out.println("The order no is " +v );
	
	
	
	
	
	
	
	
	
	
	

	
}
}
