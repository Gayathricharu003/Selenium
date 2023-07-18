package com.pro;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Magneto extends Baseclass{
	public static void main(String[] args) throws InterruptedException {
		browser();
		getUrl("https://magento.softwaretestingboard.com/");
		
		WebElement imageclick = driver.findElement(By.xpath("//a[@title='Radiant Tee']"));
		imageclick.click();
		Thread.sleep(3000);
		WebElement size = driver.findElement(By.xpath("//div[@id='option-label-size-143-item-170']"));
		size.click();
		Thread.sleep(3000);
		WebElement color = driver.findElement(By.xpath("//div[@id='option-label-color-93-item-57']"));
		color.click();
		Thread.sleep(3000);
		WebElement Qty = driver.findElement(By.xpath("//input[@id='qty']"));
		Qty.clear();
		Thread.sleep(3000);
		WebElement Qty1 = driver.findElement(By.xpath("//input[@id='qty']"));
		Qty1.sendKeys("2");
		Thread.sleep(3000);
		WebElement button = driver.findElement(By.xpath("//button[@id='product-addtocart-button']"));
		button.click();
		Thread.sleep(3000);
		WebElement cartclick = driver.findElement(By.xpath("//a[@class='action showcart']"));
		cartclick.click();
		Thread.sleep(3000);
		WebElement proceed = driver.findElement(By.xpath("//button[@id='top-cart-btn-checkout']"));
		proceed.click();
		Thread.sleep(6000);
		
		WebElement mail = driver.findElement(By.xpath("(//input[@id='customer-email'])[1]"));
		mail.sendKeys("praveencharu105@gmail.com");
		Thread.sleep(3000);
		
		WebElement password = driver.findElement(By.xpath("//input[@id='customer-password']"));
		password.sendKeys("sukabramma@369");
		Thread.sleep(6000);
		
		WebElement login = driver.findElement(By.xpath("//button[@data-action='checkout-method-login']"));
		login.click();
		Thread.sleep(3000);
		
		WebElement copyright = driver.findElement(By.xpath("//small[@class='copyright']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", copyright);
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		
		
		WebElement next = driver.findElement(By.xpath("//button[@class='button action continue primary']"));
		Thread.sleep(3000);
		next.click();
		
		WebElement copyright1 = driver.findElement(By.xpath("//small[@class='copyright']"));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].scrollIntoView();", copyright1);
		js1.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		js1.executeScript("arguments[0].scrollIntoView();", copyright1);
		js1.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		
		WebElement placeorder = driver.findElement(By.xpath("//span[text()='Place Order']"));
		placeorder.click();
		Thread.sleep(3000);

		
		
	}
	
	
	
	
	

}
