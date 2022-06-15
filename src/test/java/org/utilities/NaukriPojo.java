package org.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NaukriPojo {
	
	@FindBy(id="name")
	private WebElement Name;
	
	
	
	@FindBy(id="email")
	private WebElement email; 
	
	public WebElement getName() {
		return Name;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return Pass;
	}

	public WebElement getMblNo() {
		return mblNo;
	}

	public WebElement getFresher() {
		return fresher;
	}

	public WebElement getSubBtn() {
		return subBtn;
	}

	@FindBy(id="password")
	private WebElement Pass;
	
	@FindBy(id="mobile")
	private WebElement mblNo; 
	
	@FindBy(xpath="//div[@class='focusable option wrap']")
	private WebElement fresher; 
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement subBtn; 
	
	
	
	
	

}
