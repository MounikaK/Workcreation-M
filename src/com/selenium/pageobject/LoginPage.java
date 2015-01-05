package com.selenium.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
private static WebElement element = null;

public static WebDriver LoadPage(WebDriver driver){
	driver.get("http://192.168.1.124:85");
	return driver;
}
public static WebElement txt_LoginName(WebDriver driver){
	element = driver.findElement(By.xpath("//input[@id='txtUsername']"));
	return element;
}
public static WebElement txt_Password(WebDriver driver){
	element = driver.findElement(By.xpath("//input[@id='txtPassword']"));
	return element;
}

public static WebElement btn_Login(WebDriver driver){
	element = driver.findElement(By.xpath("//button[text()='Login']"));
	return element;
}


}
