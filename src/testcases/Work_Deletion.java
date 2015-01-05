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
import com.selenium.common.Buttons;
import com.selenium.common.Saveok;
import com.selenium.pageobject.Devmodule;

public class Work_Deletion {
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
	}
  @Test
  public void WD() throws Exception{
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
              	 Buttons.btn_DeleteRecord(driver);
              	driver.switchTo().alert().accept();
              	Thread.sleep(1000);
              	Saveok.ok_button(driver);
              	Thread.sleep(1000);
              	 
              	 /*driver.getWindowHandle();
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
              	 driver.switchTo().window(Main_Window);*/
              	
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
}