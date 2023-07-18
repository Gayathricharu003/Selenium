package com.sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser_FireFox {
	public static void main (String[]args) throws InterruptedException {
		System.setProperty("webdriver.Firefox.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.co.uk/");
		Thread.sleep(3000);
		driver.get("https://www.facebook.com/login.php?login_attempt=1&display=popup");
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
