package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Addbutton {
	WebDriver driver;
  @Test
  public void f() {
	  driver.findElement(By.id("jriTop_signin9")).click();
	  driver.findElement(By.id("txtUserName")).sendKeys("rajitha.amraj@gmail.com");
	  driver.findElement(By.id("txtPasswd")).sendKeys("123456");
	  driver.findElement(By.id("imgbtnSignin")).click();
	  driver.findElement(By.xpath("//*[@id='divLnkAddMobile']/a")).click();
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajitha\\Desktop\\Selenium\\Library\\chromedriver.exe");
		driver =  new ChromeDriver();
		driver.get("https://www.justrechargeit.com/");
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
