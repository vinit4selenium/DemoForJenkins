package org.vinit.sampleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GmailTestForFailing {

	FirefoxDriver driver = new FirefoxDriver();
	@Test
	public void thisIsFirstTest(){
		System.out.println("Before opening the ");
		driver.get("https://www.google.co.in/");
		//driver.findElement(By.xpath("sdasdasd"));
		driver.quit();
		System.out.println("After closing the browser");
		
		
	}	}