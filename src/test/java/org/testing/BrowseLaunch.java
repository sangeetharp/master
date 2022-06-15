package org.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.utilities.BaseClass;

public class BrowseLaunch extends BaseClass {
	
	
	public static void main(String[] args) {
	launchChrome();
	loadUrl("https://www.facebook.com/");
	fullWindow();
	printCurrentUrl();
	printTitle();
	WebElement txtusr = driver.findElement(By.id("email"));
	txtusr.sendKeys("praba");
	WebElement txtpass = driver.findElement(By.id("pass"));
	txtpass.sendKeys("tyutyty");
	WebElement btnlogin = driver.findElement(By.xpath("//button[@name='login']"));
	btnClick(btnlogin);
	driver.close();
	
	
	
		
		
	
	}

}
