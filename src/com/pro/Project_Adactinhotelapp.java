package com.pro;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.pompage.PageFive;
import com.pompage.PageFour;
import com.pompage.PageOne;
import com.pompage.PageThree;
import com.pompage.PageTwo;

public class Project_Adactinhotelapp extends Baseclass {
	public static void main(String[] args) throws InterruptedException {
		browser();
		getUrl("http://adactinhotelapp.com/index.php");

		PageOne p1 = new PageOne(driver);
		p1.getUserName().sendKeys("71712000");
		p1.getPassword().sendKeys("suka@963");
		Thread.sleep(3000);
		p1.getLogin().click();
		
		PageTwo p2 = new PageTwo(driver);
		p2.getSelectLocation();
		Select location = new Select(p2.getSelectLocation());
		location.selectByValue("London");
		Thread.sleep(3000);
		
		p2.getSelectHotel();
		Select hotel = new Select (p2.getSelectHotel());
		hotel.selectByIndex(2);
		Thread.sleep(3000);
		
		p2.getSelectRoom();
		Select room = new Select (p2.getSelectRoom());
		room.selectByValue("Super Deluxe");
		Thread.sleep(3000);
		
		p2.getNoofRooms();
		Select noofroom = new Select(p2.getNoofRooms());
		noofroom.selectByValue("3");
		Thread.sleep(3000);
		
		p2.getAdultsperRooms();
		Select adultRoom = new Select(p2.getAdultsperRooms());
		adultRoom.selectByVisibleText("2 - Two");
		Thread.sleep(3000);
		
		p2.getChildrensperRooms();
		Select childrensroom = new Select(p2.getChildrensperRooms());
		childrensroom.selectByValue("3");
		Thread.sleep(3000);
		
		p2.getSearch().click();
		Thread.sleep(3000);
		
		PageThree p3 = new PageThree(driver);
		p3.getRadiobutton().click();
		Thread.sleep(3000);
		p3.getContinueclick().click();
		
		PageFour p4 = new PageFour(driver);
		p4.getFirstName().sendKeys("Gayathri");
		Thread.sleep(3000);
		p4.getLastName().sendKeys("Vadivel");
		Thread.sleep(3000);
		p4.getBillingAddress().sendKeys("109,Gangai Street Porur");
		Thread.sleep(3000);
		p4.getCreditCardNo().sendKeys("9632587417896543");
		Thread.sleep(3000);
		p4.getCardType();
		Select card = new Select(p4.getCardType());
		card.selectByIndex(1);
		Thread.sleep(3000);
		p4.getCardMonth();
		Select mon = new Select(p4.getCardMonth());
		mon.selectByIndex(10);
		Thread.sleep(3000);
		p4.getCardYear();
		Select yr = new Select(p4.getCardYear());
		yr.selectByValue("2026");
		Thread.sleep(3000);
		p4.getCvvNumber().sendKeys("654");
		Thread.sleep(3000);
		p4.getBookNow().click();
		Thread.sleep(3000);
					
		
	    PageFive p5 = new PageFive(driver);
	    p5.getBorder();
	    JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",  p5.getBorder());
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		p5.getLogOut().click();

	    	
		}
	
	    
	
	
	
	
	
	
}
