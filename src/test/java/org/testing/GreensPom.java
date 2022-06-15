package org.testing;

import java.io.IOException;

import org.utilities.BaseClass;
import org.utilities.GreensPojo;

public class GreensPom extends BaseClass {
	public static void main(String[] args)throws IOException, InterruptedException {
		
	
	launchChrome();
	loadUrl("http://www.greenstechnologys.com/");
	fullWindow();
	GreensPojo g=new GreensPojo();
	btnClick(g.getCertification());
	btnClick(g.getSelenium());
    toGetText(g.getPara());
    moveTheMouse(g.getCourses());
    moveTheMouse(g.getJava());
    g.getCorejava().click();
    toGetText(g.getAnitha());
    toGetText(g.getReview());
    //to get email
    btnClick(g.getCarrer());
    toGetText(g.getEmail());
    //to get copyright
    toGetText(g.getCopyright());
   
	}
}