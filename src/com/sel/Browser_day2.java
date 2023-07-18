package com.sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Browser_day2 {
	
public static void main (String[]args) throws InterruptedException {
	System.setProperty("webdriver.Edge.driver",
			"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.co.uk/");
	Thread.sleep(3000);
	driver.get("https://www.facebook.com/login.php?login_attempt=1&display=popup");
	Thread.sleep(3000);
	driver.navigate().to("https://www.amazon.co.uk/");
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
