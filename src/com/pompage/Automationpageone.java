package com.pompage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Automationpageone {
	public WebDriver driver;
	
	@FindBy(xpath = "(//a[@class='btn btn-default add-to-cart'])[9]")
	private WebElement viewproduct;

	

	public Automationpageone(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}
	
	
	

	public WebDriver getDriver() {
		return driver;
	}

		
	public WebElement getViewproduct() {
		return viewproduct;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
