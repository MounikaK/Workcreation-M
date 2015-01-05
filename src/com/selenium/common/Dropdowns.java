package com.selenium.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dropdowns {
private static WebElement element=null;
	
	public static WebElement work_type(WebDriver driver){
		element= driver.findElement(By.xpath("//table/tbody/tr[3]/td[2]/div[@id='workCreationuserWindow_CmbWorkType_Container']/div/img"));
		element.click();
		return element;
	}
	public static WebElement sanctioned_by(WebDriver driver){
		element= driver.findElement(By.xpath("//table/tbody/tr[4]/td[2]/div[@id='workCreationuserWindow_CmbSanctionedBy_Container']/div/img"));
		element.click();
		return element;
	}
	public static WebElement Authority_desg(WebDriver driver){
		element= driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]/div[@id='workCreationuserWindow_cmbSanctionedAuthorityDesignation_Container']/div/img"));
		element.click();
		return element;
	}
	public static WebElement scheme_under(WebDriver driver){
		element= driver.findElement(By.xpath("//table/tbody/tr[6]/td[2]/div[@id='workCreationuserWindow_cmbSchemeName_Container']/div/img"));
		element.click();
		return element;
	}
	public static WebElement engineer_name(WebDriver driver){
		element= driver.findElement(By.xpath("//table/tbody/tr[8]/td[2]/div[@id='workCreationuserWindow_cmbEngineerName_Container']/div/img"));
		element.click();
		return element;
	}
	public static WebElement contractorbill_workname(WebDriver driver){
		element= driver.findElement(By.xpath("//table[1]/tbody/tr[1]/td[4]/div[@id='contractorBillPreparationuserWindow_cmbWorkName_Container']/div/img"));
		element.click();
		return element;	

}
	public static WebElement Progress_workname(WebDriver driver){
		element= driver.findElement(By.xpath("//table[1]/tbody/tr[1]/td[4]/div[@id='workInProgressuserWindow_cmbWorkName_Container']/div/img"));
		element.click();
		return element;	

}
	public static WebElement Workallocation_workname(WebDriver driver){
		element= driver.findElement(By.xpath("//table/tbody/tr[1]/td[2]/div[@id='workAllotmentuserWindow_cmbWorkName_Container']/div/img"));
		element.click();
		return element;	
		
}
	public static WebElement Secreport_workname(WebDriver driver){
		element= driver.findElement(By.xpath("//table/tbody/tr[1]/td[2]/div[@id='cmbWorkName_Container']/div/img"));
		element.click();
		return element;	
		
}	
}
