package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.selenium.actions.Signin;
import com.selenium.pageobject.Devmodule;

public class Printreport {
	public WebDriver driver;
	String Pname = "aaa";
	@BeforeTest
  public void Beforegrid() {
	  driver= new FirefoxDriver();
	  Signin.Execute(driver, "bidarapmc", "vsspl");
	  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS); 
	  Devmodule.Development_module(driver);
	  }
  @Test
  public void Test1() throws Exception {
	  boolean flag=false; 
     Devmodule.Work_creation(driver);
     driver.switchTo().frame("4007_IFrame");
     Thread.sleep(1000);
     driver.findElement(By.xpath("//button[@class='x-btn-text icon-printer']")).click();
   	 Thread.sleep(1000);
   	 driver.getWindowHandle();
   	 Thread.sleep(1000);
   	 String Main_Window = driver.getWindowHandle();
   	 for (String Printreport_Window : driver.getWindowHandles())
   	 {
   	 driver.switchTo().window(Printreport_Window);
   	 driver.manage().window().maximize();
   	 Thread.sleep(1000);
   	 }
   	List<WebElement> PRcount=driver.findElements(By.xpath("//div/div/div/div"));
    int Number=PRcount.size();
    System.out.println("Print report count is : "+Number);
    for (int i=1; i<=Number;i++){
        String Grid = driver.findElement(By.xpath("//div/div/div/div[" + i + "]/table/tbody//tr/td/table/tbody/tr/td/span")).getText();
        if (Grid.equals(Pname)){
        	
             driver.findElement(By.xpath("//div/div/div/div[" + i + "]/table/tbody//tr/td/table/tbody/tr/td/span")).getText();
        	 driver.findElement(By.xpath("//div/div/div/div[" + i + "]/table/tbody//tr/td/table/tbody/tr/td/span")).click();
             System.out.println("Record found in Print report : " +Pname);                     
            flag=true;
            break;
     }       
    
    if (flag) {
        break;
    }
    
     else {
            driver.findElement(By.xpath("//table/tbody/tr/td/div/img[@id='IconImg_developmentReportsViewer_toptoolbar_nextPg']")).click();
    }
    }
if(!flag){
 System.out.println("Record not found in print report : "+Pname);
 }
}

}