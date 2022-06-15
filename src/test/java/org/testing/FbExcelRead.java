package org.testing;

import org.utilities.BaseClass;

public class FbExcelRead extends BaseClass{
public static void main(String[] args) throws Exception  {
	launchChrome();
	loadUrl("https://www.facebook.com/");
	fullWindow();
	
		LoginPojoClass l =new LoginPojoClass();
        fill(l.getTxtusr(), getData(1, 0 ));
		
		fill(l.getTxtPass(),getData(1, 1));
		
		btnClick(l.getBtnLogin());
		String t = l.getErrorMsg().getText();
		System.out.println("login status - "+t);
		System.out.println("success");
		addVAlueToExcelSheet(0, 2,"Login Status" );
		addVAlueToExcelSheet(1, 2, t);

}
}