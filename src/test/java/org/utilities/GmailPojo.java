package org.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailPojo extends BaseClass {
public GmailPojo () {
		PageFactory.initElements(driver,this);
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getNext() {
		return next;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getNext2() {
		return next2;
	}

	@FindBy(id="identifierId")
	private WebElement username;
	
	@FindBy(xpath="(//span[@class='VfPpkd-vQzf8d'])[2]")
	private WebElement next;
	
	@FindBy(className = "whsOnd zHQkBf")
	private WebElement password;
	
	@FindBy(className ="VfPpkd-vQzf8d")
	private WebElement next2;
}
