package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Day6 {
public static void main(String[] args) throws InterruptedException{
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Frames.html");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	//WebElement Frame = driver.findElement(By.id("singleframe"));
	driver.switchTo().frame("SingleFrame");
	
	WebElement Textbox = driver.findElement(By.xpath("(//input[@type='text'])"));
	Textbox.sendKeys("Hi Gayathri");
	driver.switchTo().defaultContent();
	
	Thread.sleep(3000);
	WebElement Frame1 = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
	Frame1.click();
	Thread.sleep(3000);
	
	WebElement Frame2 = driver.findElement(By.xpath("//iframe[@style='float: left;height: 300px;width:600px']"));
	driver.switchTo().frame(Frame2);
	
	WebElement Frame3 = driver.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));
	driver.switchTo().frame(Frame3);
	
	WebElement Textbox1 = driver.findElement(By.xpath("(//input[@type='text'])"));
	Textbox1.sendKeys("Welcome Gayathri");
	

}
}
