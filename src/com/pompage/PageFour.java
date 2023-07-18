package com.pompage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFour {
	
	public WebDriver driver;
	
	public PageFour(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}
	
	@FindBy(xpath = "//input[@id='first_name']")
	private WebElement firstName;
	
	@FindBy(xpath = "//input[@id='last_name']")
    private WebElement lastName;
	
	@FindBy(xpath="//textarea[@id='address']")
	private WebElement billingAddress;
	
	@FindBy(xpath="//input[@id='cc_num']")
	private WebElement creditCardNo;
	
	@FindBy(xpath="//select[@id='cc_type']")
	private WebElement cardType;
	
	@FindBy(xpath="//select[@id='cc_exp_month']")
	private WebElement cardMonth;
	
	@FindBy(xpath="//select[@id='cc_exp_year']")
	private WebElement cardYear;
	
	@FindBy(xpath="//input[@id='cc_cvv']")
	private WebElement cvvNumber;
	
	@FindBy(xpath="//input[@id='book_now']")
	private WebElement bookNow;
	
	@FindBy(xpath="//input[@id='cancel']")
	private WebElement cancel;
	
	
		
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getBillingAddress() {
		return billingAddress;
	}

	public WebElement getCreditCardNo() {
		return creditCardNo;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getCardMonth() {
		return cardMonth;
	}

	public WebElement getCardYear() {
		return cardYear;
	}

	public WebElement getCvvNumber() {
		return cvvNumber;
	}

	public WebElement getBookNow() {
		return bookNow;
	}

	public WebElement getCancel() {
		return cancel;
	}
	
	
	
}
