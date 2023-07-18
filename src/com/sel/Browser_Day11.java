package com.sel;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

    public class Browser_Day11 extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		browser();
		getUrl("https://www.w3schools.com/html/html_tables.asp");
		List<WebElement> allData = driver.findElements(By.xpath("//table[@id='customers']"));
	    
		for (WebElement all : allData) {
			System.out.println(all.getText());
			}
		Thread.sleep(3000);
		
		System.err.println("----->PerRow<-----");
		
		List<WebElement> perRow = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[5]"));
			for (WebElement row : perRow) {
			System.out.println(row.getText());
			}
		Thread.sleep(3000);
		
		System.err.println("----->PerData<-----");
		
		WebElement perData = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[6]/td[3]"));
		System.out.println(perData.getText());
		Thread.sleep(3000);
		
		System.err.println("----->Percol<-----");
		
		List<WebElement> Percol = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[3]"));
		for (WebElement col : Percol) {
			System.out.println(col.getText());
				
		}
				
	}
}
