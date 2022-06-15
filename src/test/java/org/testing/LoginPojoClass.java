package org.testing;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaseClass;

public class LoginPojoClass extends BaseClass{
	public LoginPojoClass() {
		PageFactory.initElements(driver,this);
	
	}
	
	@FindBy(id="email")
	private WebElement txtusr; 
	
	@FindBy(id="pass")
	private WebElement txtPass;
	
	@FindBy(xpath="//button[@name='login']")
	private WebElement btnLogin;
	
	@FindBy(xpath="//div[@class='_9ay7']")
	private WebElement errorMsg;
	
	

	public WebElement getErrorMsg() {
		return errorMsg;
	}

	public WebElement getTxtusr() {
		return txtusr;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	}


	
	

	
	

	
		

	
		
	
	


