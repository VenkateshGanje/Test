package com.dss.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FirstProject {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.gecko.driver","C:\\Java-Selenium\\DRIVERS\\geckodriver-v0.29.0-win64\\geckodriver.exe");
	
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com");
	String title = driver.getTitle();
	System.out.println("page title is " +title);
	Thread.sleep(3000);
	driver.quit();
	}

}
