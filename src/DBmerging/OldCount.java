package DBmerging;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import com.selenium.actions.Signin_new;
import com.selenium.actions.Signin;
import com.selenium.pageobject.Devmodule;

public class OldCount {
	public static WebDriver driver;
  	 @BeforeTest
			 
  public void Count() throws Exception {
  		 
  	  driver= new FirefoxDriver();
	  Signin.Oldapp(driver, "Koppal", "vsspl");
	  driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);	  
   	  Devmodule.Development_module(driver);
      Devmodule.Work_creation(driver);
      driver.switchTo().frame("4007_IFrame");
      Thread.sleep(1000);
      String PageCount = driver.findElement(By.xpath("//html/body/form/div[2]/div[2]/div[1]/div/div/div/div/div[2]/div[2]/div/div")).getText();
      //System.out.println("The count is : "+PageCount);
      PageCount = PageCount.replace("1-", "");
      Integer PageCount_int = Integer.parseInt(PageCount);
      System.out.println(PageCount_int);
  }
@Test(enabled=false)
public void Newcount()throws Exception{
	driver= new FirefoxDriver();
	Signin.Newapp(driver, "koppal", "vsspl");
	driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);	  
 	  Devmodule.Development_module(driver);
    Devmodule.Work_creation(driver);
    driver.switchTo().frame("4007_IFrame");
    Thread.sleep(1000);
    String PageCount = driver.findElement(By.xpath("//html/body/form/div[2]/div[2]/div[1]/div/div/div/div/div[2]/div[2]/div/div")).getText();
    //System.out.println("The count is : "+PageCount);
    PageCount = PageCount.replace("1-", "");
    Integer PageCount_int = Integer.parseInt(PageCount);
    System.out.println(PageCount_int);
	/*driver.getWindowHandle();
	 Thread.sleep(1000);
	 String Old_Window = driver.getWindowHandle();
	 for (String New_Window : driver.getWindowHandles())
	 {
	 driver.switchTo().window(New_Window);
	 driver.manage().window().maximize();
	 Thread.sleep(1000);*/
	 }
	 

}
