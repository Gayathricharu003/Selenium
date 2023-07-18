package com.pompage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFive {
	public WebDriver driver;
	
	@FindBy(xpath = "//input[@id='logout']")
	private WebElement logOut;
	
	@FindBy(xpath = "//input[@id='my_itinerary']")
	private WebElement myItinenary;
	
	@FindBy(xpath = "//input[@id='search_hotel']")
	private WebElement searchHotel;
	
	@FindBy(xpath = "//td[@class='welcome_menu']")
	private WebElement border;

	public PageFive(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
		
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLogOut() {
		return logOut;
	}

	public WebElement getMyItinenary() {
		return myItinenary;
	}

	public WebElement getSearchHotel() {
		return searchHotel;
	}

	public WebElement getBorder() {
		return border;
	}
	
	
	
	
}
