package org.testing;

import java.io.IOException;

import org.utilities.BaseClass;
import org.utilities.PojoHotel;

public class Hotel extends BaseClass{
public static void main(String[] args) throws IOException{
	launchChrome();
	loadUrl("http://adactinhotelapp.com/");
	fullWindow();
	PojoHotel p = new PojoHotel();
	fill(p.getName(), getData(1, 0));
	fill(p.getPass(), getData(1, 1));
	btnClick(p.getLogin());
	System.out.println("success");
}
}
