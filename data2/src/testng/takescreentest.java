package testng;

import org.testng.annotations.Test;

import jxl.JXLException;
import jxl.write.WriteException;

import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class takescreentest {
	static WebDriver driver;
	
		public static void getsceernshot(String name) throws IOException {
			//TO GET THE SYSTEM DATE
			  Date d = new Date();
			  System.out.println("Date>>>"+d);
			  //to change the system date format to user define format; eg;dd_mm_yy_hh_mm_ss
			  DateFormat df = new SimpleDateFormat("yyyy_mm_dd_hh_mm_ss");
			  String systime =df.format(d);
			  System.out.println("after the convert date format: "+systime);
			  //TO TAKE SCREEN SHOT USE BELOW CODE
			  String path = "C:\\Users\\Rajitha\\Desktop\\Selenium\\Workspace\\data\\screenshot";
			  File t = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			  FileUtils.copyFile(t, new File(path+name+"_"+systime+".png"));;
			  
		
	}
		public static void main(String[] args) throws JXLException, WriteException, IOException, InterruptedException {

			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajitha\\Desktop\\Selenium\\Library\\chromedriver.exe");
			driver = new ChromeDriver();
			String baseURL =" https://www.irctc.co.in";
			driver.get(baseURL);
			getsceernshot("irctchomepage");
			
			//click login button
			driver.findElement(By.id("loginbutton")).click();
		 Thread.sleep(3000);
		 getsceernshot("alert");
		}

 
	  
	  
  }
 


