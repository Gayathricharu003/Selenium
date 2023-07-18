package com.pompage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageTwo {
	
	

	public WebDriver driver;
	
	@FindBy(xpath = "//select[@id='location']")
	private WebElement selectLocation;
	
	@FindBy(xpath = "//select[@id='hotels']")
	private WebElement selectHotel;
	
	@FindBy(xpath = "//select[@id='room_type']")
	private WebElement selectRoom;
	
	@FindBy(xpath = "//select[@id='room_nos']")
	private WebElement noofRooms;
	
	@FindBy(xpath = "//select[@id='adult_room']")
	private WebElement AdultsperRooms;
	
	@FindBy(xpath = "//select[@id='child_room']")
	private WebElement ChildrensperRooms;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement search;
	
	public PageTwo(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSelectLocation() {
		return selectLocation;
	}

	public WebElement getSelectHotel() {
		return selectHotel;
	}

	public WebElement getSelectRoom() {
		return selectRoom;
	}

	public WebElement getNoofRooms() {
		return noofRooms;
	}

	public WebElement getAdultsperRooms() {
		return AdultsperRooms;
	}

	public WebElement getChildrensperRooms() {
		return ChildrensperRooms;
	}

	public WebElement getSearch() {
		return search;
	}

	
	
	

}
