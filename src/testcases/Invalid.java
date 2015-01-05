package testcases;

import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.selenium.actions.Signin;
import com.selenium.common.Buttons;
import com.selenium.common.Datepicker;
import com.selenium.common.Dropdowns;
import com.selenium.pageobject.Devmodule;

public class Invalid {
	public static WebDriver driver;
	  @BeforeTest
  public void Iv() throws Exception {
		  driver= new FirefoxDriver();
		  Signin.Execute(driver, "bidarapmc", "vsspl");
			  driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
			  Devmodule.Development_module(driver);
			  Devmodule.Work_creation(driver);
			  driver.switchTo().frame("4007_IFrame");
	  }
	  @Test
	  public void ED() throws Exception{
			  Buttons.btn_EditRecord(driver);
			  String edit=driver.switchTo().alert().getText();
			  System.out.println("The alert text is : " + edit);
			  Thread.sleep(1000);
			  driver.switchTo().alert().accept();
			  Buttons.btn_DeleteRecord(driver);
			  String del=driver.switchTo().alert().getText();
			  System.out.println(" The text is : " + del);
			  Thread.sleep(1000);
			  driver.switchTo().alert().accept();	
			  Buttons.btn_NewRecord(driver);
			  driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
			  String fields=driver.switchTo().alert().getText();
			  System.out.println(" The fields text is : " + fields);
			  Thread.sleep(1000);
			  driver.switchTo().alert().accept();			  
			   
  }@SuppressWarnings("deprecation")
@Test
	  public void duplicate() throws Exception{	  
		  Buttons.btn_NewRecord(driver);
		  Datepicker.date_icon(driver);
			 Datepicker.monthyear_selection(driver);
			 Datepicker.month_selection(driver);
			 Datepicker.year_selection(driver);
			 Datepicker.ok_button(driver);
			 Datepicker.date_selection(driver);
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@id='workCreationuserWindow_txtWorkName']")).sendKeys("eeee");
			 Thread.sleep(1000);
			 Dropdowns.work_type(driver);
			 driver.findElement(By.xpath("//div[@class='x-combo-list-inner']/div[contains(text(),'shop')]")).click();
			 Dropdowns.sanctioned_by(driver);
			 driver.findElement(By.xpath("//div[@class='x-combo-list-inner']/div[contains(text(),'Nirmala  N')]")).click();
			 Dropdowns.Authority_desg(driver);
			 driver.findElement(By.xpath("//div[@class='x-combo-list-inner']/div[contains(text(),'Marketing Supervisor Grade-2')]")).click();
			 Dropdowns.scheme_under(driver);
			 driver.findElement(By.xpath("//div[@class='x-combo-list-inner']/div[contains(text(),'APMC')]")).click();
			 driver.findElement(By.xpath("//input[@id='workCreationuserWindow_txtWorkValue']")).sendKeys("800000");
			 Dropdowns.engineer_name(driver);
			 driver.findElement(By.xpath("//div[@class='x-combo-list-inner']/div[contains(text(),'AEE-Bidar')]")).click();
			 driver.findElement(By.xpath("//input[@id='workCreationuserWindow_txtActionPlanSanctionNumber']")).sendKeys("767523455");
			 driver.findElement(By.xpath("//textarea[@id='workCreationuserWindow_txtNote']")).sendKeys("Work creation Details");
			 driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
			 try{
			    	WebDriverWait Wait = new WebDriverWait(driver,20);
			    	Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='ext-mb-text']")));
			    	
			      	WebElement r = driver.findElement(By.xpath("//span[contains(text(),''This Work name already exists.Please enter another workname'')]"));
				    String str= r.getText();
				    System.out.println(str);
				    Assert.assertEquals("'This Work name already exists.Please enter another workname'",str);
			    }
			    catch (Exception e){
			    	System.out.println("Failed" +e.getMessage());
			    }	    	
			 
		  
	  }
}

