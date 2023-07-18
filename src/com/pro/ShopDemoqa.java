package com.pro;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ShopDemoqa extends Baseclass  {
	public static void main(String[] args) throws InterruptedException {
		browser();
		getUrl("https://shop.demoqa.com/");
		driver.findElement(By.xpath("( //a[@href='https://shop.demoqa.com/product/black-cross-back-maxi-dress/'])[2]")).click();
		Thread.sleep(3000);
		WebElement selectcolour = driver.findElement(By.xpath("//select[@id='pa_color']"));
		Select color = new Select(selectcolour);
		Thread.sleep(3000);
		color.selectByValue("beige");
		
		WebElement selectsize = driver.findElement(By.xpath("//select[@id='pa_size']"));
		Select size = new Select(selectsize);
		size.selectByIndex(1);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[@class='cart-name-and-total']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@class='checkout-button button alt wc-forward wp-element-button']")).click();
		Thread.sleep(3000);
		
		WebElement firstName = driver.findElement(By.xpath("//input[@id='billing_first_name']"));
		firstName.sendKeys("Gayathri");
		
		WebElement lastName = driver.findElement(By.xpath("//input[@id='billing_last_name']"));
		lastName.sendKeys("Vadivel");
		
		//WebElement country = dThread.sleep(3000);river.findElement(By.xpath("//ul[@id='select2-billing_country-results']"));
		//Select con = new Select(country);
		//con.selectByVisibleText("India");
		
		WebElement doorNo = driver.findElement(By.xpath("//input[@id='billing_address_1']"));
		doorNo.sendKeys("N0-09,Ambal Nagar");
		
		WebElement Address = driver.findElement(By.xpath("//input[@id='billing_address_2']"));
		Address.sendKeys("porur");
		
		WebElement city = driver.findElement(By.xpath("//input[@id='billing_city']"));
		city.sendKeys("Chennai");
		
		//WebElement state = driver.findElement(By.xpath("//ul[@id='select2-billing_state-results']"));
		//Select st = new Select(state);
		//st.selectByVisibleText("Tamil Nadu");
		
		WebElement pincode = driver.findElement(By.xpath("//input[@id='billing_postcode']"));
		pincode.sendKeys("600116");
		
		WebElement phoneNo = driver.findElement(By.xpath("//input[@id='billing_phone']"));
		phoneNo.sendKeys("+918056261321");
		
		WebElement mailid = driver.findElement(By.xpath("//input[@id='billing_email']"));
		mailid.sendKeys("charu_praveen@yahoo.com");
		Thread.sleep(3000);
						
		WebElement additionalInf0 = driver.findElement(By.xpath("//textarea[@id='order_comments']"));
		additionalInf0.sendKeys("Handle with care");
		Thread.sleep(3000);
		
		WebElement logo = driver.findElement(By.xpath("//h4[text()='opening time']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", logo);
		js.executeScript("window.scrollBy(0,-1000)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-1000)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-1000)");
		Thread.sleep(3000);
		
		
		
		WebElement checkbox = driver.findElement(By.xpath("//span[text()='I have read and agree to the website ']"));
		checkbox.click();
		
		Thread.sleep(3000);
		WebElement placeorder = driver.findElement(By.xpath("(//button[@type='submit'])[4]"));
		placeorder.click();
		
		
		
		

		
		
		
	}

}
