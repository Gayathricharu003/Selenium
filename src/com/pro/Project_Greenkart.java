package com.pro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Project_Greenkart extends Baseclass {
	
	public static void main(String[] args) throws InterruptedException {
		
		browser();
		getUrl("https://rahulshettyacademy.com/seleniumPractise/#/");
		
				
		WebElement searchbox = driver.findElement(By.xpath("//input[@placeholder='Search for Vegetables and Fruits']"));
		searchbox.sendKeys("Beetroot");
		Thread.sleep(3000);
		
		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
		Thread.sleep(3000);
		
		WebElement Addcart = driver.findElement(By.xpath("//button[text()='ADD TO CART']"));
		Addcart.click();
		Thread.sleep(3000);
		
		WebElement cart = driver.findElement(By.xpath("//img[@alt='Cart']"));
		cart.click();
		Thread.sleep(3000);
		
		WebElement checkout = driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']"));
		checkout.click();
		Thread.sleep(3000);
		
		WebElement placeorder = driver.findElement(By.xpath("//button[text()='Place Order']"));
		placeorder.click();
		Thread.sleep(3000);
		
		WebElement selectlocation = driver.findElement(By.xpath("//select[@style='width: 200px;']"));
		Select s = new Select (selectlocation);
		s.selectByVisibleText("India");
		Thread.sleep(3000);
		
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		checkbox.click();
		Thread.sleep(3000);
		
		WebElement Proceed = driver.findElement(By.xpath("//button[text()='Proceed']"));
		Proceed.click();
		Thread.sleep(3000);
		
		
		
		
	}
	

}
