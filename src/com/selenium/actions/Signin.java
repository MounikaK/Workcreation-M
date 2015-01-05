package com.selenium.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.selenium.pageobject.LoginPage;

public class Signin {
	public static WebDriver Execute(WebDriver driver,String username,String password){
		
		  LoginPage.LoadPage(driver);  
		  driver.manage().window().maximize();
		  driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(username);
		  driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
		  driver.findElement(By.xpath("//button[text()='Login']")).click(); 
		  
	return driver;
	}

	
}