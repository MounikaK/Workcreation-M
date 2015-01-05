package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.selenium.actions.Signin;
import com.selenium.common.Buttons;
import com.selenium.common.Dropdowns;
import com.selenium.common.Saveok;
import com.selenium.pageobject.Devmodule;

public class Work_updation {
		public static WebDriver driver;
		String Wname="fgf";
		WebElement ele;
		int num;
		boolean flag=false;
		@BeforeTest
		  public void wc()throws Exception {	
		 driver= new FirefoxDriver();
		 Signin.Execute(driver, "bidarapmc", "vsspl");
		  driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		  
		  
		  
		}
  @Test
	public void wu1()throws Exception{
	  Devmodule.Development_module(driver);
	  Devmodule.Work_creation(driver);
	  driver.switchTo().frame("4007_IFrame");
      Thread.sleep(1000);
      driver.findElement(By.xpath("//table/tbody/tr/td[2]/em/button[@class='x-btn-text x-tbar-loading']")).click();
      Thread.sleep(1000);
      String PageCount = driver.findElement(By.xpath("//table/tbody/tr/td[6]/span")).getText();
      //System.out.println(PageCount);
      PageCount = PageCount.replace("of ", "");
      Integer PageCount_int = Integer.parseInt(PageCount);
      Thread.sleep(1000);
      String Web=driver.findElement(By.xpath("//div[@class='x-grid3-body']/div")).getText();
      //System.out.println(W);
      for(int  i=1; i<=PageCount_int;i++){
          List<WebElement> gridcount=driver.findElements(By.xpath("//div[@class='x-grid3-body']/div"));
          int Number=gridcount.size();
          System.out.println("Grid count is : "+Number);
          for (int j=1; j<=Number;j++){
              String Grid = driver.findElement(By.xpath("//div[@class='x-grid3-body']/div[" + j + "]/table/tbody/tr/td[3]/div")).getText();
              if (Grid.equals(Wname)){
                   driver.findElement(By.xpath("//div[@class='x-grid3-body']/div[" + j + "]/table/tbody/tr/td[3]/div")).getText();
              	 driver.findElement(By.xpath("//div[@class='x-grid3-body']/div[" + j + "]/table/tbody/tr/td[3]/div")).click();
              	 System.out.println("Record found in the grid: " +Wname);
              	 /*Thread.sleep(1000);
              	 Buttons.btn_EditRecord(driver);
              	driver.findElement(By.xpath("//input[@id='workCreationuserWindow_txtWorkName']")).clear();
              	driver.findElement(By.xpath("//input[@id='workCreationuserWindow_txtWorkName']")).sendKeys("Work-10");
              	Thread.sleep(1000);
           	 Dropdowns.work_type(driver);
           	 driver.findElement(By.xpath("//div[@class='x-combo-list-inner']/div[contains(text(),'shop')]")).click();
           	driver.findElement(By.xpath("//input[@id='workCreationuserWindow_txtWorkValue']")).clear();
           	driver.findElement(By.xpath("//input[@id='workCreationuserWindow_txtWorkValue']")).sendKeys("800000");
           	Saveok.save_button(driver);
       	    Saveok.ok_button(driver);
       	    Saveok.close_button(driver);*/
       	    //Print Report
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
       	 Thread.sleep(3000);
       	 }
       	 driver.findElement(By.xpath("//input[@id='developmentReportsViewer_toptoolbar_search_textField']")).sendKeys(Wname);
       	 driver.findElement(By.xpath("//img[@id='IconImg_developmentReportsViewer_toptoolbar_search_button']")).click();
       	 Thread.sleep(4000);
       	 driver.switchTo().window(Main_Window);
       	
                  flag=true;
                  break;
          }       
          }
          if (flag) {

              break;
          }

           else {
                  driver.findElement(By.xpath("//tbody/tr/td[@class='x-btn-center']/em/button[@class='x-btn-text x-tbar-page-next']")).click();
          }
      }
  if(!flag){
       System.out.println("Work name not found : "+Wname);
       }
	  
  }
  @Test(enabled=false)
	public void wc2()throws Exception{
	  String drop="";
		driver.switchTo().defaultContent();
		  Devmodule.Work_allocation(driver);
		  driver.switchTo().frame("4008_IFrame");
		  Buttons.btn_NewRecord(driver);
		  Dropdowns.Workallocation_workname(driver);	
		  WebElement Dropdown = driver.findElement(By.xpath("//div[@class='x-combo-list-inner']"));
		   String Dlist=Dropdown.getText();
		   Dropdowns.Workallocation_workname(driver);
		   	 	  	   
		   //Count of the drop down
		  java.util.List<WebElement> count = driver.findElements(By.xpath("//div[@class='x-combo-list-inner']/div"));
		  int num=count.size();
		  System.out.println("Dropdown count is:-- "+num);
		 Dropdowns.Workallocation_workname(driver);
		  Thread.sleep(1000);
		  //Finding the workname
		  
		  for(int i=1;i<=num;i++){
			    drop = driver.findElement(By.xpath("//div[@class='x-combo-list-inner']/div["+i+"]")).getText();
		        if(drop.equals(Wname)){
		        	
		      driver.findElement(By.xpath("//div[@class='x-combo-list-inner']/div["+i+"]")).getText();
		    		
		        driver.findElement(By.xpath("//div[@class='x-combo-list-inner']/div["+i+"]")).click();
		        	flag=true;
		        	break;
		        }  
		           		 
		  }
		  if(flag){
	        	System.out.println("Identified Work Name : "+drop);	
	        
	        }
	        else{
	        	System.out.println("Work Name Not found  ");	
	        }	       		       		  
	  //verifying the details of created work                            
		  WebElement Work_Type=driver.findElement(By.id("workAllotmentuserWindow_txtWorkType"));
		 boolean enabled=Work_Type.isEnabled();
	     System.out.println(enabled);	
	
	((JavascriptExecutor) driver).executeScript("document.getElementsByName('workAllotmentuserWindow_txtWorkType')[0].removeAttribute('disabled');");   
   System.out.println("After ------ "+Work_Type.isEnabled());
   Thread.sleep(2000);
   String str=Work_Type.getAttribute("value");
	System.out.println("text is : "+str);
	}
	}



