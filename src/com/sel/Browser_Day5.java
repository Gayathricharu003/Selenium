package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Browser_Day5 {
public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
				
		WebElement Boxclick = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	    Thread.sleep(3000);
	    Boxclick.click();
	  
	    Thread.sleep(3000);
	    
	    WebElement Firstname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	    Thread.sleep(3000);
	    Firstname.sendKeys("Gayathri");
	    
	    Thread.sleep(3000);
	    	    
	    WebElement Lastname = driver.findElement(By.xpath("(//input[@name='lastname'])"));
	    Thread.sleep(3000);
	    Lastname.sendKeys("Ramalingam");

	    Thread.sleep(3000);
	    
	    WebElement Emailid =  driver.findElement(By.xpath("(//input[@type='text'])[4]"));
	    Thread.sleep(3000);
	    Emailid.sendKeys("Gayu@gmail.com");
	    
	    Thread.sleep(3000);
	    
	    WebElement ReEmailid =  driver.findElement(By.xpath("(//input[@type='text'])[5]"));
	    Thread.sleep(3000);
	    ReEmailid.sendKeys("Gayu@gmail.com");
	    
	    Thread.sleep(3000);
	    
	    WebElement Password = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
	    Thread.sleep(3000);
	    Password.sendKeys("Ade@123!");
	    
	    Thread.sleep(3000);
	    
	    WebElement date = driver.findElement(By.xpath("(//select[@aria-label='Day'])"));
	    Select S = new Select(date);
	    S.selectByValue("3");
	    Thread.sleep(3000);
	    
	    WebElement Month = driver.findElement(By.xpath("(//select[@aria-label='Month'])"));
	    Select S1 = new Select(Month);
	    S1.selectByIndex(5);
	    Thread.sleep(3000);
	    
	    WebElement Year = driver.findElement(By.xpath("(//select[@aria-label='Year'])"));
	    Select S2 = new Select(Year);
	    S2.selectByVisibleText("2016");
	    Thread.sleep(3000);
	    
		WebElement Gender = driver.findElement(By.xpath("(//label[@class='_58mt'])[1]"));
	    Thread.sleep(3000);
	    Gender.click();
	    
	    Thread.sleep(3000);
	    WebElement Submit = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	    Thread.sleep(3000);
	    Submit.click();
	    
	    Thread.sleep(3000);
	    
	    
}


}
