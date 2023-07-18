package com.pompage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageThree {
	
public WebDriver driver;
	
@FindBy(xpath = "//input[@name='radiobutton_0']")	
private WebElement radiobutton;

@FindBy(xpath = "//input[@id='continue']")
private WebElement continueclick;

public PageThree(WebDriver driver2) {
	this.driver = driver2;
	PageFactory.initElements(driver2, this);
}

public WebElement getRadiobutton() {
	return radiobutton;
}

public WebElement getContinueclick() {
	return continueclick;
}


	
	

}
