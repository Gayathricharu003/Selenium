package com.pro;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Estore_Onesoftway extends Baseclass {
	
	public static void main(String[] args) throws InterruptedException {
		
		browser();
		getUrl("https://estore.onesoftway.com/");
					
		WebElement logo = driver.findElement(By.xpath("//img[@alt='Nop Pavilion Responsive Theme']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", logo);
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		
		WebElement Alert = driver.findElement(By.xpath("//button[@id='eu-cookie-ok']"));
		Alert.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[text()='Casual handbag'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='add-to-cart-button-23']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@href='/cart'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='termsofservice']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='BillingNewAddress_FirstName']")).sendKeys("Gayathri");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='BillingNewAddress_LastName']")).sendKeys("Vadivel");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='BillingNewAddress_Email']")).sendKeys("charu_praveen@yahoo.com");
		Thread.sleep(3000);
		WebElement CountryId = driver.findElement(By.xpath("//select[@id='BillingNewAddress_CountryId']"));
		Select id = new Select(CountryId);
		id.selectByIndex(3);
		Thread.sleep(3000);
		WebElement StateProvinceId = driver.findElement(By.xpath("//select[@id='BillingNewAddress_StateProvinceId']"));
		Select id1 = new Select(StateProvinceId);
		id1.selectByIndex(1);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='BillingNewAddress_City']")).sendKeys("Chennai");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='BillingNewAddress_Address1']")).sendKeys("03, Gangai street, Porur");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']")).sendKeys("600116");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='BillingNewAddress_PhoneNumber']")).sendKeys("+917894561239");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='button-1 select-shipping-address-button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='button-1 shipping-method-next-step-button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@name='nextstep']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='button-1 payment-info-next-step-button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='button-1 confirm-order-next-step-button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='button-1 order-completed-continue-button']")).click();
		Thread.sleep(3000);
		
		
	}
	
	
	
	
	

}
