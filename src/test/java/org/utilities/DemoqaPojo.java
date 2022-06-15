package org.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoqaPojo extends BaseClass {
	private DemoqaPojo() {
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(id="first-name")
	private WebElement FirstName;
	
	@FindBy(id="last-name")
	private WebElement LastName;
	
	@FindBy(id="email")
	private WebElement Email;
	
	@FindBy(id="mobile")
	private WebElement Mobile;
	
	@FindBy(className ="upcoming__registration--input")
	private WebElement Country;
	
	@FindBy(id="city")
	private WebElement City;
	
	@FindBy(id="message")
	private WebElement Message;
	
	}
