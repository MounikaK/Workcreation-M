package com.selenium.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Datepicker {
	private static WebElement element=null;
	
	public static WebElement date_icon(WebDriver driver){
		element= driver.findElement(By.xpath("//table/tbody/tr[1]/td[2]/div[@id='workCreationuserWindow_dtDate_Container']/div/img"));
		element.click();
		return element;
	}
	public static WebElement monthyear_selection(WebDriver driver){
		element=driver.findElement(By.xpath("//td[@class='x-btn-center']/em[@unselectable='on']/button[contains(text(),'December 2014')]"));
		element.click();
		return element;
	}
	public static WebElement month_selection(WebDriver driver){
		element=driver.findElement(By.xpath("//td[@class='x-date-mp-month']/a[contains(text(),'Apr')]"));
		element.click();
		return element;
	}
	public static WebElement year_selection(WebDriver driver){
		element=driver.findElement(By.xpath("//td[@class='x-date-mp-year x-date-mp-sel']/a[contains(text(),'2014')]"));
		element.click();
		return element;
	}
	public static WebElement ok_button(WebDriver driver){
		element=driver.findElement(By.xpath("//button[@class='x-date-mp-ok']"));
		element.click();
		return element;
	}
	public static WebElement date_selection(WebDriver driver){
		element=driver.findElement(By.xpath("//span[contains(text(),'17')]"));
		element.click();
		return element;
	}
		
	public static WebElement actionplan_date(WebDriver driver){
		element =driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[@id='workCreationuserWindow_dtActionPlanSanction_Container']/div/img"));
		element.click();
		return element;
	}
	public static WebElement technical_date(WebDriver driver){
		element =driver.findElement(By.xpath("//tbody/tr[4]/td[2]/div[@id='workCreationuserWindow_dtTechnicalSanctionDate_Container']/div/img"));
		element.click();
		return element;
	}
	public static WebElement notification_date(WebDriver driver){
		element =driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[@id='workCreationuserWindow_dtNotificationDate_Container']/div/img"));
		element.click();
		return element;
	}
	public static WebElement workorder_date(WebDriver driver){
		element =driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[@id='workCreationuserWindow_dtWorkOrderDate_Container']/div/img"));
		element.click();
		return element;
	}
	public static WebElement ok1_button(WebDriver driver){
		element = driver.findElement(By.xpath("//tr/td/button[@id='ext-gen675']"));
		element.click();
		return element;
	}
}


