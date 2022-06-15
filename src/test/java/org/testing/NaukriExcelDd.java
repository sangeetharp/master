package org.testing;


import org.utilities.BaseClass;
import org.utilities.NaukriPojo;

public class NaukriExcelDd extends BaseClass{
	public static void main(String[] args) throws  InterruptedException {
		launchChrome();
		loadUrl("https://my.naukri.com/account/register/basicdetails");
		fullWindow();
		
       implicitWaits(5);
		NaukriPojo e = new NaukriPojo();
		
		
		
		btnClick(e.getSubBtn());
		
		//System.out.println("login status - "+t);
		System.out.println("success");
		//addVAlueToExcelSheet(0, 2,"Login Status" );
		//addVAlueToExcelSheet(1, 2, t);

		
		
		
		
		
		
		
		
		
		
	}

}
