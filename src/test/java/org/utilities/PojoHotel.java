package org.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoHotel extends BaseClass {
	public PojoHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "username")
	private WebElement name;

	@FindBy(name = "password")
	private WebElement pass;

	@FindBy(name = "login")
	private WebElement login;

	@FindBy(id = "location")
	private WebElement location;

	@FindBy(id = "hotels")
	private WebElement hotel;

	@FindBy(id = "room_type")
	private WebElement roomType;

	@FindBy(id = "room_nos")
	private WebElement roomNo;

	@FindBy(id = "datepick_in")
	private WebElement indate;

	@FindBy(id = "datepick_out")
	private WebElement outdate;

	@FindBy(id = "adult_room")
	private WebElement adultRoom;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getRoomNo() {
		return roomNo;
	}

	public WebElement getIndate() {
		return indate;
	}

	public WebElement getOutdate() {
		return outdate;
	}

	public WebElement getAdultRoom() {
		return adultRoom;
	}

	public WebElement getChildRoom() {
		return childRoom;
	}

	public WebElement getSubmitbtn() {
		return submitbtn;
	}

	@FindBy(id = "child_room")
	private WebElement childRoom;

	@FindBy(id = "Submit")
	private WebElement submitbtn;

	@FindBy(id = "continue")
	private WebElement continuebtn;

	public WebElement getContinuebtn() {
		return continuebtn;
	}

	@FindBy(id = "radiobutton_1")
	private WebElement button;
	@FindBy(id = "first_name")
	private WebElement first;

	@FindBy(id = "last_name")
	private WebElement last;

	public WebElement getBook() {
		return book;
	}

	@FindBy(id = "book_now")
	private WebElement book;

	public WebElement getFirst() {
		return first;
	}

	public WebElement getLast() {
		return last;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcno() {
		return ccno;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getCcmonth() {
		return ccmonth;
	}

	public WebElement getCcyear() {
		return ccyear;
	}

	@FindBy(id = "address")
	private WebElement address;

	@FindBy(id = "cc_num")
	private WebElement ccno;

	@FindBy(id = "cc_type")
	private WebElement cctype;

	@FindBy(id = "cc_cvv")
	private WebElement cvv;

	@FindBy(id = "cc_exp_month")
	private WebElement ccmonth;

	@FindBy(id = "cc_exp_year")
	private WebElement ccyear;
	
	@FindBy(xpath = "//input[@id='order_no']")
	private WebElement orderno;

	public WebElement getOrderNo() {
		return orderno;
	}

	public WebElement getButton() {
		return button;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogin() {
		return login;
	}
}
