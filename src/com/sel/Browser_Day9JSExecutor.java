package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Browser_Day9JSExecutor extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		browser();
		getUrl("https://www.amazon.in/");
		WebElement logo = driver.findElement(By.xpath("//div[@class='nav-logo-base nav-sprite']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", logo);
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-1000)");//up
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-1000)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-1000)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,1000)");//down
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
	}
	

}
