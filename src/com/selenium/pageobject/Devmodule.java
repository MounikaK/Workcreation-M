package com.selenium.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Devmodule {
    public static WebElement element=null;
    private static WebDriver driver;
        
    //Clicking on Development module
    public static WebElement Development_module(WebDriver driver){
		element= driver.findElement(By.xpath("//div/div/div/span[contains(text(),'Development')]"));
		element.click();
		return element;
	}
    //Clicking on Work creation screen
    public static WebElement Work_creation(WebDriver driver){
        element= driver.findElement(By.xpath("//a/span[contains(text(),'Work Creation')]"));
        element.click();
        return element;
    }
    //Clicking on Work allocation screen
    public static WebElement Work_allocation(WebDriver driver){
        element= driver.findElement(By.xpath("//a/span[contains(text(),'Work Allocation')]"));
        element.click();
        return element;
    }
  //Clicking on Work Progress screen
    public static WebElement Work_progress(WebDriver driver){
        element= driver.findElement(By.xpath("//a/span[contains(text(),'Work Progress')]"));
        element.click();
        return element;
    }
  //Clicking on Manage contractor screen
    public static WebElement Manage_contractor(WebDriver driver){
        element= driver.findElement(By.xpath("//a/span[contains(text(),'Manage Contractor')]"));
        element.click();
        return element;
    }
  //Clicking on Contractor bill preparation screen
    public static WebElement Contractor_bill(WebDriver driver){
        element= driver.findElement(By.xpath("//a/span[contains(text(),'Contractor Bill Preparation')]"));
        element.click();
        return element;
    }
  //Clicking on Yard Maintenance screen
    public static WebElement Yard_maintenance(WebDriver driver){
        element= driver.findElement(By.xpath("//a/span[contains(text(),'Yard Maintenance')]"));
        element.click();
        return element;
    }
    public static WebElement Reports_module(WebDriver driver){
        element= driver.findElement(By.xpath("//span[contains(text(),'Reports')]"));
        element.click();
        return element;
    }
}


