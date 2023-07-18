package com.pro;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.pompage.Automationpageone;

public class Automationexcercise extends Baseclass{
	public static void main(String[] args) throws InterruptedException {
		browser();
		getUrl("https://automationexercise.com/");
			
		
		WebElement logo = driver.findElement(By.xpath("//img[@alt='Website for automation practice']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", logo);
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//img[@src='/get_product_picture/13']"));
			
		WebElement addCart = driver.findElement(By.xpath("(//a[@data-product-id='13'])[1]"));
		Thread.sleep(3000);
		addCart.click();
		Thread.sleep(3000);
					
		WebElement viewcart = driver.findElement(By.xpath("//u[text()='View Cart']"));
		viewcart.click();
		Thread.sleep(3000);
		
		WebElement proccedtoCheckout = driver.findElement(By.xpath("//a[text()='Proceed To Checkout']"));
		proccedtoCheckout.click();
		Thread.sleep(3000);
		
		WebElement login = driver.findElement(By.xpath("//u[text()='Register / Login']"));
		login.click();
		Thread.sleep(3000);
		
		WebElement email = driver.findElement(By.xpath("(//input[@type='email'])[1]"));
		email.sendKeys("charu_praveen@yahoo.com");
		Thread.sleep(3000);
		
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		Thread.sleep(3000);
		password.sendKeys("love@369");
		Thread.sleep(3000);
		
		WebElement maillogin = driver.findElement(By.xpath("//button[@type='submit']"));
		maillogin.click();
		Thread.sleep(3000);
		
	}

}
