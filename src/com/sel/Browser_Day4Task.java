package com.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Browser_Day4Task {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	WebElement Singledrop = driver.findElement(By.xpath("(//select[@class='col-lg-3'])[1]"));
	Select S = new Select(Singledrop);
	S.selectByIndex(3);
	Thread.sleep(3000);
	
	WebElement Singledrop1 = driver.findElement(By.xpath("(//select[@class='col-lg-3'])[2]"));
	Select S1 = new Select(Singledrop1);
    S1.selectByValue("big baby cat");
	Thread.sleep(3000);
	
	WebElement Multipledrop =driver.findElement(By.xpath("(//select[@class='col-lg-3'])[3]"));
	Select md = new Select(Multipledrop);
	//boolean m = md.isMultiple();
    //System.out.println(m);
    
    md.selectByIndex(1);
    md.selectByIndex(3);
    
    List<WebElement> options = md.getOptions();
	for (WebElement alldata : options) {
    System.out.println(alldata.getText());
	}
	
	System.out.println("Selected options");
	List<WebElement> allSelectedOptions = md.getAllSelectedOptions();
	for (WebElement s11 : allSelectedOptions) {
		System.out.println(s11.getText());
	}
	}

}
