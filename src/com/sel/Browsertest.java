package com.sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsertest {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.co.uk/");
		Thread.sleep(3000);
		driver.get("http://www.greenstechnologys.com/");
		Thread.sleep(3000);
		driver.get(" http://gmail.com/");
		Thread.sleep(3000);
		driver.get("http://greenstech.in/selenium-course-content.html");	
		Thread.sleep(3000);
		driver.get("http://www.flipkart.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		String title=driver.getTitle();
		System.out.println(title);
		driver.quit();
		
}
}
