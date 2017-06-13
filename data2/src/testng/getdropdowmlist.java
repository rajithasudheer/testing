package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import corejava.forloop;

public class getdropdowmlist {
	
  @Test
  public void f() {
	  WebDriver driver;
		/*
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajitha\\Desktop\\Selenium\\Library\\chromedriver.exe");
		driver =  new ChromeDriver();*/
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Rajitha\\Desktop\\Selenium\\Library\\FF-64bit\\geckodriver.exe");
		driver = new FirefoxDriver();
		String baseURL = "https://service.mail.com";
		//URL
		driver.get( baseURL);
		driver.findElement(By.id("signup-button")).click();
		//webelement=to store element information and can reuse
		//syntax of webelement:webelement object=driver.finselement(by.id("hj")
		//
		WebElement ele = driver.findElement(By.id("id1f"));
		//want to store the dropdown  values into array
		//get the value from dropdown
		String test1 = ele.getText();
		//System.out.println(test1);
		//spil the months by using\n(new value)
		
		String[]dropdowncount = test1.split("\n");
		for (int i = 0; i < dropdowncount.length; i++) {
			System.out.println(dropdowncount[i]);
			//whether may month is available or not?
			if (dropdowncount[i].equals("usa.com")) {
				System.out.println("usa.com text is available in the list");
			}/*else{
				System.out.println("usa.com is not available in the list");
				
			}
			*/
		}
		
  }
}
