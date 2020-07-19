package com.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver Driver;//Driver is global variable//
	public WebDriver jaDriver() {
	System.setProperty("webdriver.chrome.driver", "./BrowserDriver/chromedriver.exe");
	Driver = new ChromeDriver();
	Driver.get("https://www.youtube.com");
	Driver.manage().window().maximize();
	Driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	return Driver;
	
	}
	
	
	//WebDriver is the return type, Driver is the variable//
	
/*public WebDriver driver; //webdrivere is selenium interface//
	
	public WebDriver getDriver () {
		
		System.setProperty("webdriver.chrome.driver", "./Browser/chromedriver.exe") ; 
		
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		return driver;*/
}
