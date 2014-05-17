package org;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Gaaaaa {

	FirefoxDriver driver = new FirefoxDriver();
	@Test
	public void thisIsFirstTest(){
		System.out.println("Before opening the ");
		driver.get("https://www.google.co.in/");
		driver.quit();
		System.out.println("After closing the browser");
		
		
	}