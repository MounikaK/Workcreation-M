package com.selenium.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Workcreation_Ele {
	private static WebElement element=null;
	
	public static WebElement txtwork_name(WebDriver driver) {
		element=driver.findElement(By.xpath("//input[@id='workCreationuserWindow_txtWorkName']"));		
			 return element;
		}
	public static WebElement dropwork_type(WebDriver driver){
		element= driver.findElement(By.xpath("//div[@class='x-combo-list-inner']/div[contains(text(),'shop')]"));
		element.click();
		return element;
	}	
	public static WebElement dropSanctioned_By(WebDriver driver){
		element= driver.findElement(By.xpath("//div[@class='x-combo-list-inner']/div[contains(text(),'Nirmala  N')]"));
		element.click();
		return element;
	}	
	public static WebElement dropSanctionedAuthority_Designation(WebDriver driver){
		element= driver.findElement(By.xpath("//div[@class='x-combo-list-inner']/div[contains(text(),'Marketing Supervisor Grade-2')]"));
		element.click();
		return element;
	}	
	public static WebElement dropScheme_under(WebDriver driver){
		element= driver.findElement(By.xpath("//div[@class='x-combo-list-inner']/div[contains(text(),'APMC')]"));
		element.click();
		return element;
	}	
	public static WebElement txtwork_Value(WebDriver driver){
		element= driver.findElement(By.xpath("//input[@id='workCreationuserWindow_txtWorkValue']"));
		return element;
	}
	public static WebElement dropEngineer_name(WebDriver driver){
		element= driver.findElement(By.xpath("//div[@class='x-combo-list-inner']/div[contains(text(),'AEE-Bidar')]"));
		element.click();
		return element;
	}	
	public static WebElement txtActionplan_sanctionednumber(WebDriver driver){
		element= driver.findElement(By.xpath("//input[@id='workCreationuserWindow_txtActionPlanSanctionNumber']"));
		return element;
	}
	public static WebElement txtTechnical_sanctionnumber(WebDriver driver){
		element= driver.findElement(By.xpath("//input[@id='workCreationuserWindow_txtTechnicalSanctionNumber']"));
		return element;
	}
	public static WebElement txtTechnical_sanctionamount(WebDriver driver){
		element= driver.findElement(By.xpath("//input[@id='workCreationuserWindow_txtTechnicalSanctionAmount']"));
		return element;
	}
	public static WebElement txtNotification_number(WebDriver driver){
		element= driver.findElement(By.xpath("//input[@id='workCreationuserWindow_txtNotificationNumber']"));
		return element;
	}
	public static WebElement txtTender_amount(WebDriver driver){
		element= driver.findElement(By.xpath("//input[@id='workCreationuserWindow_txtAmountPutTender']"));
		return element;
	}
	public static WebElement txtWorkorder_number(WebDriver driver){
		element= driver.findElement(By.xpath("//input[@id='workCreationuserWindow_txtWorkOrderNumber']"));
		return element;
	}
	public static WebElement txtWork_note(WebDriver driver){
		element= driver.findElement(By.xpath("//textarea[@id='workCreationuserWindow_txtNote']"));
		return element;
	}
	
}
