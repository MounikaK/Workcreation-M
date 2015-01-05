package  testcases;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.selenium.common.Buttons;
import com.selenium.common.Datepicker;
import com.selenium.common.Dropdowns;
import com.selenium.common.Saveok;
import com.selenium.pageobject.Devmodule;
import com.selenium.pageobject.Workcreation_Ele;
import com.selenium.actions.Signin;

public class Work_creation {
	public static WebDriver driver;
	String Wname="work2";
	WebElement ele;
	int num;
	boolean flag=false;
	@BeforeTest
	  public void wc()throws Exception {	
	 driver= new FirefoxDriver();
	 Signin.Execute(driver, "bidarapmc", "vsspl");
	  driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
	  
	 Devmodule.Work_creation(driver);
	  driver.switchTo().frame("4007_IFrame");
	  //Devmodule.Contractor_bill(driver);
	  //driver.switchTo().frame("4011_IFrame");
	  
	  	  
	 
	}
	@Test(enabled=false)
	public void wc1()throws Exception{
		Buttons.btn_NewRecord(driver);
		//Date picker
	 Thread.sleep(3000);
	 Datepicker.date_icon(driver);
	 Datepicker.monthyear_selection(driver);
	 Datepicker.month_selection(driver);
	 Datepicker.year_selection(driver);
	 Datepicker.ok_button(driver);
	 Datepicker.date_selection(driver);
	 Thread.sleep(1000);
	 Workcreation_Ele.txtwork_name(driver).sendKeys(Wname);
	 Thread.sleep(1000);
	 Dropdowns.work_type(driver);
	 Workcreation_Ele.dropwork_type(driver);
	 Dropdowns.sanctioned_by(driver);
	 Workcreation_Ele.dropSanctioned_By(driver);
	 Dropdowns.Authority_desg(driver);
	 Workcreation_Ele.dropSanctionedAuthority_Designation(driver);
	 Dropdowns.scheme_under(driver);
	 Workcreation_Ele.dropScheme_under(driver);
	 Workcreation_Ele.txtwork_Value(driver).sendKeys("8000000");
	 Dropdowns.engineer_name(driver);
	 Workcreation_Ele.dropEngineer_name(driver);
	 Workcreation_Ele.txtActionplan_sanctionednumber(driver).sendKeys("767523455");
	 Workcreation_Ele.txtWork_note(driver).sendKeys("Work creation Details");
	 Saveok.save_button(driver);
	 Saveok.ok_button(driver);
	 Saveok.close_button(driver);
	 
	 //Print button
	 
	 /*driver.findElement(By.xpath("//button[contains(text(),'Print']")).click();
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
	 driver.findElement(By.xpath("//input[@id='developmentReportsViewer_toptoolbar_search_textField']")).sendKeys("Drainage1");
	 driver.findElement(By.xpath("//img[@id='IconImg_developmentReportsViewer_toptoolbar_search_button']")).click();
	 driver.switchTo().window(Main_Window);*/
	}
		
	
	/*@Test(enabled=false)
	public void wc2()throws Exception{
		String drop="";
		driver.switchTo().defaultContent();
		  Devmodule.Work_allocation(driver);//Devmodule.Work_progress(driver);
		  driver.switchTo().frame("4008_IFrame");//("4009_IFrame");
		  Buttons.btn_NewRecord(driver);
		  Dropdowns.Workallocation_workname(driver);//Dropdowns.		  
		  WebElement Dropdown = driver.findElement(By.xpath("//div[@class='x-combo-list-inner']"));
		   String Dlist=Dropdown.getText();
		   Dropdowns.allocation_workname(driver);
		  	   
		   //System.out.println(Dlist);
		  
		  //Count of the drop down
		  java.util.List<WebElement> count = driver.findElements(By.xpath("//div[@class='x-combo-list-inner']/div"));
		  int num=count.size();
		  System.out.println("Dropdown count is:-- "+num);
		 driver.findElement(By.xpath("//table/tbody/tr[1]/td[2]/div[@id='workAllotmentuserWindow_cmbWorkName_Container']/div/img")).click();
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
	        	System.out.println("Work Name found  : "+drop);	
	        
	        }
	        else{
	        	System.out.println("Work Name Not found  ");	
	        }	       		       		  
		   //verifying the details of created work                            
		  WebElement Work_Type=driver.findElement(By.id("workAllotmentuserWindow_txtWorkValue"));
		 boolean enabled=Work_Type.isEnabled();
	     System.out.println(enabled);	
	
	((JavascriptExecutor) driver).executeScript("document.getElementsByName('workAllotmentuserWindow_txtWorkValue')[0].removeAttribute('disabled');");   
     System.out.println("After ------ "+Work_Type.isEnabled());
     Thread.sleep(2000);
     String str=Work_Type.getAttribute("value");
	System.out.println("text is : "+str);
	}*/
	/*@Test
	public void print()throws Exception{
		Thread.sleep(1000);
		Buttons.btn_print(driver);
		String Parent_Window = driver.getWindowHandle();
		  // Switching from parent window to child window
		 for (String Child_Window : driver.getWindowHandles())
		 {
		 driver.switchTo().window(Child_Window);
		 // Performing actions on child window
		 driver.findElement(By.id("developmentReportsViewer_toptoolbar_search_textField")).sendKeys("Development");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//img[@id='IconImg_developmentReportsViewer_toptoolbar_search_button']")).click();
	}
		 //Switching back to Parent Window
		 driver.switchTo().window(Parent_Window);*/
	@Test(enabled=false)
	public void wc2()throws Exception{
		String drop="";
		driver.switchTo().defaultContent();
		  Devmodule.Work_progress(driver);
		  driver.switchTo().frame("4009_IFrame");
		  Buttons.btn_NewRecord(driver);
		  Dropdowns.Progress_workname(driver);	
		  WebElement Dropdown = driver.findElement(By.xpath("//div[@class='x-combo-list-inner']"));
		   String Dlist=Dropdown.getText();
		   Dropdowns.Progress_workname(driver);
		   	 	  	   
		   //Count of the drop down
		  java.util.List<WebElement> count = driver.findElements(By.xpath("//div[@class='x-combo-list-inner']/div"));
		  int num=count.size();
		  System.out.println("Dropdown count is:-- "+num);
		 Dropdowns.Progress_workname(driver);
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
		  WebElement Work_Type=driver.findElement(By.id("workInProgressuserWindow_txtWorkType"));
		 boolean enabled=Work_Type.isEnabled();
	     System.out.println(enabled);	
	
	((JavascriptExecutor) driver).executeScript("document.getElementsByName('workInProgressuserWindow_txtWorkType')[0].removeAttribute('disabled');");   
     System.out.println("After ------ "+Work_Type.isEnabled());
     Thread.sleep(2000);
     String str=Work_Type.getAttribute("value");
	System.out.println("text is : "+str);
	}
	@Test
	public void SecReport()throws Exception{
		String drop="";
		Devmodule.Reports_module(driver);
		driver.findElement(By.xpath("//a/span[contains(text(),'Development')]")).click();
		driver.switchTo().frame("4064_IFrame");
		driver.findElement(By.xpath("//button[contains(text(),'More')]")).click();
		String Dev_Window = driver.getWindowHandle();
		  // Switching from parent window to child window
		 for (String Report_Window : driver.getWindowHandles())
		 {
		 driver.switchTo().window(Report_Window);
		 // Performing actions on child window
		 Thread.sleep(1000);
		 driver.switchTo().frame("107_IFrame");
		 Dropdowns.Secreport_workname(driver);
		 WebElement Dropdown = driver.findElement(By.xpath("//div[@class='x-combo-list-inner']"));
		   String Dlist=Dropdown.getText();
		   Dropdowns.Secreport_workname(driver);
		  //Count of the drop down
		  java.util.List<WebElement> count = driver.findElements(By.xpath("//div[@class='x-combo-list-inner']/div"));
		  int num=count.size();
		  System.out.println("Dropdown count is:-- "+num);
		  Dropdowns.Secreport_workname(driver);
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
	        	System.out.println(" Work Name found  : " + drop);	
	        
	        }
	        else{
	        	System.out.println(" Work Name Not found  ");	
	        }	       		       		  
	}
		
	}
	}


