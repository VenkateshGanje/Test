package com.dss.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailRegisterTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Java-Selenium\\DRIVERS\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		//driver.findElement(By.xpath("//a[@id='u_0_2_EV']")).click();
		////input[@id='u_12_b_Zf']
		driver.findElement(By.linkText("Create New Account")).click();
		WebElement ele = driver.findElement(By.xpath("//input[@id='u_12_b_Zf']"));
		//driver.switchTo().frame(ele);
		//ele.sendKeys("abc");
		int size = driver.findElements(By.tagName("iframe")).size();
		for(int i=0; i<=size; i++){
			driver.switchTo().frame(i);
			int total=driver.findElements(By.xpath("//input[@id='u_12_b_Zf']")).size();
			System.out.println(total);
			    driver.switchTo().defaultContent();}
		
		
	}

}
