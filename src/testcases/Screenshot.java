package testcases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.sun.jna.platform.FileUtils;

public class Screenshot {
	public static WebDriver driver;
	String apmc;

  @Test
  public void Login()throws IOException {
	    try{
	      driver= new FirefoxDriver();
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      driver.get("http://192.168.1.124:85");
	      String apmcName = "bidarapmc";
	      String [] apmcArray = apmcName.split("apmc");
	      System.out.println(apmcArray[0]);
	      apmc = apmcArray[0];
	      driver.findElement(By.xpath("//input [@id='txtUsername']")).sendKeys(apmcName);
	      driver.findElement(By.xpath ("//input [@id='txtPassword']")).sendKeys("vsspl");
	      driver.findElement (By.xpath("//button [@id='ext-gen16']")).click();
	    } catch (Exception e){
	        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
	        FileUtils.copyFile(scrFile, new File("/home/mounika/Desktop/2.png")); 
	  }
  }
}


