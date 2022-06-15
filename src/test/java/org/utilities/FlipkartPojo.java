package org.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartPojo extends BaseClass  {
	public FlipkartPojo(){
PageFactory.initElements(driver, this);
}
	@FindBy(xpath ="//button[@class='_2KpZ6l _2doB4z']")
	private WebElement cllose;
	public WebElement getCllose() {
		return cllose;
	}
	public WebElement getLoginbuton() {
		return loginbuton;
	}
	public WebElement getUsername() {
		return username;
	}
	public WebElement getGrocery() {
		return grocery;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getClk() {
		return clk;
	}
	@FindBy(xpath="//a[@class='_1_3w1N']")
	private WebElement loginbuton;
	@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
	private WebElement username;
	@FindBy(xpath="//input[@class='_2IX_2- _3mctLh VJZDxU']")
	private WebElement password;
	@FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	private WebElement clk;
	@FindBy(xpath="(//div[@class='xtXmba'])[2]")
	private WebElement grocery;


}
	