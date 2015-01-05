package com.selenium.common;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Saveok {
	private static WebElement element=null;
	
	@SuppressWarnings("deprecation")
	public static WebElement save_button(WebDriver driver){
		element= driver.findElement(By.xpath("//button[contains(text(),'Save')]"));
		element.click();
		try{
	    	WebDriverWait Wait = new WebDriverWait(driver,20);
	    	Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='ext-mb-text']")));
	    	
	      	WebElement r = driver.findElement(By.xpath("//span[contains(text(),'Work details has been saved successfully')]"));
		    String str= r.getText();
		    System.out.println(str);
		    Assert.assertEquals("Work details has been saved successfully",str);
	    }
	    catch (Exception e){
	    	System.out.println("Failed" +e.getMessage());
	    }	    	
		return element;
		}
	public static WebElement ok_button(WebDriver driver){
		element= driver.findElement(By.xpath("//td/em/button[contains(text(),'OK')]"));
		element.click();
		return element;
}
	public static WebElement close_button(WebDriver driver){
		element= driver.findElement(By.xpath("//button[contains(text(),'Close')]"));
		element.click();
		return element;
		
	}
	}

