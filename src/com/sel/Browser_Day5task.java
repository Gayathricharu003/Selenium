package com.sel;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Browser_Day5task {
	
public static void main(String[] args) throws InterruptedException {
	System.setProperty("Webdriver.chrome.driver", ":\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	WebElement Mdrop1 = driver.findElement(By.xpath("(//select[@class='col-lg-3'])[3]"));
	Select s = new Select(Mdrop1);

	Boolean Mdrop2 = s.isMultiple();
	System.out.println(Mdrop2);
	
	List<WebElement> options = s.getOptions();
    for (WebElement alldata : options) {
    	System.out.println(alldata.getText());
		}
    
    s.selectByIndex(0);
    s.selectByVisibleText("Burger");
    s.selectByValue("bonda");
    
    List<WebElement> AllSelectedOptions = s.getAllSelectedOptions();
    for (WebElement Selecteddata : AllSelectedOptions) {
    	System.out.println(Selecteddata.getText());	
		}
}
}


