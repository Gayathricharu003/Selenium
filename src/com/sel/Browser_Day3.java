package com.sel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Browser_Day3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
    //****** Simple Alert ******
	WebElement Alert = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
	Alert.click();
	Thread.sleep(3000);
	driver.switchTo().alert().accept();
	
	//****** Confirm Alert ******
	WebElement Alert1 = driver.findElement(By.xpath("//a[@href='#CancelTab']"));
	Alert1.click();
	Thread.sleep(3000);
	WebElement Alert2 = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
	Alert2.click();
	Thread.sleep(3000);
	driver.switchTo().alert().accept();
	
	//****** Prompt Alert ******
	WebElement Alert3 = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
	Alert3.click();
	Thread.sleep(3000);
	WebElement Alert4 = driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
	Alert4.click();
	driver.switchTo().alert().sendKeys("Gayathri!!!");
	driver.switchTo().alert().accept();
	Thread.sleep(3000);
			
	}
	}
