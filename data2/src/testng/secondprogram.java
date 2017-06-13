package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class secondprogram {
	WebDriver driver;
	
  @Test//actual method
  public void FB_login() {
	  driver.findElement(By.id("email")).sendKeys("rajitha");
	  driver.findElement(By.id("pass")).sendKeys("123456");
	  driver.findElement(By.id("loginbutton")).click();
  }
  @BeforeClass//precondition
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajitha\\Desktop\\Selenium\\Library\\chromedriver.exe");
		driver =  new ChromeDriver();
		driver.get("https://www.facebook.com/");
  }

  @AfterClass//past condition
  public void afterClass() {
	  driver.close();
  }

}
