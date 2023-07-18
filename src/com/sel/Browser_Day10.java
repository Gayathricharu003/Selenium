package com.sel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Browser_Day10 extends BaseClass {
	
	//Window Handling class
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		browser();
		getUrl("https://www.amazon.in/");
		WebElement mobile = driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_mobiles']"));
		Actions a = new Actions(driver);
		a.contextClick(mobile).perform();
		Thread.sleep(3000);
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		WebElement Todaydeals = driver.findElement(By.xpath("//a[@data-csa-c-type='link'][5]"));
		a.contextClick(Todaydeals).perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		
		WebElement Customerservice = driver.findElement(By.xpath("//a[@data-csa-c-type='link'][6]"));
		a.contextClick(Customerservice).perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		
		Set<String> windowHandles = driver.getWindowHandles();
		ArrayList<String>li = new ArrayList<>(windowHandles);
				
		driver.switchTo().window(li.get(0));
		//driver.switchTo().window(li.get(1));
		Thread.sleep(3000);
		driver.switchTo().window(li.get(3));
		Thread.sleep(3000);
		driver.switchTo().window(li.get(0));
		Thread.sleep(3000);
		
		String title = driver.switchTo().window(li.get(2)).getTitle();
		System.out.println(title);
					
		driver.close();
		//driver.quit();
		
	}

}
