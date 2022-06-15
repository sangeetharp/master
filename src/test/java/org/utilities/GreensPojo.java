package org.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GreensPojo extends BaseClass {
	public GreensPojo() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//a[text()='Certifications']")
	private WebElement certification;

	public WebElement getCertification() {
		return certification;
	}
     @FindBy(xpath="(//a[text()='Course Content'])[29]")
     private WebElement Selenium;

    public WebElement getSelenium() {
	return Selenium;
    }
    @FindBy(xpath="//p[contains(text(),'came')]")
    private WebElement para;

    public WebElement getPara() {
	return para;
	
}
    @FindBy(xpath="//a[text()='COURSES']")
    private WebElement courses;

	public WebElement getCarrer() {
		return carrer;
	}
	public WebElement getCourses() {
		return courses;
	}
	@FindBy(xpath="//a[text()='Java Training ']")
	 private WebElement java;
	public WebElement getJava() {
		return java;
	}
	public WebElement getCorejava() {
		return corejava;
	}

	@FindBy(xpath="//a[text()='Core Java Training']")
	 private WebElement corejava;

	@FindBy(xpath="//p[contains(text(),'I was looking out for institutions ')]")
	 private WebElement Review;
	
	@FindBy(xpath="//h2[contains(text(),'Anitha')]")
	 private WebElement anitha;
	
	@FindBy(xpath="//a[contains(text(),'CAREERS')]")
	 private WebElement carrer;
	
	public WebElement getEmail() {
		return email;
	}

	@FindBy(xpath="(//a[contains(text(),'@greens')])[8]")
	private WebElement email;
	
	public WebElement getCopyright() {
		return copyright;
	}

	@FindBy(className ="copyright")
	private WebElement copyright;

	public WebElement getAnitha() {
		return anitha;
	}
	public WebElement getReview() {
		return Review;
	}
}