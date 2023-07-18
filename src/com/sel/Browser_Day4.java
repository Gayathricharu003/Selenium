package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Browser_Day4 {
public static void main(String[]args) throws InterruptedException {
	
	System.setProperty("webdrive.chrome.drive",
			"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	//WebElement drop1 = driver.findElement(By.xpath("//select[@class='col-lg-3']"));
	WebElement drop1 = driver.findElement(By.xpath("//select[@id='first']"));
	Select s = new Select(drop1);
	s.selectByValue("Google");
	
	//WebElement drop2 = driver.findElement(By.xpath("(//select[@class='col-lg-3'])[2]"));
	WebElement drop2 = driver.findElement(By.xpath("//select[@id='animals']"));
	Select s1 = new Select(drop2);
	//s1.selectByIndex(1);
	s1.selectByVisibleText("Baby Cat");
	Thread.sleep(3000);
	
	
	
}
}
