package com.base;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public static  WebDriver driver;
	public   void browserLaunch(String Url) {
		
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get(Url);
	driver.manage().window().maximize();
	}
	

	
	public static WebElement FindElementmethod(String locatortype, String value) {
		if(locatortype.equals("id")) {
			WebElement user= driver.findElement(By.id("username"));
			return user;
		}
		else if(locatortype.equals("name")){
			WebElement pass= driver.findElement(By.name("password"));
		return pass;
		
		}
		WebElement findElement = driver.findElement(By.xpath(value));
		return null;
	}
	
	public  void clickloginbutton() {
		WebElement findElement = driver.findElement(By.id("login"));
	}



public static void enterText(WebElement element,String SendTokeys) {
	element.sendKeys(SendTokeys);
}
public  static void elementClick(WebElement element) {
	element.click();

}
public static void implicitwait(int Seconds) {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Seconds));
	
}
public static void pageloadTimeout(int Seconds) {
driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Seconds));
}
public static void close() {
	driver.close();
}
public static void Screenshot(String path,String name) {
	try {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		File desnfile = new File (path+name+".jpeg");
		FileUtils.copyFile(sourcefile, desnfile);
	}catch(Exception e) {
		
	}
	}
	
	
}