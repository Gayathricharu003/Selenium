package com.sel;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;

public class Browser_Day9 extends BaseClass{
	public static void main(String[] args) throws IOException {
		
		browser();
		getUrl("https://automationpanda.com/");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshot = ts.getScreenshotAs(OutputType.FILE);
		File Folder = new File("C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Screenshot\\autimation.png");
		Files.copy(screenshot, Folder);
		
		}
		
}
