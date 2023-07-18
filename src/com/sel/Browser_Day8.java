package com.sel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Browser_Day8 {
public static void main(String[] args) throws InterruptedException, AWTException {
System.setProperty("Webdriver.chrome.driver",
		"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.in/");
Thread.sleep(3000);
WebElement amazon = driver.findElement(By.xpath("(//a[@data-csa-c-type='link'])[5]"));
	Actions a = new Actions(driver);
	a.moveToElement(amazon);
	a.contextClick(amazon).perform();
	Thread.sleep(3000);
	
	Robot R = new Robot();
	R.keyPress(KeyEvent.VK_DOWN);
	R.keyRelease(KeyEvent.VK_DOWN);
	R.keyPress(KeyEvent.VK_ENTER);
	
	Thread.sleep(3000);
	
	WebElement amazonwindow = driver.findElement(By.xpath("(//a[@data-csa-c-type='link'])[6]"));
	Actions a1 = new Actions(driver);
	a1.moveToElement(amazonwindow);
	a1.contextClick(amazonwindow).perform();
	Thread.sleep(3000);
	
	Robot R1 = new Robot();
	R1.keyPress(KeyEvent.VK_DOWN);
	R1.keyRelease(KeyEvent.VK_DOWN);
	R1.keyPress(KeyEvent.VK_DOWN);
	R1.keyRelease(KeyEvent.VK_DOWN);
	
	R1.keyPress(KeyEvent.VK_ENTER);
	
	Thread.sleep(3000);
	
	WebElement amazonwindow1 = driver.findElement(By.xpath("(//a[@data-csa-c-type='link'])[7]"));
	Actions a2 = new Actions(driver);
	a2.moveToElement(amazonwindow1);
	a2.contextClick(amazonwindow1).perform();
	Thread.sleep(3000);
	
	Robot R2 = new Robot();
	R2.keyPress(KeyEvent.VK_DOWN);
	R2.keyRelease(KeyEvent.VK_DOWN);
	R2.keyPress(KeyEvent.VK_DOWN);
	R2.keyRelease(KeyEvent.VK_DOWN);
	
	R2.keyPress(KeyEvent.VK_ENTER);
	
	Thread.sleep(3000);
	
	
//	Thread.sleep(3000);
//	R.keyPress(KeyEvent.VK_DOWN);
//	R.keyRelease(KeyEvent.VK_DOWN);
//	Thread.sleep(3000);
//	R.keyPress(KeyEvent.VK_DOWN);
//	R.keyRelease(KeyEvent.VK_DOWN);
	
//	Thread.sleep(3000);
	
//	R.keyPress(KeyEvent.VK_UP);
//	R.keyRelease(KeyEvent.VK_UP);
//	Thread.sleep(3000);
//	R.keyPress(KeyEvent.VK_UP);
//	R.keyRelease(KeyEvent.VK_UP);
//	Thread.sleep(3000);
//	R.keyPress(KeyEvent.VK_UP);
//	R.keyRelease(KeyEvent.VK_UP);	
	

	
	
	
}

}
